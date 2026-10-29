class Solution {
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();

        String combined = s + "#" + rev;

        int n = combined.length();
        int[] lps = new int[n];

        for (int i = 1; i < n; i++) {
            int j = lps[i - 1];

            while (j > 0 && combined.charAt(i) != combined.charAt(j)) {
                j = lps[j - 1];
            }

            if (combined.charAt(i) == combined.charAt(j)) {
                j++;
            }

            lps[i] = j;
        }

        int longestPalindromicPrefix = lps[n - 1];

        String toAdd = rev.substring(0, s.length() - longestPalindromicPrefix);

        return toAdd + s;
    }
}