public class DHLinkedList implements DHLinkedListInterface {
    int size;
    Node head;

    public DHLinkedList() {
        this.size = 0;
        this.head = new Node(null, null);
    }

    @Override
    public void addFirst(String data) {
        if (this.size == 0) {
            this.head.next = new Node(data, null);
        } else {
            this.head.next = new Node(data, this.head.next);
        }
        this.size++;
    }

    @Override
    public void addLast(String data) {
        if (this.size == 0) {
            this.head.next = new Node(data, this.head.next);
        } else {
            Node current = this.head.next;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data, null);
        }
        this.size++;
    }

    @Override
    public void removeFirst() throws IllegalStateException {
        if (this.size == 0) {
            throw new IllegalStateException();
        }
        this.head.next = this.head.next.next;
        this.size--;
    }

    @Override
    public void removeLast() throws IllegalStateException {
        if (this.size == 0) {
            throw new IllegalStateException();
        }
        if (this.size == 1) {
            this.head.next = null;
        } else {
            Node current = this.head.next;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        this.size--;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        Node current = this.head.next;
        while (current != null) {
            str.append(current.data);
            str.append(" -> ");
            current = current.next;
        }
        return str + "null] size: " + this.size;
    }

    @Override
    public int search(String data) throws IllegalStateException {
        if (this.size == 0) {
            throw new IllegalStateException();
        }
        Node current = this.head.next;
        for (int i = 0; i < this.size; i++) {
            if (current.data.equals(data)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public Node getAtIndex(int index) throws IllegalArgumentException {
        if (size == 0 || index >= this.size || index < 0) {
            throw new IllegalArgumentException();
        }
        Node current = this.head.next;
        for (int i = 0; i < this.size; i++) {
            if (i == index) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public void removeAtIndex(int index) throws IllegalArgumentException {
        if (size == 0 || index >= this.size || index < 0) {
            throw new IllegalArgumentException();
        }
        if (index == 0) {
            this.head.next = this.head.next.next;
        } else {
            Node current = this.head.next;
            for (int i = 0; i < this.size; i++) {
                if (i == index - 1) {
                    current.next = current.next.next;
                    break;
                }
                current = current.next;
            }
        }
        this.size--;
    }

    @Override
    public void addAtIndex(int index, String data) throws IllegalArgumentException {
        if (index > this.size || index < 0) {
            throw new IllegalArgumentException();
        }
        if (index == 0) {
            this.head.next = new Node(data, this.head.next);
        } else {
            Node current = this.head.next;
            for (int i = 0; i < this.size; i++) {
                if (i == index - 1) {
                    current.next = new Node(data, current.next);
                    break;
                }
                current = current.next;
            }
        }
        this.size++;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }
}
