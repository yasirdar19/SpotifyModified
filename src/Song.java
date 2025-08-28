public class Song {
    private String title;
    private String artist;
    private double duration; // in minutes
    private String genre;
    private String mood;

    public Song(String title, String artist, double duration, String genre, String mood) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
        this.mood = mood;
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public double getDuration() { return duration; }
    public String getGenre() { return genre; }
    public String getMood() { return mood; }

    public void play() {
        System.out.println("Playing: " + title + " by " + artist + " (" + duration + " mins, " + mood + ")");
    }
}
