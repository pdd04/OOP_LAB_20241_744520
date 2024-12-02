package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

    private List<String> author = new ArrayList<String>();

    public Book( String title, String category, float cost, List<String> author) {
        super(title, category, cost);
        this.author = author;
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

    @Override
    public String toString() {
        return super.toString() +
                ", authors=" + getAuthor() +
                '}';
    }
}
