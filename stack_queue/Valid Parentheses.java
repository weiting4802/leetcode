
Valid Parentheses

class Solution {
    public boolean isValid(String s) {
        Stack<Character> result = new Stack<>();
        int i = 0;
        while(i < s.length()){
            if(result.isEmpty()) result.push(s.charAt(i));
            else if(isPair(result.peek(), s.charAt(i))){
                result.pop();
            }else{
                result.push(s.charAt(i));
            }
            i++;
        }
        
        return result.isEmpty() ? true : false;
    }
    
    public boolean isPair(char o, char c){
        if(o == '(' && c == ')') return true;
        else if(o == '[' && c == ']') return true;
        else if(o == '{' && c == '}') return true;
        else return false;
    }
}