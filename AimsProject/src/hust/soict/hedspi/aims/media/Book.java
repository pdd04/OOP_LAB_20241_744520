package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String category;
    private double cost;
    private List<String> author = new ArrayList<String>();

    public Book(int id, String title, String category, double cost, List<String> author) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    public void addAuthor(String author) {
        if(!this.author.contains(author)){
            this.author.add(author);
        }else{
            System.out.println("Author already exists");
        }
    }
    public void removeAuthor(String author) {
         if(this.author.contains(author)){
             this.author.remove(author);
         }else{
             System.out.println("Author does not exist");
         }
    }
}
