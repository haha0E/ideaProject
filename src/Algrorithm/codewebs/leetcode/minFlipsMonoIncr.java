package Algrorithm.codewebs.leetcode;

public class minFlipsMonoIncr {
    public static void main(String[] args) {

    }

    public int minFlipsMonoIncr(String s) {
        char[] cs = (" "+s).toCharArray();
        int n = cs.length;
        int[][] dp = new int[n + 1][2];
        for (int i = 1; i <=n ; i++) {
            dp[i][0]=dp[i-1][0]+(cs[i]==1?1:0);
            dp[i][1]=Math.min(dp[i][0],dp[i-1][1]+(cs[i]==0?1:0));
        }
        return Math.min(dp[n][0],dp[n][1]);
    }
}
