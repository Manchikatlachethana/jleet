class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null) return head;
        ListNode temp1 = head;
        ListNode temp2 = head;
        while(temp1!=null && temp1.next != null){
            temp2 = temp2.next; 
            temp1 = temp1.next.next;
                       
        }
       return temp2;         
    }
}
