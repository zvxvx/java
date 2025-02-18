public interface DHLinkedListInterface {
    void addFirst(String data);
    void addLast(String data);
    void removeFirst() throws IllegalStateException;
    void removeLast() throws IllegalStateException;
    String toString();
    int search(String data) throws IllegalStateException;
    Node getAtIndex(int index) throws IllegalArgumentException;
    void removeAtIndex(int index) throws IllegalArgumentException;
    void addAtIndex(int index) throws IllegalArgumentException;
    boolean isEmpty();
}
