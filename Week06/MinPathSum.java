/**
 * @author:huangzhen
 * @createTime:2020/7/19 1:27
 * @description:最小路径和
 */
public class MinPathSum {

    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        int m = grid.length, n = grid[0].length;
        dp[m - 1][n - 1] = grid[m - 1][n - 1];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j == n - 1) {
                    continue;
                }
                if (i == m - 1 && j != n - 1)
                    dp[i][j] = grid[i][j] + dp[i][j + 1];
                else if (j == n - 1 && i != m - 1)
                    dp[i][j] = grid[i][j] + dp[i + 1][j];
                else
                    dp[i][j] = grid[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
            }
        }
        return dp[0][0];
    }
}
