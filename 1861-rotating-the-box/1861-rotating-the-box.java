class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n = boxGrid.length;     //no: of col.
        int m = boxGrid[0].length;  //no: of rows.

        for (int i = 0; i < n; i++) {
            int empty = m - 1;

            for (int j = m - 1; j >= 0; j--) {
                if (boxGrid[i][j] == '*') {
                    empty = j - 1;
                } 
                else if (boxGrid[i][j] == '#') {
                    char temp = boxGrid[i][empty];
                    boxGrid[i][empty] = '#';
                    boxGrid[i][j] = temp;
                    empty--;
                }
            }
        }

        //rotation logic.
        char[][] res = new char[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[j][n - 1 - i] = boxGrid[i][j];
            }
        }

        return res;
    }
}