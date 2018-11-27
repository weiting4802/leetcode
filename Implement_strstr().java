Implement strStr()

https://leetcode.com/explore/learn/card/array-and-string/203/introduction-to-string/1161/


class Solution {
    public int strStr(String haystack, String needle) {
        if(needle == "") return 0;
        if(haystack == null || haystack =="") return -1;
        
        int step = needle.length();
        int length = haystack.length();
        
        int i = 0;
        
        while(i <= length - step){        
            int j = i + step;
            String temp = haystack.substring(i,j);
            if(temp.equals(needle)) return i;
            i++;    
        }
            
        return -1;  
    }
    
   
}

best solution

class Solution {
    public int strStr(String haystack, String needle) {
        int index=0;
        if(needle.length() == 0){
            return 0;
        }
        
        for(int i=0; i<haystack.length(); i++){
           
            if( needle.length() > (haystack.length()-i) ){
                return -1;
            }
                           
            for(int j=0; j <needle.length(); j++){
                if(haystack.charAt(i+j) != needle.charAt(j) ){
                    break;
                }

                if(j==needle.length()-1 ){
                    return i;
                }
            }                                  
        }
        return -1; 
    }
    
}