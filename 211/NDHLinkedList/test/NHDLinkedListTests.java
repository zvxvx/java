import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NHDLinkedListTests {

    NDHLinkedList ll = new NDHLinkedList();

    @Test
    void testSearch() {
        ll.addFirst(1);
        ll.addFirst(21);
        assertEquals(1, ll.search(1), "Should return 1.");
    }

    @Test
    void testPrintList() {
        ll.addFirst(1);
        ll.addFirst(21);
        System.out.println("Expected: Our list is: 21 -> 1 -> null");
        System.out.print("Actual: ");
        ll.printList();
    }

    @Test
    void testAddFirst() {
        ll.addFirst(1);
        ll.addFirst(21);
        assertEquals(21, ll.search(0), "Should return 21 as it was the last " +
                "node to be added with the method addFirst");
    }

    @Test
    void testAddLast() {
        ll.addFirst(21);
        ll.addLast(1);
        ll.addFirst(13);
        assertEquals(1, ll.search(2), "Should return 1 as addLast has data 1");
    }

    @Test
    void testRemoveFirst() {
        ll.addFirst(21);
        ll.addLast(1);
        ll.addFirst(13);
        ll.removeFirst();
        assertEquals(21, ll.search(0), "Should return 21, as 13 was removed.");
    }

    @Test
    void testRemoveLast() {
        ll.addFirst(21);
        ll.addLast(1);
        ll.addLast(45);
        ll.addFirst(13);
        ll.removeLast();
        assertEquals(1, ll.search(2), "Should return 1, as 45 was removed.");
    }

    @Test
    void testToString() {
        ll.addFirst(21);
        ll.addLast(1);
        ll.addLast(45);
        ll.addFirst(13);
        ll.removeLast();
        assertEquals("The linked list has 3 nodes in it.", ll.toString());
    }

    @Test
    void testGetAtIndex() {
        ll.addLast(45);
        ll.addFirst(13);
        ll.addFirst(2);
        System.out.println("Index 0: " + ll.getAtIndex(0));
        System.out.println("Index 1: " + ll.getAtIndex(1));
        System.out.println("Index 2: " + ll.getAtIndex(2));
        System.out.println("Expected: Node data for index 1 is 13:\n"
                + ll.getAtIndex(1) + " equals data " + ll.search(1));
    }

    @Test
    void testRemoveAtIndex() {
        ll.addLast(45);
        ll.addFirst(13);
        ll.addFirst(2);
        ll.printList();
        ll.removeAtIndex(1);
        System.out.println("Removing index 1 node with data of 13.");
        ll.printList();
    }

    @Test
    void testAddAtIndex() {
        ll.addLast(45);
        ll.addFirst(13);
        ll.addFirst(2);
        ll.printList();
        ll.addAtIndex(1, 42);
        System.out.println("Adding node with data of 42 to index 1...");
        ll.printList();
    }

    @Test
    void testIsEmpty() {
        assertTrue(ll.isEmpty());
    }
}
