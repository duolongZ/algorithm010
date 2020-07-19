/**
 * @author:huangzhen
 * @createTime:2020/7/19 22:05
 * @description:回文子串
 */
public class CountSubstrings {

    public int countSubstrings(String s) {
        if (s.length() == 0 || s.equals("")) {
            return 0;
        }
        int result = s.length();
        boolean[][] dp = new boolean[result][result];
        for (int i = 0; i < result; i++) {
            dp[i][i] = true;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i == 1) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }else {
                    dp[i][j] = false;
                }
                if (dp[i][j]){
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CountSubstrings countSubstrings = new CountSubstrings();
        int abc = countSubstrings.countSubstrings("aba");
        System.out.println(abc);
    }
}
