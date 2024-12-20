package hust.soict.hedspi.aims.screen;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.store.Store;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javax.swing.*;
import java.io.IOException;

public class CartScreen extends JFrame {
    private Cart cart;
    private Store store;

    public CartScreen(Cart cart , Store store) {
        super();
        this.cart = cart;
        this.store = store;

        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);
        this.setSize(1024, 768);
        this.setResizable(true);

        this.setTitle("Cart");
        this.setVisible(true);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try{
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("cart.fxml"));
                    CartScreenController controller = new CartScreenController(cart, store);
                    loader.setController(controller);
                    Parent root = loader.load();
                    fxPanel.setScene(new Scene(root));
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        });
    }

//    public static void main(String[] args) {
//        Cart cart = new Cart();
//        Store store = new Store();
//
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 121, 24.95f);
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Guy Ritchie", 89, 18.99f);
//        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avengers: Endgame", "Action", "Anthony Russo", 181, 29.99f);
//        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 102, 21.99f);
//        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Jurassic Park", "Science Fiction", "Steven Spielberg", 127, 22.50f);
//
//        cart.addMedia(dvd1);
//        cart.addMedia(dvd2);
//        cart.addMedia(dvd3);
//        cart.addMedia(dvd4);
//        cart.addMedia(dvd5);
//        cart.addMedia(dvd6);
//
//        CompactDisc cd1 = new CompactDisc("Michael Jackson", "Thriller", "Pop", 9.99f, "Quincy Jones", new ArrayList<>());
//        cd1.addTrack(new Track("Billie Jean", 236));
//        cd1.addTrack(new Track("Beat It", 252));
//        cd1.addTrack(new Track("Thriller", 358));
//        cd1.addTrack(new Track("The Girl Is Mine", 217));
//        cd1.addTrack(new Track("Wanna Be Startin' Somethin'", 362));
//
//        CompactDisc cd2 = new CompactDisc("The Beatles", "Abbey Road", "Rock", 11.99f, "George Martin", new ArrayList<>());
//        cd2.addTrack(new Track("Come Together", 259));
//        cd2.addTrack(new Track("Something", 183));
//        cd2.addTrack(new Track("Here Comes The Sun", 185));
//        cd2.addTrack(new Track("Octopus's Garden", 175));
//        cd2.addTrack(new Track("I Want You", 467));
//
//        cart.addMedia(cd1);
//        cart.addMedia(cd2);
//
//        Book book1 = new Book("Hannibal", "Crime Thriller", 8.99f, new ArrayList<>());
//        book1.addAuthor("Thomas Harris");
//        cart.addMedia(book1);
//
//        new CartScreen(cart, store);
//    }

}
