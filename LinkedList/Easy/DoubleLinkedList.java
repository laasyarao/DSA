package LinkedList.Easy;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data1, Node next1, Node prev1) {
        this.data = data1;
        this.next = next1;
        this.prev = prev1;
    }

    public Node(int data1) {
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}

public class DoubleLinkedList {

    // Print DLL from head to tail
    public static void printDll(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Insert at tail
    public static Node insertAtTailNode(Node head, int val) {
        if (head == null) {
            return new Node(val); // FIXED
        }

        Node newNode = new Node(val);
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;

        return head;
    }

    public static Node insertAtPos(Node head, int val, int pos){
        Node newNode= new Node(val);
        if(head==null){
            if(pos==1){
                return newNode;
            }
            else{
                return null;
            }
        }
        if(pos==1){
            newNode.next=head;
            head.prev=newNode;
            return newNode;
        }
        Node current= head;
        int count=1;
        while(count<pos-1 && current!=null){
            count++;
            current=current.next;
        }
        if(current==null){
            System.out.println("Invalid Postion");
            return head;
        }
        if(current.next==null){
            current.next=newNode;
            newNode.prev=current;
            return head;
        }
        Node nextNode=current.next;
        newNode.prev=current;
        newNode.next=nextNode;
        nextNode.prev=newNode;
        return head;
    }

    public static void main(String[] args) {

        // Creating proper DLL (with prev links)
        Node head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        head.next = n2;
        n2.prev = head;

        n2.next = n3;
        n3.prev = n2;

        n3.next = n4;
        n4.prev = n3;

        System.out.println("Double Linked List Initially:");
        printDll(head);

        System.out.println("Double Linked List After Inserting:");
        head = insertAtTailNode(head, 50);
        printDll(head);
        head=insertAtPos(head, 25,3);
        printDll(head);

    }
}
