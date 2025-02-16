public class DLList<T> {
    private DLNode<T> head;

    public DLList() {
        this.head = null;
    }

    public void addy(T item) {
        DLNode<T> newNode = new DLNode<>(item);
        if (head == null) {
            head = newNode;
        } else {
            DLNode<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void removy(int pos) {
        if (head == null || pos < 0) return;
        DLNode<T> temp = head;
        for (int i = 0; temp != null && i < pos; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp == head) head = temp.next;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        DLNode<T> temp = head;
        while (temp != null) {
            sb.append(temp.data).append("\n");
            temp = temp.next;
        }
        return sb.toString();
    }

}
