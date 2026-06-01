class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int row = 0 ; row < m  ; row++){
            for(int col = 0 ; col < n  ; col++){
                // if(grid[row][col] != grid[row][col + 1]) return true;
                // if(grid[row][col] == grid[row + 1][col]) return true;
                if (row + 1 < m && grid[row][col] != grid[row + 1][col]) {
                    return false;
                }
                if (col + 1 < n && grid[row][col] == grid[row][col + 1]) {
                    return false;
                }
            }
        }
        // return false;
        return true;
    }
}
