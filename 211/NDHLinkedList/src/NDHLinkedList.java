public class NDHLinkedList implements NDHLinkedListInterface {
    int size;
    Node head;

    public NDHLinkedList() {
        this.size = 0;
        this.head = null;
    }

    @Override
    public void addFirst(int num) {
        this.head = new Node(num, this.head);
        this.size++;
    }

    @Override
    public void addLast(int num) {
        Node last = new Node(num, null);
        if (this.head == null) {
            this.head = last;
            this.size++;
            return;
        }
        Node current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = last;
        this.size++;
    }

    @Override
    public void removeFirst() throws IllegalStateException {
        if (this.size == 0) {
            throw new IllegalStateException();
        }
        this.head = this.head.next;
        this.size--;
    }

    @Override
    public void removeLast() throws IllegalStateException {
        if (this.size == 0) {
            throw new IllegalStateException();
        }
        if (this.head.next == null) {
            this.head = null;
        }
        Node current = this.head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        this.size--;
    }

    @Override
    public String toString() {
        return "The linked list has " + this.size + " nodes in it.";
    }

    @Override
    public int search(int num) throws IllegalStateException {
        if (this.size == 0) {
            throw new IllegalStateException();
        }
        Node current = this.head;
        for (int i = 0; i < this.size; i++) {
            if (i == num) {
                return current.data;
            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public Node getAtIndex(int i) throws IllegalArgumentException {
        if (i < 0 || i >= this.size) {
            throw new IllegalArgumentException();
        }
        Node current = this.head;
        int index = 0;
        while (current != null) {
            if (i == index) {
                return current;
            }
            current = current.next;
            index++;
        }
        return null;
    }

    @Override
    public void removeAtIndex(int i) throws IllegalArgumentException {
        if (i < 0 || i >= this.size) {
            throw new IllegalArgumentException();
        }

        if (i == 0) {
            this.head = this.head.next;
        } else {
            Node current = this.head;
            for (int idx = 0; idx < i - 1; idx++) {
                current = current.next;
            }
            current.next = current.next.next;
            this.size--;
        }
    }

    @Override
    public void addAtIndex(int i, int data) throws IllegalArgumentException {
        if (this.size == 0 || i > this.size) {
            throw new IllegalArgumentException();
        }

        if (i == 0) {
            this.head = new Node(data, this.head);
        } else {
            Node current = this.head;
            for (int idx = 0; idx < i - 1; idx++) {
                current = current.next;
            }
            current.next = new Node(data, current.next);
            this.size++;
        }
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void printList() {
        System.out.print("Our list is: ");
        Node current = this.head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
