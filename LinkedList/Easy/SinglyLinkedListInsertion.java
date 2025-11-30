package LinkedList.Easy;
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
public class SinglyLinkedListInsertion {
    public static void main(String args[]){
        Node head= new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        System.out.println("Before Insertion");
        printList(head);  
        head=insertNodeAtStart(head); 
        System.out.println("\nAfter Insertion at Beginning");
        printList(head);  
        head= insertNodeAtPos(head, 7,50);
        System.out.println("\nAfter Insertion at specified position 7 ");  
        printList(head);
        head=insertBeforeVal(head, 15,20);
        System.out.println("\nBefore Insertion at specified value 20 ");  
        printList(head);

    }
    public static Node insertNodeAtStart(Node head){
        if(head==null){
            Node newhead= new Node(5);
            return newhead;
        }
         Node newhead= new Node(5);
         newhead.next=head;
         head=newhead;
         return head;
    }
    public static Node insertNodeAtPos(Node head, int pos, int val){
        if(head==null){
            if(pos==1){
                Node newhead= new Node(5);
                return newhead;
            }
            else{
                return null;
            }  
        }
        if(pos==1){
            Node newhead=new Node(val,head);
            return newhead;
        }
        Node temp=head;
        int count=1;
        while(count<pos-1 && temp!=null){
            count++;
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("\nPosition out of range");
            return head;
        }
        Node newNode= new Node(val);
        Node nextNode=temp.next;
        temp.next=newNode;
        newNode.next=nextNode;
        return head;

    }
    public static Node insertBeforeVal(Node head, int element, int val){
        if(head==null){
            return null;
        }
        if(head.data==val){
            Node newNode= new Node(element, head);
            return newNode;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.data!=val ){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Value " + val + " not found in list");
            return head;
        }
        Node newNode= new Node(element);
        Node nextNode=temp.next;
        temp.next=newNode;
        newNode.next=nextNode;
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
