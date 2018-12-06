 Max Area of Island
 
 class Solution {
    int max = Integer.MIN_VALUE;
    int w = 0;
    int h = 0;
    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length == 0) return 0;
        w = grid.length;
        h = grid[0].length;
        
        for(int i = 0; i < w; i++){
            for(int j = 0; j < h; j++){
                if(grid[i][j] == 1){
                    int sum = bfs(grid, i, j);
                    if(sum > max) max = sum;
                }
            }
        }
        
        return max == Integer.MIN_VALUE ? 0 : max;
    }
    
    public int bfs(int[][] grid, int i, int j){
        if(i >= w || i < 0 || j>=h || j < 0 || grid[i][j] == 0){
            return 0;
        }
        grid[i][j] = 0;
        
        int up = bfs(grid, i-1, j);
        int down = bfs(grid, i+1, j);
        int right = bfs(grid, i, j+1);
        int left = bfs(grid, i, j-1);
        
        return up + down + right + left + 1; 
    }
}