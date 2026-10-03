import java.util.*;

class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            for (int j = 0; j <= word.length(); j++) {
                String left = word.substring(0, j);
                String right = word.substring(j);

                if (isPalindrome(left)) {
                    String rev = new StringBuilder(right).reverse().toString();

                    if (map.containsKey(rev) && map.get(rev) != i) {
                        ans.add(Arrays.asList(map.get(rev), i));
                    }
                }

                if (j != word.length() && isPalindrome(right)) {
                    String rev = new StringBuilder(left).reverse().toString();

                    if (map.containsKey(rev) && map.get(rev) != i) {
                        ans.add(Arrays.asList(i, map.get(rev)));
                    }
                }
            }
        }

        return ans;
    }

    private boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}