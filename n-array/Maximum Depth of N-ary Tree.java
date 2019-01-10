class Solution {
    int max = Integer.MIN_VALUE;
    public int maxDepth(Node root) {
        
        return trace(root);
    }
    
    public int trace(Node node){
        if(node == null) return 0;
        
        else if (node.children.isEmpty()) 
        return 1;
        
        ArrayList<Integer> h = new ArrayList<>();
        for(Node n : node.children){
           h.add(trace(n));
        }
        return Collections.max(h) +1 ;
    }
}