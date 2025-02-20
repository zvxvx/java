public interface DHLinkedListInterface {
    /**
     * Add a new node in front of the dummy head node.
     * @param data - the string data we want to add.
     */
    void addFirst(String data);

    /**
     * Add a new node to the end of the list.
     * @param data - the string data we want to add.
     */
    void addLast(String data);

    /**
     * Remove the first node in front of the dummy head node.
     * @throws IllegalStateException - if list is empty.
     */
    void removeFirst() throws IllegalStateException;

    /**
     * Remove the last node in the list.
     * @throws IllegalStateException - if list is empty.
     */
    void removeLast() throws IllegalStateException;

    /**
     * Shows the nodes in a list.
     * @return - the string of nodes.
     */
    String toString();

    /**
     * Search for the data contained in the node and return the index of that
     * node. The dummy head is not included in the indexing.
     * @param data - The data we want to find.
     * @return - The index of the node that contains said data.
     * @throws IllegalStateException - if list is empty.
     */
    int search(String data) throws IllegalStateException;

    /**
     * Return the node based on the number used as an argument.
     * @param index - The location of the node we are searching for.
     * @return - The node.
     * @throws IllegalArgumentException - If the index is oob.
     */
    Node getAtIndex(int index) throws IllegalArgumentException;

    /**
     * Remove the node based on the index it belongs to.
     * @param index - The location of the node.
     * @throws IllegalArgumentException - if the index is oob.
     */
    void removeAtIndex(int index) throws IllegalArgumentException;

    /**
     * Add a new node based on the number input as the argument.
     * @param index - Where we want to add a new node.
     * @throws IllegalArgumentException - If the index is oob.
     */
    void addAtIndex(int index) throws IllegalArgumentException;

    /**
     * Check if list is empty.
     * @return - a boolean value
     */
    boolean isEmpty();
}
