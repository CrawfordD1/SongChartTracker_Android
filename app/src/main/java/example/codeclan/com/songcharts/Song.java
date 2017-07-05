package example.codeclan.com.songcharts;

/**
 * Created by user on 05/07/2017.
 */

public class Song {

    private int ranking;
    private String title;
    private String artist;
    private String url;

    public Song(Integer ranking, String title, String artist, String url) {
        this.ranking = ranking;
        this.title = title;
        this.artist = artist;
        this.url = url;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getUrl(){
        return url;
    }

}
