import java.util.*;

class Solution {
    String s;
    int k;
    int[][][] dp;

    int dfs(int pos, int diff, int rem, boolean tight, boolean started) {
        if (pos == s.length()) {
            return started && diff == 0 && rem == 0 ? 1 : 0;
        }

        if (!tight && started && dp[pos][diff + 10][rem] != -1) {
            return dp[pos][diff + 10][rem];
        }

        int limit = tight ? s.charAt(pos) - '0' : 9;
        int ans = 0;

        for (int d = 0; d <= limit; d++) {
            boolean nt = tight && d == limit;

            if (!started && d == 0) {
                ans += dfs(pos + 1, diff, rem, nt, false);
            } else {
                int ndiff = diff + (d % 2 == 0 ? 1 : -1);
                int nrem = (rem * 10 + d) % k;

                ans += dfs(pos + 1, ndiff, nrem, nt, true);
            }
        }

        if (!tight && started) {
            dp[pos][diff + 10][rem] = ans;
        }

        return ans;
    }

    int count(int n) {
        if (n <= 0) return 0;

        s = String.valueOf(n);
        dp = new int[s.length()][21][k];
        for (int[][] a : dp)
            for (int[] b : a)
                Arrays.fill(b, -1);

        return dfs(0, 0, 0, true, false);
    }

    public int numberOfBeautifulIntegers(int low, int high, int k) {
        this.k = k;
        return count(high) - count(low - 1);
    }
}
