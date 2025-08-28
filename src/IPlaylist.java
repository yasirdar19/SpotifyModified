public interface IPlaylist {
    void addSong(Song song);
    void removeSong(Song song);
    void playAllSongs();
    String getName();
}
