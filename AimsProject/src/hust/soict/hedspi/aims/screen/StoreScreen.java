package hust.soict.hedspi.aims.screen;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StoreScreen extends JFrame {
    private Store store;
    private Cart cart;

    public StoreScreen(Store store, Cart cart) {
        this.store = store;
        this.cart = cart;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);
    }

    JPanel createNorth(){
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar(){
        JMenu menu = new JMenu("Options");

        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem addBook = new JMenuItem("Add Book");
        JMenuItem addCD = new JMenuItem("Add CD");
        JMenuItem addDVD = new JMenuItem("Add DVD");
        addBook.addActionListener(e -> {
            new AddBook();
        });

        smUpdateStore.add(addBook);
        smUpdateStore.add(addCD);
        smUpdateStore.add(addDVD);

        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View store"));
        menu.add(new JMenuItem("View cart"));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    JPanel createHeader(){
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        JButton cart = new JButton("View cart");
        cart.setPreferredSize(new Dimension(100, 50));
        cart.setMaximumSize(new Dimension(100, 50));

        cart.addActionListener(e -> {
            new CartScreen(this.cart, this.store); // Hiển thị CartScreen
            this.dispose(); // Đóng StoreScreen nếu cần
        });

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart);
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    JPanel createCenter(){
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(5,3,2,2));
        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for(int i = 0; i < mediaInStore.size(); i++){
            MediaStore cell = new MediaStore(mediaInStore.get(i), this.cart);
            center.add(cell);
        }
        return center;
    }



//    public static void main(String[] args) {
//        Store store = new Store();
//        Cart cart = new Cart();
//
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 121, 24.95f);
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Guy Ritchie", 89, 18.99f);
//        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avengers: Endgame", "Action", "Anthony Russo", 181, 29.99f);
//        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 102, 21.99f);
//        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Jurassic Park", "Science Fiction", "Steven Spielberg", 127, 22.50f);
//
//        store.addMedia(dvd1);
//        store.addMedia(dvd2);
//        store.addMedia(dvd3);
//        store.addMedia(dvd4);
//        store.addMedia(dvd5);
//        store.addMedia(dvd6);
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
//        store.addMedia(cd1);
//        store.addMedia(cd2);
//
//        Book book1 = new Book("Hannibal", "Crime Thriller", 8.99f, new ArrayList<>());
//        book1.addAuthor("Thomas Harris");
//        store.addMedia(book1);
//
//        new StoreScreen(store, cart);
//    }
}
