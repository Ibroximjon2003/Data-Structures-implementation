

public class SinglyLinkedList {
    private ListNode head;
    private static class ListNode {
    private int data;
    private ListNode next;

    //implementation of node of singly linked list
    public ListNode(int data){
        this.data = data;
        this.next = null;
     }
    }

    //printing elements of singly linked list
    public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data+"--> ");
            current = current.next;
        }
        System.out.println("null");
    }

    //length of singly linked list
    public int length() {
        int count = 0;
        ListNode current = head;
        if (head==null) {
            return 0;
        }
        while(current!=null){
          count++;
          current = current.next;
        }
        return count;
    }

    // insert new node at the beginning of singly linked list
    public void insertStart(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }
    //insert node at the end of singly linked list
    public void insertEnd(int data) {
        ListNode newNode = new ListNode(data);
        
        ListNode current = head;
        while (current.next!=null) {
            current = current.next;
        }
        current.next = newNode;

    }

    //insert node at a given position of singly linked list
    public void insertGivenPosition(int position, int data) {
        ListNode newNode = new ListNode(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        }
        else {
            ListNode previous = head;
            int count = 1; //position-1
            while (count<position-1) {
                previous = previous.next;
                count++; 
            }
            ListNode current = previous.next; 
            previous.next = newNode;
            newNode.next = current;
        }
        
    }



    //delete first node of singly linked list
    public ListNode deleteFirst() {
        if (head==null) {
            return null;
        }
        ListNode temp = head;
        head= head.next;
        temp.next = null;
        return temp;
    }

    //delete last node of singly linked list
    // public ListNode deleteLast() {
    //     if (head==null) {
    //         return null;
    //     }
    //     ListNode temp = head;
    //     head= head.next;
    //     temp.next = null;
    //     return temp;
    // }


    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        // sll.head = new ListNode(10);
        // ListNode second = new ListNode(1);
        // ListNode third  = new ListNode(8);
        // ListNode fourth = new ListNode(11);
        // sll.head.next = second;
        // second.next = third;
        // third.next = fourth;
        // sll.display();
        // System.out.println(sll.length());
        sll.insertStart(100);
        sll.display();
        sll.insertEnd(50);
        sll.display();
        sll.insertGivenPosition(2, 15);
        sll.display();
        sll.deleteFirst();
        sll.display();
    }
}
