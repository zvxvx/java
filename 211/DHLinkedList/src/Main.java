public class Main {
    public static void main(String[] args) {
        // Create a NDHLinkedList instance
        DHLinkedList list = new DHLinkedList();
// Test isEmpty() - should return true initially
        System.out.println("Is the list empty? " + list.isEmpty());
// Test addFirst() - adding to the first position
        list.addFirst("Hello");
        list.addFirst("World");
        System.out.println("After adding Hello and World to the front: " +
                list.toString());
// Test addLast() - adding to the last position
        list.addLast("Data");
        System.out.println("After adding Data to the end: " + list.toString());
// Test removeFirst() - removing the first node
        list.removeFirst();
        System.out.println("After removing the first element: " + list.toString());
// Test removeLast() - removing the last node
        list.removeLast();
        System.out.println("After removing the last element: " + list.toString());
// Test search() - searching for an element in the list
        try {
            int position = list.search("Hello");
            System.out.println("Found Hello at position: " + position);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
// Test removeAtIndex() - removing node at a specific index
        try {
            list.removeAtIndex(0);
            System.out.println("After removing node at index 0: " +
                    list.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
// Test addAtIndex() - adding a node at a specific index
        list.addAtIndex(0, "Friend");
        System.out.println("After adding Friend at index 0: " + list.toString());
// Test isEmpty() - should return false now that list is not empty
        System.out.println("Is the list empty? " + list.isEmpty());
// Test toString() - print the current list
        System.out.println("Current list: " + list.toString());
        // Edge case - test removing from an empty list
        list.removeFirst();
//        list.removeLast();
        System.out.println("After removing all elements: " + list.toString());
// Edge case - searching in an empty list
        try {
            list.search("Hello");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}