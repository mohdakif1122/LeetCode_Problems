class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        // int[][] ck = new int[n][n];

        for(int rot = 0 ; rot < 4 ; rot++){     //<360
            int[][] ck = new int[n][n];

            for(int i = n - 1 ; i >= 0 ; i--){ 
                for(int j = 0; j< n ; j++){
                    ck[j][n - i - 1] = mat[i][j];
                }
            }
            
            boolean match = true;
            for(int i = 0 ; i < n ; i++){
                for(int j = 0; j < n ; j++){
                    if(ck[i][j] != target[i][j]){
                        match = false;
                        break;
                    }
                }
                if(!match) break;
            }
            if(match) return true;
            mat = ck;
            
        }   

        return false;
    }
}