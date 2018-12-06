
Evaluate Reverse Polish Notation

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int result;
        for(int i = 0; i<tokens.length; i++){
            if(s.isEmpty()){
                s.push(Integer.parseInt(tokens[i]));
            }else if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                int n1 = s.pop();
                int n2 = s.pop();
                s.push(operator(n1,n2,tokens[i]));
            }else{
                 s.push(Integer.parseInt(tokens[i]));
            }
        }
        
        return s.pop();
    }
    
    public int operator(int nums1, int nums2, String o){
        int temp = 0;
        switch(o){
            case "+": 
                temp = nums1 + nums2;
                break;
             case "-": 
                temp = nums2 - nums1;
                break;
              case "*": 
                temp = nums1 * nums2;
                break;
              case "/": 
                if(nums1 == 0) break; 
                else temp = nums2 / nums1;
                break;
        }
        
        return temp;
    }
}