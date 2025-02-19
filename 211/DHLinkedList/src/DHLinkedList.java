public class DHLinkedList implements DHLinkedListInterface {
    int size;
    Node head;

    public DHLinkedList() {
        this.size = 0;
        this.head = new Node(null, null);
    }

    @Override
    public void addFirst(String data) {
        if (this.size == 0) {
            this.head.next = new Node(data, null);
        } else {
            this.head.next = new Node(data, this.head.next);
        }
        this.size++;
    }

    @Override
    public void addLast(String data) {
        if (this.size == 0) {
            this.head.next = new Node(data, this.head.next);
        } else {
            Node current = this.head.next;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data, null);
        }
        this.size++;
    }

    @Override
    public void removeFirst() throws IllegalStateException {
        if (this.size == 0) {
            throw new IllegalStateException();
        }
        this.head.next = this.head.next.next;
        this.size--;
    }

    @Override
    public void removeLast() throws IllegalStateException {
        if (this.size == 0) {
            throw new IllegalStateException();
        }
        if (this.size == 1) {
            this.head.next = null;
        }
        Node current = this.head.next;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        this.size--;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        Node current = this.head.next;
        while (current != null) {
            str.append(current.data);
            str.append(" -> ");
            current = current.next;
        }
        return str + "null]  size: " + this.size;
    }

    @Override
    public int search(String data) throws IllegalStateException {
        return 0;
    }

    @Override
    public Node getAtIndex(int index) throws IllegalArgumentException {
        return null;
    }

    @Override
    public void removeAtIndex(int index) throws IllegalArgumentException {

    }

    @Override
    public void addAtIndex(int index) throws IllegalArgumentException {

    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }
}
