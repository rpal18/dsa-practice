package Single_LinkedList;

public class Single {
    private Node head ;
    private Node tail;
    private int size;

    //getter method to get the tail and head of linked list
    public Node get_head(){
        return head;

    }
    public Node get_tail(){
        return tail;

    }

    Single(){
        this.size =0;
    }
  public Node get(int index){
        Node temp = head;
      for (int i = 0; i < index ; i++) {
          temp=temp.next;
      }
      return temp;
  }
    //to insert
    public void insertat_first(int val ){
        Node node  = new Node(val);
        node.next = head;
        head=node;

        if(tail==null){
            tail=head;
        }

        size+=1;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(head==null){
            insertat_first(val);
        }
        else {
            Node temp = head;
            for (int i = 0; i < size - 1; i++) {
                temp = temp.next;
            }
            temp.next = node;
            node.next = null;
        }

        size++;
    }

    public void insert(int val , int index){
        Node node = new Node(val);
        if(index == 0){
            insertat_first(val);
        }
        if(index==size-1){
            insertLast(val);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        size++;
    }

    //RECURSIVE INSERTION
    public void insertion_recursive(){}

    public void display(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.val + "-->");
            temp =temp.next;
        }

        System.out.print("END");


    }
    public int deleteFirst(){
        int val = head.val;
        head=head.next;
        if(head == null){
            tail =null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        Node Secoond_last = get(size-2);

        tail=Secoond_last;
        tail.next=null;
        int val =tail.val;
        size--;
        if(size<=1){
           return deleteFirst();
        }

        return val;
    }

    public int deleteAtindex(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size){
            return deleteLast();
        }
        int val=get(index).val;
        Node previous = get(index-1);
        previous.next =previous.next.next;

        size--;
        return val;
    }
    //Question on linkedlist

   //https://leetcode.com/problems/linked-list-cycle/

    public boolean hasCycle(Node head) {
        Node slow = head ;
        Node fast = head ;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;


        }
        return false;

    }
    //find the length of cycle
    public int lengthofLength(Node head) {
        Node slow = head ;
        Node fast = head ;
        int counter =0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast) {
                Node temp = slow;
                //i am going to use do while loop because i want my code to execute at least once.
                do{
                    temp=temp.next;
                    counter++;
                }while(temp!=slow);
            }


        }
        return counter;

    }



    //example of nested class
    private class Node{
        private int val;
        private Node next;

        public Node(int val ){
            this.val = val;

        }

        public  Node(int val , Node next){
            this.val =val;
            this.next = next ;
        }
    }

}
