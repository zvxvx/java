public class Main {
    public static void main(String[] args) {
// Create a new DHLinkedList instance
        DHLinkedList list = new DHLinkedList();
// Add nodes to the list
        list.addFirst("Node1");
        list.addFirst("Node2");
        list.addLast("Node3");
// Print the list
        System.out.println(list.toString()); // Expected Output: [Node2,
        // Node1, Node3]
// Remove the first node
        list.removeFirst();
        System.out.println(list.toString()); // Expected Output: [Node1, Node3]
// Remove the last node
        list.removeLast();
        System.out.println(list.toString()); // Expected Output: [Node1]
// Add a node at a specific index (index 2, after Node1)
        list.addAtIndex(2, "Node4");
        System.out.println(list.toString()); // Expected Output: [Node1, Node4]
// Search for a node ("Node4")
        int index = list.search("Node4");
        System.out.println("Node4 is at index: " + index); // Expected
        // Output: Node4 is at index: 2
// Remove a node at index 1 (removes "Node1")
        list.removeAtIndex(1);
        System.out.println(list.toString()); // Expected Output: [Node4]
    }
}