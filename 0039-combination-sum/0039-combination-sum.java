class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        solution(0, candidates, target, new ArrayList<>());

        return res;
    }

    public void solution(int idx, int[] arr, int target, List<Integer> list) {

        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

        if (idx == arr.length || target < 0) {
            return;
        }

        solution(idx + 1, arr, target, list);

        list.add(arr[idx]);

        solution(idx, arr, target - arr[idx], list);

        list.remove(list.size() - 1);
    }
}