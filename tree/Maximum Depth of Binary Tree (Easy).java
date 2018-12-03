

Maximum Depth of Binary Tree (Easy)

class Solution {
    public int maxDepth(TreeNode root) {
        return trace(root);
    }
      
    
    public int trace(TreeNode root){
        if(root==null) return 0;
        
        int answer = 1;
         answer +=  Math.max(trace(root.left), trace(root.right));
        
        return answer;
    }
}

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