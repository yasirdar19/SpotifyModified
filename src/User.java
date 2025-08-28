import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<IPlaylist> playlists; // changed from Playlist to IPlaylist

    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();
    }

    public IPlaylist createPlaylist(String name, String type) { // changed return type
        IPlaylist playlist;
        switch (type.toLowerCase()) {
            case "pop": playlist = new PopPlaylist(name); break;
            case "rock": playlist = new RockPlaylist(name); break;
            case "jazz": playlist = new JazzPlaylist(name); break;
            default: playlist = new PopPlaylist(name); break; // default to pop
        }
        playlists.add(playlist);
        return playlist;
    }

    public void showPlaylists() {
        System.out.println(username + "'s Playlists:");
        for (IPlaylist p : playlists) {
            System.out.println(" - " + p.getName());
        }
    }
}
