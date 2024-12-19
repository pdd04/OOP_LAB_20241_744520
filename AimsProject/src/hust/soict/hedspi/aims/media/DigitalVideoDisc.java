package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc(String title) {
        super(title,null, 0, null, -1);
        nb++;
        super.setId(nb);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        nb++;
        super.setId(nb);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, cost, director, -1);
        nb++;
        super.setId(nb);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, director, length);
        nb++;
        super.setId(nb);
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public String toString() {
        return "id = " + getId() +
                " - title = '" + getTitle() + '\'' +
                " - category = '" + getCategory() + '\'' +
                " - length = " + getLength() +
                " - director = '" + getDirector() + '\'' +
                " - cost = " + getCost() ;
    }

}
