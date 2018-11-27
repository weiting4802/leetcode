
spiral matrix

https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1168/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> noList = new ArrayList<Integer>();
        if(matrix.length == 0 || matrix == null)
            return noList;
        int dir = 0;
        int t = 0;
        int b = matrix.length-1;
        int l = 0;
        int r = matrix[0].length-1;
        
        
        while(t<=b && l<=r)
        {
            if(dir == 0)
            {
                for(int i=l;i<=r;i++)
                {
                    noList.add(matrix[t][i]);
                }
                t++;
            }
            else if(dir == 1)
            {
                for(int i=t;i<=b;i++)
                {
                    noList.add(matrix[i][r]);
                }
                r--;
            }
            else if(dir == 2)
            {
                for(int i=r;i>=l;i--)
                {
                    noList.add(matrix[b][i]);
                }
                b--;
            }
            else if(dir == 3)
            {
                for(int i=b;i>=t;i--)
                {
                    noList.add(matrix[i][l]);
                }
                l++;
            }
            dir = (dir+1)%4;
        }
        return noList;
    }
    
}