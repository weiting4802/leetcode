
Longest Univalue Path

class Solution {
    int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        trace(root);
        return max;
    }
    
    public int trace(TreeNode root){
        if(root == null ) return 0;
        
        int left = trace(root.left);
        int right = trace(root.right);
        int leftP = root.left!=null && root.left.val == root.val ? left+1 : 0;
        int rightP = root.right!=null && root.right.val==root.val? right+1:0;
        
        max = Math.max(max, leftP+rightP);
        
        return Math.max(leftP,rightP);
    }
}