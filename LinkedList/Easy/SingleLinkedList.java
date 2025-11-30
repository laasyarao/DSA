package LinkedList.Easy;
class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1) {
        this.data = data1;  
        this.next = null;   
    }
}


public class SingleLinkedList {

    private static Node deleteHeadNode(Node head){
        Node temp=head;
        head=head.next;
        return temp;
    }
    private static Node deleteKNode(Node head, int k){
        if (head == null) return null;

        // Case 1: Delete the head node
        if (k == 1) {
            return head.next;
        }
        Node prev=null;
        Node temp=head;
        int count=1;
        while(temp!=null){
            if(count==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
            count++;
        }
        return head;
    }
    public static void main(String args[]){
        int arr[]={10,20,30,40};
        Node head= new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp =new Node(arr[i]);
            mover.next = temp;
            mover=temp;
        }
        //printing all values
      
        // while(temp.next!=null){
        //     System.out.print(temp.data + " ");
        //     temp=temp.next;
        // }
        // Node y= new Node(arr[1]);
        // System.out.print(y.data);
        // System.out.print(head.data);
        // System.out.println("Deleted Head Node " +deleteHeadNode(head).data);
        head=deleteKNode(head, 2);
        Node temp=head;
        System.out.println("Delete Kth Node in Linked List " +head);
        while(temp.next!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }

    }
}
