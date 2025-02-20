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
        System.out.println(ll.search("first"));
        System.out.println(ll.getAtIndex(0));
        System.out.println(ll);
        ll.removeAtIndex(0);
        System.out.println(ll);
    }
}