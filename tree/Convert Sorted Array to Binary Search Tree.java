

Convert Sorted Array to Binary Search Tree

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int mid = nums.length / 2;
        int i = 0;
        int j = nums.length;
        
        TreeNode result = trace(nums, i , j);
        return result;
    }
    
    public TreeNode trace(int[] nums,int min, int max){
        if(min == max) return null;
        int mid = (max + min)/2;                  
        TreeNode cur = new TreeNode(nums[mid]);
        cur.right = trace( nums, mid+1,max);
        cur.left = trace(nums, min, mid);
        return cur;
        
    }
}