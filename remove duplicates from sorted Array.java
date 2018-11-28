
Remove Duplicates from Sorted Array

https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/

class Solution {
    public int removeDuplicates(int[] nums) {

        int k=0;        
        for(int i = 0; i<nums.length; i++){
            if(i==0){
                nums[k]=nums[i];
                k++;
            }
            else{
                if(nums[i] == nums[i-1]){
                    continue;
                }else{
                    nums[k]=nums[i];
                    k++;
                }
            }
        }
        return k;
        
    }
}