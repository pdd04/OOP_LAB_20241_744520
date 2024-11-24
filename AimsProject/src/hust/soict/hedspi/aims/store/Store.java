package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[100];
    private static int qtyDvd = 0;

    public void addDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < qtyDvd; i++) {
            if (itemsInStore[i].getTitle() == dvd.getTitle()) {
                System.out.println("DVD already exists!");
                return;
            }
        }
        itemsInStore[qtyDvd] = dvd;
        this.qtyDvd++;
        System.out.println("The disc has been added");


    }

    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < qtyDvd; i++) {
            if (itemsInStore[i].getTitle().equals(dvd.getTitle())) {
                for (int j = i; j < qtyDvd - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyDvd - 1] = null; //
                qtyDvd--; //
                System.out.println("The disc has been removed");
                return;
            }
        }
        System.out.println("DVD not found!");
    }

    public void print(){
        System.out.println("****************************CART****************************");
        System.out.println("Ordered Item:");
        for (int i = 0; i < qtyDvd; i++) {
            if(itemsInStore[i].getCost() == - 1){
                System.out.println((i+1) + ".DVD - " + itemsInStore[i].getTitle());
            }else if(itemsInStore[i].getDirector() == null){
                System.out.println((i+1) + ".DVD - " + itemsInStore[i].getTitle() + " - " + itemsInStore[i].getCategory() + ": " + itemsInStore[i].getCost());
            }else if(itemsInStore[i].getLength() == -1){
                System.out.println((i+1) + ".DVD - " + itemsInStore[i].getTitle() + " - " + itemsInStore[i].getCategory() + " - " + itemsInStore[i].getDirector() + ": " + itemsInStore[i].getCost());
            }else{
                System.out.println((i+1) + ".DVD - " + itemsInStore[i].getTitle() + " - " + itemsInStore[i].getCategory() + " - " + itemsInStore[i].getDirector() + " - " + itemsInStore[i].getLength() + ": " + itemsInStore[i].getCost());
            }
        }
        System.out.println("************************************************************");

    }
}
