class Solution {
    public int deleteAndEarn(int[] nums) {

        int max = 0;

        for (int x : nums)
            max = Math.max(max, x);

        int[] sum = new int[max + 1];

        for (int x : nums)
            sum[x] += x;

        int[] dp = new int[max + 1];

        dp[1] = sum[1];

        for (int i = 2; i <= max; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + sum[i]);
        }

        return dp[max];
    }
}