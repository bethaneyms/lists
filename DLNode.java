public class DLNode<T> {
    T data;
    DLNode<T> next, prev;

    public DLNode(T data) {
        this.data = data;
        this.next = this.prev = null;
    }
}
