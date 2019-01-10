class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        int i = 0, j = nums.length-1;
        int b = nums[i];
        while(i <= j){
            int mid = i + (j-i)/2;
            int num = get(b, nums[mid],target);
            if(num == target) return mid;
            else if(num < target) i = mid +1;
            else j = mid-1;
        }
        
        return -1;
    }
    
    public int get(int p, int num, int target){
        if(target >= p) return num < p? Integer.MAX_VALUE:num;
        else return num >= p? Integer.MIN_VALUE :num;
    }
}