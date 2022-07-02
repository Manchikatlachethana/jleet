class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        int level = 0;
        while(!que.isEmpty()){
            List<Integer> elements = new ArrayList<>();
            int size = que.size();
            for(int i=0;i<size;i++){
                TreeNode node = que.remove();
                if(node.left != null){
                    que.add(node.left);
                }
                if(node.right != null){
                    que.add(node.right);
                }
                elements.add(node.val);
            }
            if(level %2 == 1){
                Collections.reverse(elements);
            }
            res.add(elements);
            level++;            
        }
        return res;        
    }
}
