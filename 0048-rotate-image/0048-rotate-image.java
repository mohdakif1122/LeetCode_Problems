class Solution {
    public void rotate(int[][] matrix) {
        //convert rows into columns.
        int n = matrix.length;
        int[][] result = new int[n][n];

        for(int row = 0 ; row < n ; row++){
            for(int col = 0 ; col < n ; col++){
                result[col][n - 1 - row] = matrix[row][col];
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                matrix[i][j] = result[i][j];
            }
        }

    }
}