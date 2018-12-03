
Maximum Depth of Binary Tree

class Solution {
    int answer = 1;
    int depth = 0; 
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        answer = trace(root, depth);
        return answer;
    }
    
    public int trace(TreeNode root, int depth){
       if(root == null) return depth;
        depth++;
        int max  = Math.max(trace(root.left, depth), trace(root.right, depth));
        return max;
    }
}