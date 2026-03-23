// class Solution {
//     long ans = Long.MIN_VALUE;
//     long MOD = 1000000007;     //10^9 + 7
//     public int maxProductPath(int[][] grid) {
        
//         int row = grid.length;
//         int col = grid[0].length;
//         kaushal(0,0,grid,row,col,1);        //(0,0) --> (m - 1 , n - 1)

//         return (ans >= 0)?(int)(ans%MOD): -1;
        
//     }
//     public void kaushal(int i,int j , int[][] grid , int m , int n ,long prod){

//         if(i > m - 1 || j > n - 1){
//             return;
//         }

//         prod *= grid[i][j];
//         if(i == m - 1 && j == n - 1){
//             if(prod > ans){
//                 ans = prod;
//             }
//             return;
//         }
        
//         kaushal(i + 1 , j , grid , m , n , prod);
//         kaushal(i , j + 1 , grid , m , n , prod); 

        
//     }
// }

class Solution {
    long MAX = 1000000007;
    
    public int maxProductPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        long prod = 1;


        long[][] max = new long[m][n]; // max dp
        long[][] min = new long[m][n]; // min dp

        max[0][0] = min[0][0] = grid[0][0];

        for (int i = 1; i < m; i++) max[i][0] = min[i][0] = max[i - 1][0] * grid[i][0];
        for (int i = 1; i < n; i++) max[0][i] = min[0][i] = max[0][i - 1] * grid[0][i];

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                int curr = grid[i][j];

                long a = max[i - 1][j] * curr;
                long b = min[i - 1][j] * curr;
                long c = max[i][j - 1] * curr;
                long d = min[i][j - 1] * curr;

                max[i][j] = Math.max(Math.max(a, b), Math.max(c, d));
                min[i][j] = Math.min(Math.min(a, b), Math.min(c, d));
            }
        }

        long ans = max[m - 1][n - 1];
        if (ans < 0) return -1;
        return (int) (ans % MAX);
    }

}