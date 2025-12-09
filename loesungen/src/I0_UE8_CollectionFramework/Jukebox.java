package I0_UE8_CollectionFramework;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Jukebox {
    public static void main(String[] args) {
        Jukebox j = new Jukebox();
        j.go();
    }

    public void go() {
        List<Song> songList = MockSongs.getSongs();
        System.out.println(songList);
        // System.out.println(songList.get(0));

        Collections.sort(songList);
        System.out.println(songList);

        Set<Song> songSet = new HashSet<>(songList);
        System.out.println(songSet);

        TreeSet<Song> songTreeSet = new TreeSet<>(songList);
        System.out.println(songTreeSet);

        HashMap<Integer, Song> chartsTopThree = new HashMap<>();
        chartsTopThree.put(1, new Song("The Fate Of Ophelia", "Taylor Swift"));
        chartsTopThree.put(2, new Song("All I Want For Christmas Is You", "Mariah Carey"));
        chartsTopThree.put(3, new Song("In The End", "Linkin Park"));
        System.out.println(chartsTopThree);
        System.out.println(chartsTopThree.get(0));
        System.out.println(chartsTopThree.get(1));

        // arrayList and is an ordered collection and it maintains the (insertion) order
        System.out.println(songList.get(0));
        // not allowed, cause no order guaranteed
        // System.out.println(songSet.get(0));
        // System.out.println(songTreeSet.get(0));
        System.out.println(songTreeSet.first());
        System.out.println(songTreeSet.last());

        // removal of items
        songList.remove(0);
        System.out.println(songList);

        chartsTopThree.remove(1);
        System.out.println(chartsTopThree);

        // there must be an equals method implemented for this to work
        // songSet.remove(new Song("Jingle Bells", "Frank Sinatra"));
        // System.out.println(songSet);
        //
        // songTreeSet.remove(new Song("Jingle Bells", "Frank Sinatra"));
        // System.out.println(songTreeSet);

        List<Song> weihnachtsSongs = songList.stream()
                .filter(song -> song.getTitle().equals("Jingle Bells"))
                .collect(toList());
        System.out.println(weihnachtsSongs);
    }
}
