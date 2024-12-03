package hust.soict.hedspi.aims.media;

import java.util.*;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost = -1;
    protected static int nb =0;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

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



    /*public static void main (String[] args) {
        List<Media> medias = new ArrayList<>();
        List<Track> tracks = new ArrayList<>();

        medias.add(new CompactDisc("abc", "song", "remix", 12, "bca",  tracks));
        medias.add(new DigitalVideoDisc("abc", "phim hai", 2));
        medias.add(new Book("giai tich","toan cao cap", 2, new ArrayList<String>()));

        for (Media media : medias) {
            System.out.println(media.toString());
        }

        System.out.println("sort by title");
        Collections.sort(medias, COMPARE_BY_TITLE_COST);
        for (Media media : medias) {
            System.out.println(media.toString());
        }

        System.out.println("sort by cost");
        Collections.sort(medias, COMPARE_BY_COST_TITLE);
        for (Media media : medias) {
            System.out.println(media.toString());
        }
    }*/
}
