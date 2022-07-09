/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteNodes(ListNode head, int m, int n) {
       ListNode curr = head;
        ListNode prev = head;
        while(curr != null){
            int mcount = m, ncount = n;
            while(curr != null && mcount != 0){
                prev = curr;
                curr = curr.next;
                mcount--;
            }
            while(curr != null && ncount != 0){
                curr = curr.next;
                ncount--;
            }
            prev.next = curr;
        }
        return head;
    }
}
