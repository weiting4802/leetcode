
Delete Node in a BST

class Solution {
    
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        
        if(root.val > key){
            root.left = deleteNode(root.left,key);
        }else if(root.val < key){
            root.right = deleteNode(root.right, key);
        }else{
             if (root.left == null || root.right == null) {
                TreeNode temp = root.left == null ? root.right : root.left;
                if (temp == null) {
                    return null;
                }
                else {
                    return temp;
                }
            }else{
                 TreeNode min = findMin(root.right);
                 root.val = min.val;
                 root.right = deleteNode(root.right, min.val);
             }
        }
        return root;
        
    }
    
    public TreeNode findMin(TreeNode root){
        while(root.left!=null)
        {
            root = root.left;
        }
        return root;
    }
}