

Binary Tree Preorder Traversal

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        List<Integer> result = new ArrayList<>();
        s.push(root);
        while(!s.isEmpty()){
            TreeNode temp = s.pop();
            if (temp == null) continue;
            result.add(temp.val);
            if(temp.right!=null) s.push(temp.right);
            if(temp.left!=null) s.push(temp.left);
        }
        return result;
    }
}