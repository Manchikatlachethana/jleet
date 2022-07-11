public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        ListNode curr=head;
        while(curr != null){
            if(visited.contains(curr)){
                return curr;
            }
            visited.add(curr);
            curr = curr.next;
        }
        return null;
    }
}
