package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length = -1;
    private static int nbDigitalVideoDiscs = 0;
    
    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }



    public DigitalVideoDisc(String title) {
        super.setTitle(title);
        nbDigitalVideoDiscs++;
        super.setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        nbDigitalVideoDiscs++;
        super.setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
       super(title, category, cost);
        this.director = director;
        nbDigitalVideoDiscs++;
        super.setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
        nbDigitalVideoDiscs++;
        super.setId(nbDigitalVideoDiscs);
    }
}
