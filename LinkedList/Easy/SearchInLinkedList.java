package LinkedList.Easy;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SearchInLinkedList {
    public static int searchIndex(Node head, int target) {
        int index = 0;
        Node curr = head;
    
        while (curr != null) {
            if (curr.data == target) {
                return index;
            }
            curr = curr.next;
            index++;
        }
        return -1;  // not found
    }    
}
