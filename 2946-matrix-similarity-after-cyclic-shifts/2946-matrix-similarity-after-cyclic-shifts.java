class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        // int m = mat.length;
        // int n = mat[0].length;

        // for(int z = 0 ; z < k ; z++){

        //     for(int i = 0 ; i < m ; i++){
        //         for(int j = 0 ; j < n ; j++){
        //             if(z % 2 == 0 && ){ //even
        //                 mat[i][j + 1] = mat[i][j+1]
        //             }
        //         }
        //     }
        // }
        int m = mat.length;
        int n = mat[0].length;
        k %= n;  //k = 4 % 2

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != mat[i][(j + k) % n]) {
                    return false;
                }
            }
        }
        return true;
    }
}
    