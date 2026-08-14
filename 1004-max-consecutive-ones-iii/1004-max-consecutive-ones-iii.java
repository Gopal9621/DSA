class Solution {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int z = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                z++;
            }
            while (z > k) {
                if (nums[left] == 0) {
                    z--;
                }
                left++;
            }
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}