package hust.soict.hedspi.aims.media;

public class Disc extends Media {
    private String director;
    private int length = -1;


    public Disc(String title, String category, float cost, String director, int length) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    public Disc(){}

    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

}
