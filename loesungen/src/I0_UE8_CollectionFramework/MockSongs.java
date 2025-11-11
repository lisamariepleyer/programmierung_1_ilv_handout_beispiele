package I0_UE8_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    public static List<Song> getSongs(){
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("Jingle Bells", "Gwen Stefani"));
        songs.add(new Song("Jingle Bells", "Frank Sinatra"));
        songs.add(new Song("Nothing Else Matters", "Metallica"));
        songs.add(new Song("Master of Puppets", "Metallica"));
        songs.add(new Song("$10", "Hitchhiker"));

        // this is a single object on the heap, thus this will be recognised as equal and work with sets as expected
        Song s = new Song("Complicated", "Avril Lavigne");
        songs.add(s);
        songs.add(s);

        // if new objects are created on the heap, equals() would not catch them and both objects would be contained in the set
        // exception: equals() is implemented too, then sets work as expected
        // songs.add(new Song("Complicated", "Avril Lavigne"));
        // songs.add(new Song("Complicated", "Avril Lavigne"));

        return songs;
    }
}
