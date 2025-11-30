package LinkedList.Easy;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        //Recursive
        if(head==null || head.next==null){
            return head;
        }
        ListNode newhead=reverseList(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
         return newhead;
        //Iterative
        // ListNode prev=null;
        // ListNode temp=head;
        // ListNode front=null;
        // while(temp!=null){
        //      front=temp.next;
        //      temp.next=prev;
        //      prev=temp;
        //      temp=front;
        // }
        // return prev;

        //Stack Based Approach
        //     Stack<Integer> st= new Stack<>();
        //     ListNode temp=head;
        //     while(temp!=null){
        //         st.push(temp.val);
        //         temp=temp.next;
        //     }
        //   temp=head;
        //   while(temp!=null){
        //     temp.val=st.pop();
        //     temp=temp.next;
        //   }
        //   return head;
    }
}
