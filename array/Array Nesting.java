



class Solution {
    Set<Integer> set = new HashSet<>();
    int size = 0;
    public int arrayNesting(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            set = new HashSet<>();
            int sum = trace(nums,i);
            if(sum > size){
                size = sum;
            }
        }
        return size;
    }
    
    public int trace(int[] nums, int i){
        if(!set.add(i)) return 0;
        return 1 + trace(nums, nums[i]);
    }
}