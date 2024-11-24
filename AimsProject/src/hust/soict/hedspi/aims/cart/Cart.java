package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {

    public static final int MAX_NUMBER_ORDERED = 20;
    private static int qtyOrdered = 0;

    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (this.qtyOrdered == MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full");
        }else{
            this.qtyOrdered++;
            this.itemsOrdered[this.qtyOrdered - 1] = disc;
            System.out.println("The disc has been added");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc [] disc) {
        for(int i = 0; i < disc.length; i++) {
            if(this.qtyOrdered == MAX_NUMBER_ORDERED) {
                System.out.println("The cart is almost full");
            }else{
                this.qtyOrdered++;
                this.itemsOrdered[this.qtyOrdered - 1] = disc[i];
                System.out.println("The disc [" + (i + 1) + "] has been added");
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if(this.qtyOrdered == MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full");
        }else if(this.qtyOrdered == MAX_NUMBER_ORDERED - 1) {
            this.qtyOrdered++;
            this.itemsOrdered[this.qtyOrdered - 1] = disc1;
            System.out.println("The disc [" + 1 + "] has been added");
        }else{
            this.qtyOrdered++;
            this.itemsOrdered[this.qtyOrdered - 1] = disc1;
            System.out.println("The disc [" + 1 + "] has been added");
            this.qtyOrdered++;
            this.itemsOrdered[this.qtyOrdered - 1] = disc2;
            System.out.println("The disc [" + 2 + "] has been added");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        this.qtyOrdered--;
        if (this.qtyOrdered == 0) {
            System.out.println("The cart is empty");
        }else{
            this.itemsOrdered[this.qtyOrdered - 1] = null;
            System.out.println("The disc has been removed");
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < this.qtyOrdered; i++) {
            if(this.itemsOrdered[i] != null){
                total += itemsOrdered[i].getCost();
            }else{
                break;
            }
        }
        return total;
    }

    public void displayCart(){
        for (int i = 0; i < this.qtyOrdered; i++) {
            if(this.itemsOrdered[i] != null){
                System.out.println("dvd" + (i + 1) + "{ ");
                System.out.println("Title: " + itemsOrdered[i].getTitle() + ";");
                System.out.println("Category: " + itemsOrdered[i].getCategory() + ";");
                System.out.println("Director: " + itemsOrdered[i].getDirector() + ";");
                System.out.println("Length: " + itemsOrdered[i].getLength() + ";");
                System.out.println("Cost: " + itemsOrdered[i].getCost() + ";");
                System.out.println("}");
            }
        }
    }

    public void print(int searchFor, String search){
        if(searchFor == 2){
            int id = Integer.parseInt(search);
        }
        int counter = 0;

        System.out.println("****************************CART****************************");
        System.out.println("Ordered Item:");
        for (int i = 0; i < this.qtyOrdered; i++) {
            if(searchFor != 1){
                if(!search(searchFor, i, search)){
                    continue;
                }
            }
            counter++;
            if(itemsOrdered[i].getCost() == - 1){
                System.out.println((i+1) + ".DVD - " + itemsOrdered[i].getTitle());
            }else if(itemsOrdered[i].getDirector() == null){
                System.out.println((i+1) + ".DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + ": " + itemsOrdered[i].getCost());
            }else if(itemsOrdered[i].getLength() == -1){
                System.out.println((i+1) + ".DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + ": " + itemsOrdered[i].getCost());
            }else{
                System.out.println((i+1) + ".DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost());
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

    public boolean search(int searchFor,int i, String search){
        if(searchFor == 2){
            int id = Integer.parseInt(search);
            if(itemsOrdered[i].getId() == id){
                return true;
            }
            return false;
        }else{
            if(itemsOrdered[i].getTitle().equals(search)){
                return true;
            }
            return false;
        }
    }


}
