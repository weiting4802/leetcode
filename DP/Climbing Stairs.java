class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        
        int[] cost = new int[n];
        cost[0] = 1;
        cost[1] = 2;
        for(int i = 2; i <n ; i++){
            cost[i] = cost[i-1] + cost[i-2];
        }
        
        return cost[n-1];
    }
}