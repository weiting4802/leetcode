class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        for(int n : nums){
            if(n != 0){
                nums[k] = n;
                k++;
            }
        }
        
        for(int i = k; i < nums.length; i++){
            nums[i]=0;
        }
    }
}