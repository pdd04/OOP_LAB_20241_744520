package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost = -1;

    public Media() {}

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Media{id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", category='" + getCategory() + '\'' +
                ", cost=" + getCost();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Media media = (Media) o;
        return Objects.equals(title, media.title);
    }
    public static void main (String[] args) {
        List<Media> medias = new ArrayList<>();
        List<Track> tracks = new ArrayList<>();

        medias.add(new CompactDisc("abc", "song", "remix", 12, "bca",  tracks));
        medias.add(new DigitalVideoDisc("abc", "phim hai", 2));
        medias.add(new Book("giai tich","toan cao cap", 2, new ArrayList<String>()));

        for (Media media : medias) {
            System.out.println(media.toString());
        }
    }
}
