class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<String, Integer> map = new HashMap<>();
        int ans = 0;

        for (int i = 0; i <= s.length() - minSize; i++) {
            String sub = s.substring(i, i + minSize);
            int[] freq = new int[26];
            int distinct = 0;

            for (char c : sub.toCharArray()) {
                if (freq[c - 'a']++ == 0) {
                    distinct++;
                }
            }

            if (distinct <= maxLetters) {
                int count = map.getOrDefault(sub, 0) + 1;
                map.put(sub, count);
                ans = Math.max(ans, count);
            }
        }

        return ans;
    }
}