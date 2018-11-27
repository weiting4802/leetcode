Longest Common Prefix


https://leetcode.com/explore/learn/card/array-and-string/203/introduction-to-string/1162/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null) return "";
        if(strs.length == 1) return strs[0];
        
        String temp = "";
        int max = 0;
        int max_length = Integer.MAX_VALUE;
        String result = "";
        for(String s : strs){
            if(s.length() > max){
                max = s.length();
                temp = s;    
            }
        }
        for(String s : strs){
            int count = 0;
            String tempString = "";
            for(int j = 0; j<s.length(); j++){
                if(temp.charAt(j) == s.charAt(j)){ 
                    tempString += temp.charAt(j);
                    count++;
                }else{
                    break;
                }
            }
            if(count < max_length){
                result = tempString;
                max_length = count;
            }             
        }
        
      return result;        
    }
}


best solution

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if(prefix.length() == 0)
                return "";
        }
        return prefix;
    }
}