public class DHLinkedList implements DHLinkedListInterface {
    int size;
    Node head;

    public DHLinkedList(){
        this.size = 0;
        this.head = new Node(null, null);
    }

    @Override
    public void addFirst(String data) {

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
