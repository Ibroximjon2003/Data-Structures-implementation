

public class LinkedListOperation {
  public ListNode middleNode() {
    ListNode slowPtr = head;
    ListNode fastPtr = head;
    while (fastPtr!=null && fastPtr.next != null) {
        slowPtr = slowPtr.next;
        fastPtr = fastPtr.next.next;
    }
    return slowPtr;
  }
}
