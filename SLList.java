public class SLList<T> {
    private SLNode<T> head;

    public SLList() {
        this.head = null;
    }

    public void addy(T item) {
        SLNode<T> newNode = new SLNode<>(item);
        if (head == null) {
            head = newNode;
        } else {
            SLNode<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void removy(int pos) {
        if (head == null || pos < 0) return;
        if (pos == 0) {
            head = head.next;
            return;
        }
        SLNode<T> temp = head;
        for (int i = 0; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) return;
        temp.next = temp.next.next;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        SLNode<T> temp = head;
        while (temp != null) {
            sb.append(temp.data).append("\n");
            temp = temp.next;
        }
        return sb.toString();
    }
}
