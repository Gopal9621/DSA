import java.util.*;

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> set = new HashSet<>(dictionary);

        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();
        for (String word : words) {
            String root = "";

            for (int i = 1; i <= word.length(); i++) {
                String prefix = word.substring(0, i);

                if (set.contains(prefix)) {
                    root = prefix;
                    break;
                }
            }
            if (root.isEmpty()) {
                root = word;
            }
            if (ans.length() > 0) {
                ans.append(" ");
            }
            ans.append(root);
        }
        return ans.toString();
    }
}