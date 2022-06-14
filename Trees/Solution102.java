class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
                
        while(!que.isEmpty()){
            List<Integer> ele = new ArrayList<>();
            int level=que.size();
            for(int i=0;i<level;i++){
                TreeNode curr = que.remove();
                ele.add(curr.val);
                if(curr.left!=null){
                    que.add(curr.left);
                }
                if(curr.right!=null){
                    que.add(curr.right);
                }
            }            
            res.add(ele);
        }        
    return res;    
    }    
}
