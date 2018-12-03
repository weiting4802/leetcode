

Balanced Binary Tree (Easy)

class Solution {
    
    boolean answer = true;
    
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        trace(root);
        return answer;
    }
    
    public int trace(TreeNode root){
        if(root == null) return 0;
        
        int right = trace(root.right);
        int left  = trace(root.left);
        
        if(Math.abs(right-left) > 1){
            answer = false;
        }
        
        return Math.max(right,left)+1;
    }
}