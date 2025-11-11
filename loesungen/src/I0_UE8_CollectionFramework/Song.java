package I0_UE8_CollectionFramework;

import java.util.Objects;

public class Song implements Comparable<Song> {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //     if (!(o instanceof Song)) return false;
    //     Song song = (Song) o;
    //     return title.equalsIgnoreCase(song.title)
    //             && artist.equalsIgnoreCase(song.artist);
    // }
    //
    // @Override
    // public int hashCode() {
    //     return Objects.hash(title.toLowerCase(), artist.toLowerCase());
    // }

    @Override
    public String toString() {
        return "'" + this.title + "' by " + this.artist;
    }

    @Override
    public int compareTo(Song other) {
        int titleCompare = this.title.compareToIgnoreCase(other.title);
        if (titleCompare != 0) {
            return titleCompare;
        }
        return this.artist.compareToIgnoreCase(other.artist);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
