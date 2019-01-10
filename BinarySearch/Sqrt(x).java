class Solution {
    public int mySqrt(int x) {
        if(x == 0 ) return 0;
        int i = 1; int j = x/2 + 1;
        
        while(i < j){
            int mid = i + (j-i)/2;
            if(mid == x / mid) return mid;
            else if(mid < x / mid){
                if(mid + 1 > x/(mid+1)) return mid;
                i = mid;
            }else{
                j = mid;   
            }
        }
        return i;
    }
}