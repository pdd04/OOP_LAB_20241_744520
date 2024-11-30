package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title) {
        super(title,null, 0, null, -1);
        nbDigitalVideoDiscs++;
        super.setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        nbDigitalVideoDiscs++;
        super.setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, cost, director, -1);
        nbDigitalVideoDiscs++;
        super.setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, director, length);
        nbDigitalVideoDiscs++;
        super.setId(nbDigitalVideoDiscs);
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
