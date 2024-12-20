package hust.soict.hedspi.aims.screen;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;
import hust.soict.hedspi.aims.store.Store;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;



public class CartScreenController {

    private Cart cart;
    private Store store;

    @FXML
    private TableView<Media> tblMedia;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediacategory;

    @FXML
    private TableColumn<Media, Float>  colMediaCost;

    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;

    @FXML
    private Label totalcost;

    public CartScreenController(Cart cart, Store store) {
        super();
        this.cart = cart;
        this.store = store;
    }

    @FXML
    private void initialize() {
        colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
        colMediacategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
        tblMedia.setItems(this.cart.getItemsOrdered());
        totalcost.setText(cart.totalCost() + "$");

        btnPlay.setVisible(false);
        btnRemove.setVisible(false);

        tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>() {
            @Override
            public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
                if(newValue != null) {
                    updateButtonBar(newValue);
                }
            }
        });
    }

    void updateButtonBar(Media media) {
        btnRemove.setVisible(true);
        if(media instanceof Playable){
            btnPlay.setVisible(true);
        }else{
            btnPlay.setVisible(false);
        }
    }

    @FXML
    void btnRemovePressed(ActionEvent event) {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media);
        totalcost.setText(cart.totalCost() + "$");
    }

    @FXML
    private void btnPlayPressed(ActionEvent event) {
        Media selectedMedia = tblMedia.getSelectionModel().getSelectedItem();
        if (selectedMedia instanceof Playable) {
            Playable playableMedia = (Playable) selectedMedia;

            // Tạo cửa sổ pop-up hiển thị thông tin
            Stage popupStage = new Stage();
            popupStage.initModality(Modality.APPLICATION_MODAL); // Ngừng tương tác với cửa sổ chính
            popupStage.setTitle("Playing " + selectedMedia.getTitle());

            Label lblInfor = new Label(((Playable) selectedMedia).play());

            Button btnCancel = new Button("Cancel");
            btnCancel.setOnAction(e -> {
                // Đóng cửa sổ popup nếu người dùng không muốn đặt hàng
                popupStage.close();
            });

            VBox vbox = new VBox(10, lblInfor,btnCancel);
            vbox.setPadding(new Insets(20));

            // Tạo và thiết lập cảnh cho cửa sổ popup
            Scene popupScene = new Scene(vbox, 300, 200);
            popupStage.setScene(popupScene);
            popupStage.show();
        }
    }

    @FXML
    private void handlePlaceOrder(ActionEvent event) {
        // Tạo cửa sổ pop-up (mới)
        Stage popupStage = new Stage();
        popupStage.initModality(Modality.APPLICATION_MODAL); // Ngừng tương tác với cửa sổ chính
        popupStage.setTitle("Order Details");

        // Tạo các thông tin đơn hàng
        Label lblOrderDetails = new Label("Total Cost :\n\n" + cart.totalCost());

        Button btnConfirm = new Button("Confirm");
        btnConfirm.setOnAction(e -> {
            // Xử lý đặt hàng: Hiển thị thông báo thành công
            lblOrderDetails.setText("Order Placed Successfully!");
            cart.placeOrder();

            ((VBox) popupStage.getScene().getRoot()).getChildren().remove(btnConfirm);
        });

        // Nút hủy
        Button btnCancel = new Button("Cancel");
        btnCancel.setOnAction(e -> {
            // Đóng cửa sổ popup nếu người dùng không muốn đặt hàng
            popupStage.close();
        });

        // Đặt các nút vào VBox
        VBox vbox = new VBox(10, lblOrderDetails, btnConfirm, btnCancel);
        vbox.setPadding(new Insets(20));

        // Tạo và thiết lập cảnh cho cửa sổ popup
        Scene popupScene = new Scene(vbox, 300, 200);
        popupStage.setScene(popupScene);
        popupStage.show();
    }

    @FXML
    private void viewStore(ActionEvent event) {
        // Tạo và hiển thị StoreScreen
        StoreScreen storeScreen = new StoreScreen(store, cart);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.close();  // Đóng cửa sổ hiện tại (CartScreen)
    }


}
