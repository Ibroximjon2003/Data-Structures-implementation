import java.util.HexFormat;

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
    public void display(ListNode head){
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
    public ListNode deleteLast() {
       if (head ==null || head.next ==null) {
        return head;
       }
       ListNode current = head;
       ListNode previous = null;
       while (current.next!=null) {
        previous = current;
        current = current.next;
       }
       previous.next = null;
       return current;
    }
    //delete node of singly linked list from given position
    public void deleteGivenPosition(int position) {
        if (position==1) {
             head = head.next;
        }
        else{
            ListNode previousNode = head;
            int count = 1;
            while (count < position-1) {
                previousNode=previousNode.next;
                count++;
            }
            ListNode currentNode = previousNode.next;
            previousNode.next= currentNode.next;
        }
    
        
     }
     // search an element in a Singly Linked List
    public boolean isNodeExist(ListNode head,int searchingData) {
        if (head == null) {
            return false;
        } 


        ListNode currentNode = head;
        while (currentNode != null) {
            if (currentNode.data == searchingData) {
                return true;
            }
            currentNode = currentNode.next;
            
        }
        return false;
    }

    //reverse a singly linked list 
    public ListNode reverseLinkedList(ListNode head) {
        ListNode currentNode = head;
        ListNode previousNode = null;
        ListNode nextNode = null;
        while (currentNode!=null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }


    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        sll.insertStart(9);
        sll.display(sll.head);
        ListNode reverseListHead =  sll.reverseLinkedList(sll.head );
        sll.display(reverseListHead);
        
     
    }
}
