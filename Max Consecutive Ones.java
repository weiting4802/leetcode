 Max Consecutive Ones

https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1301/


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int len = nums.length;
        int max = 0;
        int count = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] == 1){
                ++count;
            }else{
                max = Math.max(max,count);
                count = 0;
            }
        }
        max = Math.max(max,count);
        return max;
    }
}