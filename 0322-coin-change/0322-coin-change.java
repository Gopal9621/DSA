import java.util.Arrays;

class Solution {

    int[] dp;

    public int coinChange(int[] coins, int amount) {
        dp = new int[amount + 1];
        Arrays.fill(dp, -1);

        int ans = rec(coins, amount);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public int rec(int[] coins, int amount) {

        if (amount == 0) return 0;
        if (amount < 0) return Integer.MAX_VALUE;
        if (dp[amount] != -1) return dp[amount];

        int ans = Integer.MAX_VALUE;

        for (int coin : coins) {
            int sub = rec(coins, amount - coin);

            if (sub != Integer.MAX_VALUE) {
                ans = Math.min(ans, sub + 1);
            }
        }
        return dp[amount] = ans;
    }
}