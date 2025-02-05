public class NDHLinkedList implements NDHLinkedListInterface {
    int size;
    Node head;

    public NDHLinkedList() {
        this.size = 0;
        this.head = null;
    }

    @Override
    public void addFirst(int num) {
        this.size++;
    }

    @Override
    public void addLast(int num) {
        this.size++;
    }

    @Override
    public void removeFirst() throws IllegalStateException {
        this.size--;
    }

    @Override
    public void removeLast() throws IllegalStateException {
        this.size--;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public int search(int num) throws IllegalStateException {
        return 0;
    }

    @Override
    public Node getAtIndex(int i) throws IllegalArgumentException {
        return null;
    }

    @Override
    public void removeAtIndex(int i) throws IllegalArgumentException {
        this.size--;
    }

    @Override
    public void addAtIndex(int i, int data) throws IllegalArgumentException {
        this.size++;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void printList(NDHLinkedList ll) {
        System.out.println(ll);
    }

}
