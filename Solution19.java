//pointer approach
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n<=0){
            return head;
        }
        ListNode curr = head;
        ListNode nthnode = head;
        for(int i=0;i<n;i++){
            curr = curr.next;
        }
        if(curr == null){
            return head.next;
        }
        while(curr.next != null){
            curr = curr.next;
            nthnode = nthnode.next;           
        }
        nthnode.next = nthnode.next.next;
        
       return head; 
    }
}
