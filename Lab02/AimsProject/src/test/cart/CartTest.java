package test.cart;

import aims.cart.Cart;
import aims.disc.DigitalVideoDisc;

import java.util.Scanner;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Doraemon");
        cart.addDigitalVideoDisc(dvd4);

        System.out.println("************************************************************");
        System.out.println("1.ALL");
        System.out.println("2.ID");
        System.out.println("3.TITLE");
        System.out.println("************************************************************");
        System.out.print("search by: ");
        Scanner sc = new Scanner(System.in);
        int searchFor = sc.nextInt();
        if(searchFor != 1) {
            sc.nextLine();
            String Search = sc.nextLine();
            cart.print(searchFor, Search);
        }
        cart.print(searchFor, "Search");
    }
}
