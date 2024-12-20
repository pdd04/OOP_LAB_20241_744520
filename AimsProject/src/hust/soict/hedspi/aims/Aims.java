package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.screen.CartScreen;
import hust.soict.hedspi.aims.screen.StoreScreen;
import hust.soict.hedspi.aims.store.Store;

import java.util.ArrayList;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static CartScreen cartScreen;
    private static StoreScreen storeScreen;


public static void main(String[] args) {
    Store();
//    showMenu();
    new StoreScreen(store, cart);
}

public static Store getStore(){
    return store;
}

public Cart getCart(){
    return cart;
}

public static void openStoreScreen() {
    storeScreen = new StoreScreen(store, cart);
}

public static void closeStoreScreen() {
    storeScreen.setVisible(false);
    storeScreen = null;
}


public static void Store(){
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 121, 24.95f);
    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Guy Ritchie", 89, 18.99f);
    DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avengers: Endgame", "Action", "Anthony Russo", 181, 29.99f);
    DigitalVideoDisc dvd5 = new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 102, 21.99f);
    DigitalVideoDisc dvd6 = new DigitalVideoDisc("Jurassic Park", "Science Fiction", "Steven Spielberg", 127, 22.50f);

    store.addMedia(dvd1);
    store.addMedia(dvd2);
    store.addMedia(dvd3);
    store.addMedia(dvd4);
    store.addMedia(dvd5);
    store.addMedia(dvd6);

    CompactDisc cd1 = new CompactDisc("Michael Jackson", "Thriller", "Pop", 9.99f, "Quincy Jones", new ArrayList<>());
    cd1.addTrack(new Track("Billie Jean", 236));
    cd1.addTrack(new Track("Beat It", 252));
    cd1.addTrack(new Track("Thriller", 358));
    cd1.addTrack(new Track("The Girl Is Mine", 217));
    cd1.addTrack(new Track("Wanna Be Startin' Somethin'", 362));

    CompactDisc cd2 = new CompactDisc("The Beatles", "Abbey Road", "Rock", 11.99f, "George Martin", new ArrayList<>());
    cd2.addTrack(new Track("Come Together", 259));
    cd2.addTrack(new Track("Something", 183));
    cd2.addTrack(new Track("Here Comes The Sun", 185));
    cd2.addTrack(new Track("Octopus's Garden", 175));
    cd2.addTrack(new Track("I Want You", 467));

    CompactDisc cd3 = new CompactDisc("Adele", "25", "Pop", 10.99f, "Greg Kurstin", new ArrayList<>());
    cd3.addTrack(new Track("Hello", 295));
    cd3.addTrack(new Track("When We Were Young", 292));
    cd3.addTrack(new Track("Water Under the Bridge", 240));
    cd3.addTrack(new Track("Send My Love", 223));
    cd3.addTrack(new Track("All I Ask", 273));

    CompactDisc cd4 = new CompactDisc("Queen", "A Night at the Opera", "Rock", 13.50f, "Roy Thomas Baker", new ArrayList<>());
    cd4.addTrack(new Track("Bohemian Rhapsody", 354));
    cd4.addTrack(new Track("You're My Best Friend", 203));
    cd4.addTrack(new Track("39", 211));
    cd4.addTrack(new Track("Love of My Life", 217));
    cd4.addTrack(new Track("Death on Two Legs", 180));

    CompactDisc cd5 = new CompactDisc("Taylor Swift", "1989", "Pop", 12.99f, "Max Martin", new ArrayList<>());
    cd5.addTrack(new Track("Shake It Off", 242));
    cd5.addTrack(new Track("Blank Space", 231));
    cd5.addTrack(new Track("Style", 230));
    cd5.addTrack(new Track("Wildest Dreams", 225));
    cd5.addTrack(new Track("Bad Blood", 211));

    CompactDisc cd6 = new CompactDisc("Ed Sheeran", "Divide", "Pop", 14.99f, "Benny Blanco", new ArrayList<>());
    cd6.addTrack(new Track("Shape of You", 234));
    cd6.addTrack(new Track("Castle on the Hill", 261));
    cd6.addTrack(new Track("Perfect", 263));
    cd6.addTrack(new Track("Galway Girl", 170));
    cd6.addTrack(new Track("Happier", 207));

    store.addMedia(cd1);
    store.addMedia(cd2);
    store.addMedia(cd3);
    store.addMedia(cd4);
    store.addMedia(cd5);
    store.addMedia(cd6);

    Book book1 = new Book("Hannibal", "Crime Thriller", 8.99f, new ArrayList<>());
    book1.addAuthor("Thomas Harris");

    Book book2 = new Book("Red Dragon", "Crime Thriller", 9.11f, new ArrayList<>());
    book2.addAuthor("Thomas Harris");

    Book book3 = new Book("The Martian", "Science Fiction", 8.97f, new ArrayList<>());
    book3.addAuthor("Andy Weir");

    Book book4 = new Book("Sapiens", "History", 15.99f, new ArrayList<>());
    book4.addAuthor("Yuval Noah Harari");

    Book book5 = new Book("Harry Potter and the Sorcerer's Stone", "Fantasy", 12.99f, new ArrayList<>());
    book5.addAuthor("J.K. Rowling");

    Book book6 = new Book("Good Omens", "Fantasy", 10.99f, new ArrayList<>());
    book6.addAuthor("Neil Gaiman");
    book6.addAuthor("Terry Pratchett");

    store.addMedia(book1);
    store.addMedia(book2);
    store.addMedia(book3);
    store.addMedia(book4);
    store.addMedia(book5);
    store.addMedia(book6);
}

//public static void showMenu(){
//    Scanner sc = new Scanner(System.in);
//    while(true) {
//        System.out.println("AIMS:");
//        System.out.println("----------------------------");
//        System.out.println("1. View store");
//        System.out.println("2. Update store");
//        System.out.println("3. See current cart");
//        System.out.println("0. Exit");
//        System.out.println("----------------------------");
//        System.out.print("Enter your choice: ");
//
//        String option = sc.nextLine();
//        switch (option) {
//            case "0":
//                System.out.println("Thank you! Goodbye.");
//                sc.close();
//                return;
//
//            case "1":
//                store.print();
//                storeMenu();
//                break;
//
//            case "2":
////            updateStore();
//                break;
//
//            case "3":
//                cart.print();
//                cartMenu();
//                break;
//
//            default:
//                System.out.println("Invalid option, please choose a number: 0-1-2-3.");
//                break;
//        }
//    }
//}
//
//public static void storeMenu() {
//    boolean back = false;
//    Scanner sc = new Scanner(System.in);
//    while (!back) {
//        System.out.println("Options:");
//        System.out.println("----------------------------");
//        System.out.println("1. See a media's details");
//        System.out.println("2. Add a media to cart");
//        System.out.println("3. Play a media");
//        System.out.println("4. See current cart");
//        System.out.println("0. Back");
//        System.out.println("----------------------------");
//        System.out.print("Enter your choice: ");
//
//        String option = sc.nextLine();
//        switch (option) {
//            case "0":
//                back = true;
//                break;
//
//            case "1":
//                while (true) {
//                    System.out.print("Enter the title of the media to view details (Press 0 to return): ");
//                    String title = sc.nextLine();
//                    if (title.equals("0")) break;
//                    Media foundMedia = store.searchByTitle(title);
//                    if (foundMedia == null) System.out.println(title + " is not in the store. Please try another.");
//                    else {
//                        System.out.println("Details: " + foundMedia.toString());
//                        mediaDetailsMenu(foundMedia);
//                    }
//                }
//                break;
//
//            case "2":
//                while (true) {
//                    System.out.print("Enter the title of the media to add to cart (Press 0 to return): ");
//                    String title = sc.nextLine();
//                    if (title.equals("0")) break;
//                    Media foundMedia = store.searchByTitle(title);
//                    if (foundMedia == null) System.out.println(title + " is not in the store. Please try another.");
//                    else cart.addMedia(foundMedia);
//                }
//                break;
//
//            case "3":
//                while (true) {
//                    System.out.print("Enter the title of the media to play (Press 0 to return): ");
//                    String title = sc.nextLine();
//                    if (title.equals("0")) break;
//                    Media foundMedia = store.searchByTitle(title);
//                    if (foundMedia == null) System.out.println(title + " is not in the store. Please try another.");
//                    else {
//                        if (foundMedia instanceof CompactDisc) {
//                            CompactDisc mediaCD = (CompactDisc) foundMedia;
//                            mediaCD.play();
//                        } else if (foundMedia instanceof DigitalVideoDisc) {
//                            DigitalVideoDisc mediaDVD = (DigitalVideoDisc) foundMedia;
//                            mediaDVD.play();
//                        } else System.out.println(foundMedia.getTitle() + " cannot be played! Please try another.");
//                    }
//                }
//                break;
//
//            case "4":
//                cart.print();
//                cartMenu();
//                break;
//
//            default:
//                System.out.println("Invalid option. Please choose a number: 0-1-2-3-4.");
//                break;
//        }
//    }
//}
//
//public static void mediaDetailsMenu(Media media) {
//    Scanner scanner = new Scanner(System.in);
//
//    boolean back = false;
//    while (!back) {
//        System.out.println("Options:");
//        System.out.println("----------------------------");
//        System.out.println("1. Add to cart");
//        System.out.println("2. Play");
//        System.out.println("0. Back");
//        System.out.println("----------------------------");
//        System.out.print("Enter your choice: ");
//        String option = scanner.nextLine();
//        switch (option) {
//            case "0":
//                back = true;
//                break;
//
//            case "1":
//                cart.addMedia(media);
//                break;
//
//            case "2":
//                if (media instanceof CompactDisc) {
//                    CompactDisc mediaCD = (CompactDisc) media;
//                    mediaCD.play();
//                } else if (media instanceof DigitalVideoDisc) {
//                    DigitalVideoDisc mediaDVD = (DigitalVideoDisc) media;
//                    mediaDVD.play();
//                } else System.out.println(media.getTitle() + " cannot be played! Please try another.");
//                break;
//
//            default:
//                System.out.println("Invalid option");
//                break;
//        }
//    }
//}
//
//public static void cartMenu() {
//    Scanner scanner = new Scanner(System.in);
//
//    boolean back = false;
//    while (!back) {
//        System.out.println("Options:");
//        System.out.println("----------------------------");
//        System.out.println("1. Filter medias in cart");
//        System.out.println("2. Sort medias in cart");
//        System.out.println("3. Remove a media from cart");
//        System.out.println("4. Play a media");
//        System.out.println("5. Place order");
//        System.out.println("0. Back");
//        System.out.println("----------------------------");
//        System.out.print("Enter your choice: ");
//        String option = scanner.nextLine();
//        switch (option) {
//            case "0":
//                back = true;
//                break;
//
//            case "1":
//                System.out.println("Filter by:\n(1) Title\n(2) Id\n");
//                int filterOption = scanner.nextInt();
//                scanner.nextLine();
//                while (true) {
//                    Media foundMedia = null;
//                    if (filterOption == 1) {
//                        System.out.print("Enter the title of the media to filter (press 0 to stop): ");
//                        String title = scanner.nextLine();
//                        if (title.equals("0")) break;
//                        foundMedia = cart.searchByTitle(title);
//                    } else if (filterOption == 2) {
//                        System.out.print("Enter the ID of the media to filter (press 0 to stop): ");
//                        int id = scanner.nextInt();
//                        if (id == 0) break;
//                        foundMedia = cart.searchById(id);
//                    } else {
//                        System.out.println("Invalid Input.");
//                    }
//
//                    if (foundMedia == null) {
//                        System.out.println("There is no matched items in your cart.");
//                    } else {
//                        if (filterOption == 1) System.out.println("Result: " + foundMedia.toString());
//                        else if (filterOption == 2) System.out.println("Result: " + foundMedia.toString());
//                    }
//                }
//                break;
//
//            case "2":
//                System.out.println("Sort medias in cart by:\n (1) title \n (2) cost");
//                int sortOption = scanner.nextInt();
//                scanner.nextLine();
//                if (sortOption == 1) cart.sortByTitle();
//                else if (sortOption == 2) cart.sortByCost();
//                else System.out.println("Invalid option.");
//                break;
//
//            case "3":
//                while (true) {
//                    System.out.print("Enter the title of the media to remove from cart (Press 0 to return): ");
//                    String title = scanner.nextLine();
//                    if (title.equals("0")) break;
//                    Media foundMedia = cart.searchByTitle(title);
//                    if (foundMedia == null) System.out.println(title + " is not in the cart. Please try another.");
//                    else {
//                        cart.removeMedia(foundMedia);
//                        System.out.println(title + " has been successfully removed from the cart.");
//                        System.out.println("Current cart: ");
//                        cart.print();
//                    }
//                }
//                break;
//
//            case "4":
//                while (true) {
//                    System.out.print("Enter the title of the media to play (Press 0 to return): ");
//                    String title = scanner.nextLine();
//                    if (title.equals("0")) break;
//                    Media foundMedia = cart.searchByTitle(title);
//                    if (foundMedia == null) System.out.println(title + " is not in the cart. Please try another.");
//                    else {
//                        if (foundMedia instanceof CompactDisc) {
//                            CompactDisc mediaCD = (CompactDisc) foundMedia;
//                            mediaCD.play();
//                        } else if (foundMedia instanceof DigitalVideoDisc) {
//                            DigitalVideoDisc mediaDVD = (DigitalVideoDisc) foundMedia;
//                            mediaDVD.play();
//                        } else System.out.println(foundMedia.getTitle() + " cannot be played! Please try another.");
//                    }
//                }
//                break;
//
//            case "5":
//                System.out.println("The order has successfully created.\nYour cart is now empty.");
//                cart.empty();
//                break;
//
//            default:
//                System.out.println("Invalid option. Please choose a number: 0-1-2-3-4-5.");
//                break;
//        }
//    }
//}
//    public static void updateStore() {
//        Scanner scanner = new Scanner(System.in);
//
//        boolean back = false;
//        while (!back) {
//            System.out.println("Options: ");
//            System.out.println("--------------------------------");
//            System.out.println("1. Add a media");
//            System.out.println("2. Remove a media");
//            System.out.println("0. Back");
//            System.out.println("--------------------------------");
//            System.out.println("Please choose a number: 0-1-2");
//            String option = scanner.nextLine();
//            switch (option) {
//                case "0":
//                    back = true;
//                    break;
//
//                case "1":
//                    boolean back1 = false;
//                    while (!back1) {
//                        System.out.println("Enter the category of the media:\n(1) Book\n(2) CD\n(3) DVD\n(0) Back");
//                        String choice = scanner.nextLine();
//                        switch (choice) {
//                            case "0":
//                                back1 = true;
//                                break;
//
//                            case "1":
//                                System.out.println("Enter the title of the book: ");
//                                String bookTitle = scanner.nextLine();
//                                System.out.println("Enter the category of the book: ");
//                                String bookCategory = scanner.nextLine();
//                                System.out.println("Enter the cost of the book: ");
//                                float bookCost = scanner.nextFloat();
//                                scanner.nextLine();
//
//                                Book book = new Book(bookTitle, bookCategory, bookCost);
//                                System.out.println("Enter the (List of) author(s) of the book (Press 0 to stop): ");
//                                while (true) {
//                                    String bookAuthor = scanner.nextLine();
//                                    if (bookAuthor.equals("0")) break;
//                                    book.addAuthor(bookAuthor);
//                                }
//                                store.addMedia(book);
//                                System.out.println("\nCurrent store: ");
//                                store.print();
//                                System.out.println();
//                                break;
//
//                            case "2":
//                                System.out.println("Enter the title of the CD: ");
//                                String cdTitle = scanner.nextLine();
//                                System.out.println("Enter the category of the CD: ");
//                                String cdCategory = scanner.nextLine();
//                                System.out.println("Enter the artist of the CD: ");
//                                String cdArtist = scanner.nextLine();
//                                System.out.println("Enter the director of the CD: ");
//                                String cdDirector = scanner.nextLine();
//                                System.out.println("Enter the cost of the CD: ");
//                                float cdCost = scanner.nextFloat();
//                                scanner.nextLine();
//
//                                CompactDisc cd = new CompactDisc(cdArtist,cdTitle,cdCategory,cdCost,cdDirector);
//                                System.out.println("Do you want to add tracks to your CD?\n (1) Yes (0) No:");
//                                int addTrack = scanner.nextInt();
//                                scanner.nextLine();
//
//                                if (addTrack == 1) {
//                                    System.out.println("Enter the number of tracks: ");
//                                    int numTracks = scanner.nextInt();
//                                    scanner.nextLine();
//                                    for (int i = 0; i < numTracks; i++) {
//                                        System.out.println("Enter the title of track " + (i + 1) + ": ");
//                                        String trackTitle = scanner.nextLine();
//                                        System.out.println("Enter the length of track " + (i + 1) + ": ");
//                                        int trackLength = scanner.nextInt();
//                                        scanner.nextLine();
//                                        cd.addTrack(new Track(trackTitle, trackLength));
//                                    }
//                                    store.addMedia(cd);
//                                } else if (addTrack == 0) store.addMedia(cd);
//                                System.out.println("\nCurrent store: ");
//                                store.print();
//                                System.out.println();
//                                break;
//
//                            case "3":
//                                System.out.println("Enter the title of the DVD: ");
//                                String dvdTitle = scanner.nextLine();
//                                System.out.println("Enter the category of the DVD: ");
//                                String dvdCategory = scanner.nextLine();
//                                System.out.println("Enter the director of the DVD: ");
//                                String dvdDirector = scanner.nextLine();
//                                System.out.println("Enter the length (second) of the DVD: ");
//                                int dvdLength = scanner.nextInt();
//                                System.out.println("Enter the cost of the DVD: ");
//                                float dvdCost = scanner.nextFloat();
//                                scanner.nextLine();
//
//                                DigitalVideoDisc dvd = new DigitalVideoDisc(dvdTitle, dvdCategory, dvdDirector, dvdLength, dvdCost);
//                                store.addMedia(dvd);
//                                System.out.println("\nCurrent store: ");
//                                store.print();
//                                System.out.println();
//                                break;
//
//                            default:
//                                System.out.println("Invalid option. Please choose a number: 0-1-2.");
//                                break;
//                        }
//                    }
//                    break;
//
//                case "2":
//                    while (true) {
//                        System.out.print("Enter the title of the media to remove from store (Press 0 to return): ");
//                        String title = scanner.nextLine();
//                        if (title.equals("0")) break;
//                        Media foundMedia = store.searchByTitle(title);
//                        if (foundMedia == null) System.out.println(title + " is not in the store. Please try another.");
//                        else {
//                            store.removeMedia(foundMedia);
//                            System.out.println(title + " has been successfully removed from the store.");
//                            System.out.println("\nCurrent store: ");
//                            store.print();
//                            System.out.println();
//                        }
//                    }
//                    break;
//
//                default:
//                    System.out.println("Invalid option. Please choose a number: 0-1-2.");
//                    break;
//            }
//        }
//    }






//    public static void main(String[] args) {
//        Cart anOrder = new Cart();
//
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
//        anOrder.addDigitalVideoDisc(dvd1);
//
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
//        anOrder.addDigitalVideoDisc(dvd2);
//
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
//
//        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Howl's Moving Castle", "Animation", "Miyazaki Hayao", 159, 19.95f);
//        anOrder.addDigitalVideoDisc(dvd4, dvd3);
//
//        DigitalVideoDisc [] listDvd = {
//            new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f),
//            new DigitalVideoDisc("Aladin", "Animation", 18.99f)
//        };
//        anOrder.addDigitalVideoDisc(listDvd);
//
//        System.out.println("Total Cost is: " + anOrder.totalCost());
//
//        anOrder.displayCart();
//
//        anOrder.removeDigitalVideoDisc(dvd1);
//
//        System.out.println("Total Cost is: " + anOrder.totalCost());
//    }
}
