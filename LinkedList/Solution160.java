//Time complexity : O(N+M)
//1
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headA!=null){
            ListNode temp = headB;
            while(temp != null){
                if(headA==temp) return headA;
                temp = temp.next;
            }
            headA = headA.next;
        }
        return null;
    }
}

//2
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> b = new HashSet<>();
        while(headB!=null){
            b.add(headB);
            headB=headB.next;
        }
        while(headA!=null){
            if(b.contains(headA)){
                return headA;
            }
            headA=headA.next;
        }
        return null;
    }
}


//3
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1 = headA;
        ListNode t2 = headB;
        while(t1!=t2){
            if(t1==null){
                t1=headB; 
            }else{
                t1=t1.next;
            }            
            if(t2==null){
                t2=headA; 
            }else{
                t2=t2.next;
            }
            
        }        
        return t1;
    }
}
