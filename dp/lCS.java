package dp;

public class lCS {
  public static int lcs(String X, String Y) {
        int m = X.length();
        int n = Y.length();

        // Create dp table
        int[][] dp = new int[m + 1][n + 1];

        // Fill the table using bottom-up DP
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }}}

        return dp[m][n]; // Length of LCS
    }