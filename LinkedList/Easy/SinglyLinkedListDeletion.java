package LinkedList.Easy;
//Delete at Head
//Delete at Position
//Delete by Value
//Delete at Tail
class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }
    
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class SinglyLinkedListDeletion {
    public static void main(String args[]){
        Node head= new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        System.out.println("Before Insertion");
        printList(head);
        head=deleteAtHead(head);
        System.out.println("\nAfter Head Deletion");
        printList(head);
        head=deleteByPos(head, 4);
        System.out.println("\nAfter Deletion by Pos 4");
        printList(head);
        head=deleteByVal(head, 50);
        System.out.println("\nAfter Deletion by Val 50");
        printList(head);


    }
    public static Node deleteAtHead(Node head){
        if(head==null||head.next==null){
            return null;
        }
        return head.next;
    }
    public static Node deleteByPos(Node head, int pos){
       if(head==null){
        return null;
       }
        if(pos==1){
            return head.next;
        }
        int count=1;
        Node temp=head;
        while(count<pos-1 && temp!=null){
            count++;
            temp=temp.next;
        }
        if(temp==null || temp.next==null){
            System.out.println("\n Invalid Postion");
            return head;
        }
        temp.next=temp.next.next;
        return head; 
}
public static Node deleteByVal(Node head, int val){
    if(head==null){
        return null;
    }
    if(head.data==val){
        return head.next;
    }
    Node temp=head;
    while(temp.next!=null && temp.next.data!=val){
        temp=temp.next;
    }
    if(temp.next==null){
        System.out.println("\nInvalid Value");
        return head;
    }
    temp.next=temp.next.next;
    return head;
}
    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
}
