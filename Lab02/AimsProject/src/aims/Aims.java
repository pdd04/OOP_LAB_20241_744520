package aims;

import aims.cart.Cart;
import aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Howl's Moving Castle", "Animation", "Miyazaki Hayao", 159, 19.95f);
        anOrder.addDigitalVideoDisc(dvd4, dvd3);

        DigitalVideoDisc [] listDvd = {
            new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f),
            new DigitalVideoDisc("Aladin", "Animation", 18.99f)
        };
        anOrder.addDigitalVideoDisc(listDvd);

        System.out.println("Total Cost is: " + anOrder.totalCost());

        anOrder.displayCart();

        anOrder.removeDigitalVideoDisc(dvd1);

        System.out.println("Total Cost is: " + anOrder.totalCost());
    }
}
