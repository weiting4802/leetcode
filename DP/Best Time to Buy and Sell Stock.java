class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length == 1) return 0;
        
        int buy = prices[0];
        int max = 0;
        
        for(int i = 1; i<prices.length;i ++){
            
            if(prices[i] > buy){
                max = Math.max(max, prices[i] - buy);
            }else{
                buy = prices[i];
            }
        }
        return max ;
        
    }
}