class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int value = 0;
        int counter = 0;
        for(int i : nums){
            counter += i;
            if(counter > max ){
                max = counter;
            }
            
            if(counter < 0){
                counter = 0;
            }
        }
        return max;
    }
}