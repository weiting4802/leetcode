 Array Partition I

https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1154/

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0; i<nums.length-1; i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}

best 

public class Solution {
    public int arrayPairSum(int[] nums) {
        int[] arr = new int[20001];
        int lim = 10000;
        for (int num: nums)
            arr[num + lim]++;
        int d = 0, sum = 0;
        for (int i = -10000; i <= 10000; i++) {
            if(arr[i + lim] == 0) continue;
            sum += (arr[i + lim] + 1 - d) / 2 * i;
            d = (arr[i + lim] - d) % 2;
        }
        return sum;
    }
} 