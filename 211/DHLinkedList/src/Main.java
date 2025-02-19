public class Main {
    public static void main(String[] args) {
        DHLinkedList ll = new DHLinkedList();
        ll.addFirst("first");
        System.out.println(ll);
        ll.addFirst("second first");
        System.out.println(ll);
        ll.addLast("last");
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
    }
}