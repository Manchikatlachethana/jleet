class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> l = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            l.add(curr.val);
            curr=curr.next;
        }
        int left=0;
        int right=l.size()-1;
        while(left<right){
            if(l.get(left)!=l.get(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
