class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<TreeNode> st = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        st.add(root);
        while(!st.isEmpty()){
            TreeNode curr = st.pollLast();
            res.add(curr.val);
            if(curr.right != null){
                st.add(curr.right);
            }
            if(curr.left != null){
                st.add(curr.left);
            }
        }
        return res;
    }
}
