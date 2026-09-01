class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtrack(nums, used, new ArrayList<>(), ans);

        return ans;
    }

    static void backtrack(int[] nums, boolean[] used,
                          List<Integer> list,
                          List<List<Integer>> ans) {

        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i]) {
                continue;
            }

            list.add(nums[i]);
            used[i] = true;

            backtrack(nums, used, list, ans);

            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}