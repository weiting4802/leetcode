
Sum of Square Numbers

class Solution {
    public boolean judgeSquareSum(int c) {
        
        
        int i = 0 , j = (int) Math.sqrt(c);
        
        while(i<= j){
            int sum = i*i + j*j;
            if(sum > c){
                j--;
            }else if(sum < c){
                i++;
            }else
                return true;
            
        }
        return false;
        
    }
}