
 Two Sum II - Input array is sorted

https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1153/


class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        if(numbers == null || len == 1) return null;
        int i = 0;
        int j = len-1;
        
        while(i<j){
            int temp = numbers[i] + numbers[j];
            if(temp > target) j--;
            else if(temp < target) i++;
            else break;            
        }
        
        return new int[]{i+1,j+1};
        
    }
}