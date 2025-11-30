package LinkedList.Easy;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class LengthOfLinkedList {
    public int getLength(ListNode head) {
        //recursive
        // if (head == null) return 0;
        // return 1 + getLength(head.next);
        int count = 0;
        ListNode curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }
}
