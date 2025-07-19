package DoublyLL;

public class Main {
    public static void main(String[] args) {
        Dll list = new Dll();
        list.insertAtFirst(67);
        list.insertAtFirst(34);
        list.insertAtFirst(23);
        list.insertAtFirst(64);
        list.insertatlast(78);
        list.display();
        list.insert(777,3);
        System.out.println();
        list.display();
    }
}
