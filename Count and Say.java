


class Solution {
    public String countAndSay(int n) {
        if(n == 1) return Integer.toString(n);
        
        String result = "1";
        
        for(int i = 1; i < n; i++){
            char start = result.charAt(0);
            String temp = result;
            int count = 0;
            
            result = "";
            
            for(int j = 0; j < temp.length(); j++){                
                if(temp.charAt(j) == start){
                    count ++;
                }else{
                    result+= count;
                    result+= start;
                    start = temp.charAt(j);
                    count = 1;
                }
            }
            result += count;
            result += start;            
        }
        return result;
    }
}