
Merge Sorted Array


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m-1;
            int j = n-1;
            int count = m+n-1;
        
            while(i >= 0 && j>=0){
                if(nums1[i] < nums2[j]){
                    nums1[count--] = nums2[j--];
                }
                else {
                    nums1[count--] = nums1[i--];
                }
            }
            
         if(j >= 0) {
            while(j >= 0)
                nums1[j] = nums2[j--];
        }
    }
         
}