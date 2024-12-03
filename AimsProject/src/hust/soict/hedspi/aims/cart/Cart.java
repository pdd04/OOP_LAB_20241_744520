package hust.soict.hedspi.aims.cart;


import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Cart {

    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media item) {
        if(!itemsOrdered.contains(item)) {
            itemsOrdered.add(item);
        }else{
            System.out.println("Duplicate media found");
        }
    }

    public void removeMedia(Media item) {
        if(itemsOrdered.contains(item)) {
            itemsOrdered.remove(item);
        }else{
            System.out.println("Not found media found");
        }
    }

    public float totalCost() {
        float total = 0;
        for (Media item : itemsOrdered) {
            total += item.getCost();
        }
        return total;
    }

    public Media searchByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equals(title))
                return media;
        }

        return null;
    }

    public Media searchById(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id)
                return media;
        }

        return null;
    }

    public void sortByTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        Iterator<Media> iterator = itemsOrdered.iterator();

        while (iterator.hasNext()) {
            System.out.println((iterator.next()).toString());
        }
    }

    public void sortByCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        Iterator<Media> iterator = itemsOrdered.iterator();

        while (iterator.hasNext()) System.out.println((iterator.next()).toString());

    }
    public void empty() {
        itemsOrdered.clear();
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (Media media : itemsOrdered) {
            System.out.println(media.toString());
        }
        System.out.println("Total cost: " + totalCost() + "$");
        System.out.println("**************************************************");
    }




}
