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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null) return null;
        ArrayList<Integer> values = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode curr = lists[i];
           while(curr != null){
               values.add(curr.val);
               curr = curr.next;
           }        
        }        
        ListNode temp = new ListNode(0);
        ListNode res = temp;
        Collections.sort(values);
        for(int i:values){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
       
        return res.next;
    }
}
