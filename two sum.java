
Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length;i++){
            for(int j = i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target)
                    return new int[]{i,j};
            }
        }
        
        return null;
        
    }
}


import java.util.HashMap;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i = 0; i < nums.length; i++)
      hm.put(nums[i], i);
    
    for (int i = 0; i < nums.length; i++) {
      int n = nums[i];
      int m = target - n;
      if (hm.containsKey(m)) {
        int j = hm.get(m);
        if (i == j) continue;
        return new int[] {i, j};
      }
    }
    return new int[] {-1, -1};
  }
}