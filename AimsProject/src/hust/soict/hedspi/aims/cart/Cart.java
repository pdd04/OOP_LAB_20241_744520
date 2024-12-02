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

    public void displayCart(){
        int i = 0;
        for (Media item : itemsOrdered) {
                System.out.println("dvd" + (i + 1) + "{ ");
                System.out.println("Title: " + item.getTitle() + ";");
                System.out.println("Category: " + item.getCategory() + ";");
                System.out.println("Cost: " + item.getCost() + ";");
                System.out.println("}");
                i++;
        }
    }

    public void print(int searchFor, String search){
        if(searchFor == 2){
            int id = Integer.parseInt(search);
        }
        int counter = -1;
        System.out.println("****************************CART****************************");
        System.out.println("Ordered Item:");
        int i = 0;
        for (Media item : itemsOrdered) {
            i++;
            if(searchFor != 1){
                if(!search(searchFor, item, search)){
                    continue;
                }
            }
            counter++;
            if(item.getCost() == - 1){
                System.out.println((i+1) + ".DVD - " + item.getTitle());
            }else{
                System.out.println((i+1) + ".DVD - " + item.getTitle() + " - " + item.getCategory() +  ": " + item.getCost());
            }
        }
        if(counter == 0){
            System.out.println("No found");
        }
        if(searchFor == 1){
            System.out.println("Total Cost: " + totalCost());
        }
        System.out.println("************************************************************");
    }
    public boolean search(int searchFor,Media item, String search){
        if(searchFor == 2){
            int id = Integer.parseInt(search);
            if(item.getId() == id){
                return true;
            }
            return false;
        }else{
            if(item.getTitle().equals(search)){
                return true;
            }
            return false;
        }
    }




}
