package hust.soict.hedspi.aims.cart;


import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;

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




}
