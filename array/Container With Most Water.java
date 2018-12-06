class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 1) return 0;
//         Set<Integer> set = new HashSet<>();
        int len = height.length;
//         for(int i = 0; i < len;i++){
//             for(int j=0; j<len;j++){
//                 if(i!=j && height[i] >= height[j]){
//                     int width = Math.abs(i-j);
//                     int area = width * height[j];
//                     set.add(area);
//                 }
//             }
//         }
        
//         Integer[] arr = set.toArray(new Integer[set.size()]);
//         Arrays.sort(arr);
//         return (int) arr[arr.length-1];
        
        
            int i = 0 , j= len-1, max = 0;
            while(i<j){
                int area = 0;
                if(height[j] > height[i]){
                    area = height[i] * (j-i);
                    i++;
                }else{
                    area = height[j] * (j-i);
                    j--;
                }
                
                if(area > max){
                    max = area;
                }
            }
        
            return max;
    }
}