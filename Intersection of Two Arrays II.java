
Intersection of Two Arrays II

https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int x=0,y=0;
        List<Integer> result = new ArrayList<>();
        while(x < nums1.length && y < nums2.length){
            if(nums1[x] == nums2[y]){
                result.add(nums1[x]);
                x++;
                y++;
            }else if(nums1[x] > nums2[y]){
                y++;                
            }else{
                x++;
            }            
        }
        
        int[] r = new int[result.size()];
        for(int i = 0; i < r.length; i++){
            r[i] = result.get(i);
        }
        
        return r;       
    }
}