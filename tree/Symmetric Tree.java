
Symmetric Tree

class Solution {

    public boolean isSymmetric(TreeNode root) {
      return root == null || trace(root.left, root.right);
    }
    
    public boolean trace(TreeNode left, TreeNode right){
        if(left == null && right == null ) return true;
        
        if(left== null || right == null ) return false;
        
        if(left.val != right.val) return false;
      
        return trace(left.left, right.right) && trace(left.right, right.left);
    
    }
        
   
}