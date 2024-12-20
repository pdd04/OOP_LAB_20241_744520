package hust.soict.hedspi.aims.media;

import java.util.Objects;

public class Track implements Playable{
    private String title;
    private int length = -1;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String play() {
//        System.out.println("Playing DVD: " + this.getTitle());
//        System.out.println("DVD length: " + this.getLength());
        return "Playing: " + this.getTitle() + " Length: " + this.getLength();
    }

    @Override
    public String toString() {
        return "Track: " +
                "title = '" + title + '\'' +
                " - length = " + length + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return length == track.length && Objects.equals(title, track.title);
    }
}
