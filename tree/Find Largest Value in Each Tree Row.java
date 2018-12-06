class Solution {
    public List<Integer> largestValues(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            int max = Integer.MIN_VALUE;           
            for(int i = 0; i <size;i++){
                TreeNode temp = q.poll();
                if(max < temp.val) max = temp.val;
                if(temp.right != null) q.add(temp.right);
                if(temp.left != null) q.add(temp.left);
            }
            
            result.add(max);
        }
        return result;
    }
}