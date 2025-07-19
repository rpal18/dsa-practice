package DoublyLL;

import java.sql.SQLOutput;

public class Dll {
    private Node head;


    //for insert at first place
    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;


    }

    public void insertatlast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next=null;
        if(head==null){

            head=node;
            node.prev=null;
            return;

        }
        while(last.next!=null){
            last=last.next;
        }

        last.next = node;
        node.prev=last;

    }
    public void display(){
        Node temp =head;
        Node last=null;
        while(temp!=null){
            System.out.print(temp.val +"-->");
            last=temp;
            temp=temp.next;
        }
        System.out.print("END\n");

        System.out.println("reverse order printing" );
        while(last!=null){
            System.out.print(last.val + "-->");
            last=last.prev;
        }

        System.out.print("START");
    }
    public void insert(int val , int index){
        Node node= new Node(val);

        if(index==0){
            insertAtFirst(val);
        }

        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp=temp.next;
        }
        node.next = temp.next;
        temp.next.prev=node;
        temp.next=node;
        node.prev=temp;
    }
    private class Node{
        private int val;
        private Node next;
        private Node prev;

      public  Node(int val){
            this.val=val ;

        }

        public Node(int val , Node next , Node prev){
          this.val =val;
          this.next=next;
          this.prev=prev;
        }
    }
}
