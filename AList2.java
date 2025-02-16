import java.util.Arrays;

public class AList2<T> {
    private Object[] data;
    private int size;
    private int capacity;

    public AList2() {
        capacity = 10;
        data = new Object[capacity];
        size = 0;
    }

    public void addy(T item) {
        if (size == capacity) {
            resize();
        }
        data[size++] = item;
    }

    public void removy(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position.");
            return;
        }
        for (int i = pos; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    private void resize() {
        capacity *= 2;
        data = Arrays.copyOf(data, capacity);
    }

    // Converts list to string
    public String toString() {
        if (size == 0) return "Empty List";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(data[i]).append("\n");
        }
        return sb.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        AList2<Song> songsList = new AList2<>();

        Song song1 = new Song("You", "Nicole Bus", 3.27);
        Song song2 = new Song("TWENTIES", "GIVEON", 2.54);
        Song song3 = new Song("Jungle", "H.E.R", 5.05);


        songsList.addy(song1);
        songsList.addy(song3);
        songsList.addy(song2);
        songsList.addy(song1);

        System.out.println(songsList);

        songsList.removy(1);
        System.out.println(songsList);
    }
}

