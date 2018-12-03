First Unique Character in a String

class Solution {
    public int firstUniqChar(String s) {
        if(s.length() == 0) return -1;
        if(s.length() == 1) return 0;
        
        Queue<Integer> result =new LinkedList<>();
        
        for(int i = 0; i<s.length(); i++){
            for(int j = 0 ; j<s.length(); j++ ){
                    if(s.charAt(i) == s.charAt(j) && j!=i){                       
                        break;
                    }
                    if(j == s.length()-1){
                        result.add(i);
                    
                }
            }
        }
        return result.isEmpty()? -1 : result.poll();
    }
}

class Solution {
    public int firstUniqChar(String s) {
		
        if(s==null || s.length()==0) 
            return -1;
        int idx = Integer.MAX_VALUE;
        for(char ch='a';ch<='z';++ch){
            int id = s.indexOf(ch);
            if(id!=-1 && id==s.lastIndexOf(ch) && id<idx) 
                idx=id;
        }
        return idx==Integer.MAX_VALUE?-1:idx;
       
    }
}