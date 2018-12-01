

Average of Levels in Binary Tree


class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Double> result = new ArrayList<>();
        while(!q.isEmpty()){
            int size = q.size();
            double mean = 0;
            
            for(int i=0;i<size;i++ ){
                TreeNode temp = q.poll();
                if(temp.right!=null) q.add(temp.right);
                if(temp.left!=null) q.add(temp.left);
                mean+=(double)temp.val;
            }
            mean = mean / size;
            result.add(mean);
        }
        return result;
    }
}