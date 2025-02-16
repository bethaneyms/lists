public class Song {
    private String title;
    private String artist;
    private double length;

    public Song(String title, String artist, double length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    @Override
    public String toString() {
        return "{ songName: " + title + ", artist: " + artist + ", length: " + length + " minutes }";
    }
}
