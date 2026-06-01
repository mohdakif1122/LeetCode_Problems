class Solution {
    public int minimumOperations(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] cost = new int[n][10];

        // Cost to make each column entirely digit d
        for (int col = 0; col < n; col++) {
            int[] freq = new int[10];

            for (int row = 0; row < m; row++) {
                freq[grid[row][col]]++;
            }

            for (int d = 0; d < 10; d++) {
                cost[col][d] = m - freq[d];
            }
        }

        int[][] dp = new int[n][10];

        for (int d = 0; d < 10; d++) {
            dp[0][d] = cost[0][d];
        }

        for (int col = 1; col < n; col++) {
            for (int d = 0; d < 10; d++) {
                dp[col][d] = Integer.MAX_VALUE;

                for (int prev = 0; prev < 10; prev++) {
                    if (prev != d) {
                        dp[col][d] = Math.min(
                            dp[col][d],
                            dp[col - 1][prev] + cost[col][d]
                        );
                    }
                }
            }
        }

        int ans = Integer.MAX_VALUE;

        for (int d = 0; d < 10; d++) {
            ans = Math.min(ans, dp[n - 1][d]);
        }

        return ans;
    }
}