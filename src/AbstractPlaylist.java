import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPlaylist implements IPlaylist {
    protected String name;
    protected List<Song> songs;

    public AbstractPlaylist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    @Override
    public void addSong(Song song) { songs.add(song); }

    @Override
    public void removeSong(Song song) { songs.remove(song); }

    @Override
    public void playAllSongs() {
        System.out.println("Playing playlist: " + name);
        for (Song song : songs) {
            song.play();
        }
    }

    @Override
    public String getName() { return name; }
}
