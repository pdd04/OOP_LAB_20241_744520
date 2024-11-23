package aims.cart;

import aims.disc.DigitalVideoDisc;

public class Cart {

    public static final int MAX_NUMBER_ORDERED = 20;
    private static int qtyOrdered = 0;

    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        this.qtyOrdered++;
        if (this.qtyOrdered == MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full");
        }else{
            this.itemsOrdered[this.qtyOrdered - 1] = disc;
            System.out.println("The disc has been added");
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
}
