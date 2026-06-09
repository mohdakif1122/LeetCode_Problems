class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;      //row =
        int n = matrix[0].length;   //col ||

        boolean[] zerorow = new boolean[m];
        boolean[] zerocol = new boolean[n];

        for(int row = 0 ; row < m ; row++){
            for(int col = 0 ; col < n ; col++){
                if(matrix[row][col] == 0){
                    zerorow[row] = true;
                    zerocol[col] = true; 
                }
            }
        }
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(zerorow[i] || zerocol[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}