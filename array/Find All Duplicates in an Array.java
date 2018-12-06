class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        
        for(int i : map.keySet()){
            if(map.get(i) == 2) 
                result.add(i);
        }
        
        return result;
        
    }
}


class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] arr = new int[nums.length+1];
        for(int n:nums) arr[n]++;
        
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2) 
                res.add(i);
        }
        return res;
    }
}