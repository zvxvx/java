public class DHLinkedList implements DHLinkedListInterface {
    int size;
    Node head;

    public DHLinkedList(){
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

    }

    @Override
    public void removeFirst() throws IllegalStateException {

    }

    @Override
    public void removeLast() throws IllegalStateException {

    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("[");
        Node current = this.head.next;
        while (current != null) {
            str.append(current.data);
            str.append(" -> ");
            current = current.next;
        }
        return str + "null]";
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
