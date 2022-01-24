class Solution {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }
       //System.out.println(length);
        int count = 0;
        temp = head;
        while(count<length/2){
           temp = temp.next; 
            count++;
        }
    return temp;
    }
}
