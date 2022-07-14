class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parentval = root.val;
        int pval = p.val;
        int qval = q.val;
        if(pval>parentval && qval>parentval){
            return lowestCommonAncestor(root.right,p,q);
        }else if(pval<parentval && qval<parentval){
            return lowestCommonAncestor(root.left,p,q);
        }else{
            return root;
        }
    }
}
