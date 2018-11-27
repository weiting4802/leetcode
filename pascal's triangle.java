pascal's triangle

//https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1170/


//我的解法

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0; i < numRows; i++){
           List<Integer> temp  = new ArrayList<>();
           if(i <= 1){
               for(int j=0; j<=i; j++){
                   temp.add(1);
               }
               result.add(temp);
           }else{
               
               List<Integer> prev = result.get(i-1);               
               for(int j=0 ; j < i+1 ; j++ ){
                   if(j==0 || j == i){
                       temp.add(1);
                   }else{
                       temp.add(prev.get(j) + prev.get(j-1));
                   }
               }
               result.add(temp);
           }
            
        }
        return result;
        
    }
}




//最佳解
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> re = new ArrayList<>();
        List<Integer> line = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            line.add(0, 1);
            for(int j = 1; j < line.size() - 1; j++) {
                line.set(j, line.get(j) + line.get(j + 1));
            }
            re.add(new ArrayList<>(line));
        }
        return re;
    }
}