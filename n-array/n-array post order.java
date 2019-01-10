class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> answer = new ArrayList<>();
        trace(root, answer);
        return answer;
        
    }
    
    public void trace(Node node, List<Integer> answer){
        if(node == null) return;
        for(Node n : node.children){
            trace(n, answer);
        }
        answer.add(node.val);
    }
}