public interface NDHLinkedListInterface {

    /**
     * Add a node to the beginning of the list
     *
     * @param num - our data
     */
    void addFirst(int num);

    /**
     * Add a node to the end of the list.
     *
     * @param num - our data
     */
    void addLast(int num);

    /**
     * Remove the first node in the list.
     *
     * @throws IllegalStateException - if the list is empty
     */
    void removeFirst() throws IllegalStateException;

    /**
     * Remove the last node in the list.
     *
     * @throws IllegalStateException - if the list is empty
     */
    void removeLast() throws IllegalStateException;

    /**
     * @return the string in its proper form.
     */
    String toString();

    /**
     * Searches the list for the first occurrence of the node containing the
     * data.
     *
     * @param num - the value to be found in the list.
     * @return - the location of the data searched.
     * @throws IllegalStateException - if the list is empty
     */
    int search(int num) throws IllegalStateException;

    /**
     * Get a node at a certain index.
     *
     * @param i - the index we want to search with.
     * @return the node we want.
     * @throws IllegalArgumentException - if index is oob or list is empty.
     */
    Node getAtIndex(int i) throws IllegalArgumentException;

    /**
     * Remove a node at a certain index.
     *
     * @param i - the index we want to search with.
     * @throws IllegalArgumentException - if index is oob or list is empty.
     */
    void removeAtIndex(int i) throws IllegalArgumentException;

    /**
     * Add a node at a certain index.
     *
     * @param i    - the index we want to use to position the node.
     * @param data - the data we want to use for the node.
     * @throws IllegalArgumentException - if index is oob.
     */
    void addAtIndex(int i, int data) throws IllegalArgumentException;

    /**
     * Lets us know if a list is empty or not.
     *
     * @return - a true or false value
     */
    boolean isEmpty();

    /**
     * Print the linked list.
     */
    void printList();
}
