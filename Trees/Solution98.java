class Solution {
    List<Integer> elements = new ArrayList<>();
    public void inorder(TreeNode root){
        if(root==null)return ;
        inorder(root.left);
        elements.add(root.val);
        inorder(root.right);       
    }
    public boolean isValidBST(TreeNode root) {
        inorder(root);
       for(int i=1;i<elements.size();i++){
           if(elements.get(i)<=elements.get(i-1)){
               return false;
           }
       } 
        return true;
    }
}
