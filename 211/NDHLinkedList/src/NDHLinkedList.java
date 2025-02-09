public class NDHLinkedList implements NDHLinkedListInterface {
    int size;
    Node head;

    public NDHLinkedList() {
        this.size = 0;
        this.head = null;
    }

    @Override
    public void addFirst(int num) {
        if (size == 0) {
            this.head = new Node(num, null);
        } else {
            this.head = new Node(num, this.head);
        }
        this.size++;
    }

    @Override
    public void addLast(int num) {
        if (this.size == 0) {
            this.head = new Node(num, null);
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(num, null);
        }
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
        Node current = this.head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        this.size--;
    }

    @Override
    public int search(int num) throws IllegalStateException {
        if (num < 0 || num >= this.size || this.size == 0) {
            throw new IllegalStateException();
        }
        Node current = this.head;
        for (int i = 0; i <= num; i++) {
            if (i == num) {
                return current.data;
            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public Node getAtIndex(int num) throws IllegalArgumentException {
        if (num < 0 || num >= this.size || this.size == 0) {
            throw new IllegalStateException();
        }
        Node current = this.head;
        for (int i = 0; i <= num; i++) {
            if (i == num) {
                return current;
            }
            current = current.next;
        }
        return null;

    }

    @Override
    public void removeAtIndex(int num) throws IllegalArgumentException {
        if (num < 0 || num >= this.size || this.size == 0) {
            throw new IllegalStateException();
        }
        if (num == 0) {
            this.head = this.head.next;
        } else {
            Node current = this.head;
            for (int i = 0; i <= num; i++) {
                if (i == num - 1) {
                    current.next = current.next.next;
                    break;
                }
                current = current.next;
            }
        }
        this.size--;
    }

    @Override
    public void addAtIndex(int num, int data) throws IllegalArgumentException {
        if (num < 0 || num >= this.size || this.size == 0) {
            throw new IllegalStateException();
        }
        if (num == 0) {
            this.head = new Node(data, this.head);
        } else {
            Node current = this.head;
            for (int i = 0; i <= num; i++) {
                if (i == num - 1) {
                    current.next = new Node(data, current.next);
                    break;
                }
                current = current.next;
            }
        }
        this.size++;
    }

    @Override
    public String toString() {
        return "The linked list is " + this.size + " nodes long.";
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void printList() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null.\n");
        System.out.println("The total length of the linked list is: " + this.size);
    }
}