package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(DigitalVideoDisc dvd) {
        for (Media item : itemsOrdered) {
            if (item.getTitle() == dvd.getTitle()) {
                System.out.println("DVD already exists!");
                return;
            }
        }
        itemsOrdered.add(dvd);
        System.out.println("The disc has been added");


    }

    public void removeMedia(DigitalVideoDisc dvd) {
        for (Media item : itemsOrdered) {
            if (item.getTitle().equals(dvd.getTitle())) {
                itemsOrdered.remove(dvd);
                System.out.println("The disc has been removed");
                return;
            }
        }
        System.out.println("DVD not found!");
    }

    public void print(){
        System.out.println("****************************CART****************************");
        System.out.println("Ordered Item:");
        int i = 0;
        for (Media item : itemsOrdered) {
            i++;
            if(item.getCost() == - 1){
                System.out.println((i+1) + ".DVD - " + item.getTitle());
            }else{
                System.out.println((i+1) + ".DVD - " + item.getTitle() + " - " + item.getCategory() +  ": " + item.getCost());
            }
        }
        System.out.println("************************************************************");

    }
}
