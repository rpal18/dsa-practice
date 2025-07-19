package Single_LinkedList;

public class Main {
    public static void main(String[] args) {
        Single ll = new Single();

        ll.insertLast(3);
        ll.insertLast(2);
        ll.insertLast(0);
        ll.insertLast(-4);
        ll.display();
        //System.out.println(ll.deleteFirst());
        System.out.println(ll.deleteLast());
        System.out.println(ll.lengthofLength());
        ll.display();
    }
}
