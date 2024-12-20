package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String artist, String title, String category, float cost, String director, List<Track> track) {
        super(title, category, cost, director, -1);
        this.artist = artist;
        this.tracks = track;
        updateLength();
        nb++;
        setId(nb);
    }

    public CompactDisc(String artist, String title, String category, float cost, String director) {
        super(title, category, cost, director, -1);
        this.artist = artist;
        updateLength();
        nb++;
        setId(nb);
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if(!tracks.contains(track)){
            tracks.add(track);
            updateLength();
        }else{
            System.out.println("Track already exists");
        }
    }

    public void removeTrack(Track track) {
        if(tracks.contains(track)){
            tracks.remove(track);
            updateLength();
        }else{
            System.out.println("Track does not exist");
        }
    }

    public int getLength(){
        int length = super.getLength();
        return length;
    }

    public void updateLength(){
        int length = 0;
        for(Track track : tracks){
            length += track.getLength();
        }
        super.setLength(length);
    }

    public String play(){
        String play = "";
        for(Track track : tracks){
            play = play + "\n" + track.play();
        }
        return play;
    }

    @Override
    public String toString() {
        return "id = " + getId() +
                " - title = '" + getTitle() + '\'' +
                " - category = '" + getCategory() + '\'' +
                " - length = " + getLength() +
                " - director = '" + getDirector() + '\'' +
                " - artist = '" + artist + '\'' +
                " - cost = " + getCost() +
                " - tracks = " + tracks;
    }

}
