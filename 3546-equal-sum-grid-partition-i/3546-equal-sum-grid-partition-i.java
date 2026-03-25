class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;    //rows
        int n = grid[0].length; //cols
        long sum = 0;

        for(int i = 0 ; i < m ; i++){   //iterate over rows
            for(int j = 0 ; j < n ; j++){   //iterate over cols
                sum += grid[i][j];
            }
        }
        if(sum % 2 != 0) return false;

        long x = 0;
        for(int i = 0 ; i < m - 1 ; i++){   //iterate over rows
            for(int j = 0 ; j < n ; j++){   //iterate over cols
                x += grid[i][j]; //6
            }
            if(x == sum/2) return true;
        }
        long y = 0;
        for(int j = 0 ; j < n - 1 ; j++){   //iterate over cols
            for(int i = 0 ; i < m ; i++){   //iterate over rows
                y += grid[i][j];
            }
            if(y == sum/2) return true;
        }
        return false;
    }
}