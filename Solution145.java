class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        Stack<TreeNode> st = new Stack<>();
        List<Integer> l = new ArrayList<>();
        
        if(root == null) return l;
        st.push(root);
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            l.add(curr.val);
            if(curr.left!=null){
                st.push(curr.left);
            }
            if(curr.right != null){
                st.push(curr.right);
            }            
        }
        Collections.reverse(l);
        return l;
    }
}
