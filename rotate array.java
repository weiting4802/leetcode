
Rotate Array

https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/646/


class Solution {
    public void rotate(int[] nums, int k) {
        int l = 0;
        while(k!=0){
            int j = nums.length-1;
            int temp = nums[j];
            for(int i = 1; i < nums.length; i++){
                nums[j]=nums[j-1];
                j--;
            }
            nums[l] = temp;
            k--;
        }
        
    }
}

class Solution {
    public void rotate(int[] nums, int k) {
        if(nums==null||nums.length==0) return;
        k = k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        
        
    }
    public void reverse(int[]nums, int i, int j){
        while(i<j){
            int temp = nums[i];
            nums[i]= nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
class Solution {
    public void rotate(int[] nums, int k) {
        Deque<Integer> queue = new ArrayDeque<>();
        k %= nums.length;
        int len = nums.length;
        for(int i = len - k; i < len; i++) {
            queue.add(nums[i]);
        }
        for(int i = 0; i < len - k; i++) {
            queue.add(nums[i]);
        }
        for(int i = 0; i < len; i++) {
            nums[i] = queue.remove();
        }
    }
}
