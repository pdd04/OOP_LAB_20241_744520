package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        for (Media item : itemsOrdered) {
            if (item.getTitle() == media.getTitle()) {
                System.out.println("DVD already exists!");
                return;
            }
        }
        itemsOrdered.add(media);
        System.out.println("The disc has been added");


    }

    public void removeMedia(Media media) {
        for (Media item : itemsOrdered) {
            if (item.getTitle().equals(media.getTitle())) {
                itemsOrdered.remove(media);
                System.out.println("The disc has been removed");
                return;
            }
        }
        System.out.println("DVD not found!");
    }

    public void print(){
        System.out.println("Digital Video Disc:");
        for (Media item : itemsOrdered){
            if(item.getClass() == DigitalVideoDisc.class){
                System.out.println(item.toString());
            }
        }
        System.out.println("CompactDisc:");
        for (Media item : itemsOrdered){
            if(item.getClass() == CompactDisc.class){
                System.out.println(item.toString());
            }
        }
        System.out.println("Book:");
        for (Media item : itemsOrdered){
            if(item.getClass() == Book.class){
                System.out.println(item.toString());
            }
        }

    }

    public Media searchByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }

        return null;
    }
}
