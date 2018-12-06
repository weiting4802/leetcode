class CBTInserter {
    
    TreeNode root = new TreeNode(-1);
    ArrayList<TreeNode> data;
    
    public CBTInserter(TreeNode root) {
        this.root = root;
        this.data = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        data.add(root);
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp.left !=null) q.add(temp.left);
            if(temp.right !=null) q.add(temp.right);
            data.add(temp);
        }
        
    }
    
    public int insert(int v) {
        TreeNode node = new TreeNode(v);
        for(int i = 0 ; i <data.size(); i++){
            TreeNode temp = data.get(i);
            if(temp.left==null){
                temp.left = node;
                data.add(node);
                return temp.val;
            }else if(temp.right == null){
                temp.right = node;
                data.add(node);
                return temp.val;
            }
        }
        
        return 0;
    }
    
    public TreeNode get_root() {
        return this.root;
    }
}
