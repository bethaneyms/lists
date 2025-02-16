public class AList<T> {
    private Object[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public AList() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void addy(T item) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = item;
    }

    public void removy(int pos) {
        if (pos < 0 || pos >= size) return;
        for (int i = pos; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    private void resize() {
        Object[] newArray = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]).append("\n");
        }
        return sb.toString();
    }
}
