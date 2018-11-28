Best Time to Buy and Sell Stock II

hints: 看是否連續升高，選擇在連續升高的最高點賣

https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/564/


class Solution {
    public int maxProfit(int[] prices) {
        int value = 0;
        int max = 0, min = 0;
        int i = 1;
            
        while(i<prices.length){
            if(prices[i-1] < prices[i]){
                min = prices[i-1];
                while(prices[i-1] < prices[i])
                {
                    i++;
                    if(i >= prices.length) break;
                }
                max = prices[i-1];
                value+=max-min;
            }
            i++;
        }  
        return value;
        
    }
  
}


class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length-1; i++){
            if (prices[i] < prices[i+1]) profit += prices[i+1]-prices[i];
        }
        return profit;
    }