/**
 * @author:huangzhen
 * @createTime:2020/7/19 18:17
 * @description:最大正方形
 */
public class MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        int maxSide = 0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return maxSide;
        }
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1'){
                    if (i == 0 || j == 0){
                        dp[i][j] = 1;
                    }else {
                        dp[i][j] = Math.min(Math.min(dp[i][j - 1],dp[i - 1][j]),dp[i - 1][j - 1]) + 1;
                    }
                    maxSide = Math.max(dp[i][j],maxSide);
                }
            }
        }
        return maxSide * maxSide;
    }

    public static void main(String[] args) {
        char[] char1 = {'1','0','1','0','0'};
        char[] char2 = {'1','0','1','1','1'};
        char[] char3 = {'1','1','1','1','1'};
        char[] char4 = {'1','0','0','1','0'};
        char[][] chars = {char1,char2,char3,char4};
        MaximalSquare maximalSquare = new MaximalSquare();
        int i = maximalSquare.maximalSquare(chars);
        System.out.println(i);
    }
}
