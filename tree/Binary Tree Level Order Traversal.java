
Binary Tree Level Order Traversal

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        trace(root, result);
        return result;
    }
    
    public void trace(TreeNode root, ArrayList<List<Integer>> result){
        if(root == null) return ;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode cur = q.poll();
                temp.add(cur.val);
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
            result.add(temp);
            
        }
     
    }
}


  private void bfsTraverse(TreeNode root, int level, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        if (level == result.size()) result.add(new ArrayList<>());
        result.get(level).add(root.val);
        bfsTraverse(root.left, level + 1, result);
        bfsTraverse(root.right, level + 1, result);
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        bfsTraverse(root, 0, result);
        return result;
    }