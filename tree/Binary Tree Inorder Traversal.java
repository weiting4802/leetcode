
Binary Tree Inorder Traversal

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
    
        if(root == null) return new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        List<Integer> result = new ArrayList<>();
        TreeNode cur = root;
        while( cur !=null || !s.isEmpty()){
           while(cur!=null){
               s.push(cur);
               cur=cur.left;
           }
           TreeNode temp = s.pop();
           result.add(temp.val);
           cur = temp.right;
        }
    
        return result;

    }
}