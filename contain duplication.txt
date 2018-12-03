Contains Duplicate



class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0 ||nums.length == 1) return false;
        
        Arrays.sort(nums);
        int i = 0;
        while(i<nums.length-1){
           if(nums[i] == nums[i+1]){
               return true;
           }
           i++;
        }
        
        return false;      
    }
}