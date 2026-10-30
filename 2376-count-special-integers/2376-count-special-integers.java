class Solution {
    public int countSpecialNumbers(int n) {

        String s = String.valueOf(n);
        int len = s.length();
        int count = 0;

        for (int i = 1; i < len; i++) {
            count += 9 * perm(9, i - 1);
        }
        boolean[] used = new boolean[10];
        for (int i = 0; i < len; i++) {
            int digit = s.charAt(i) - '0';
            int start = (i == 0) ? 1 : 0;

            for (int d = start; d < digit; d++) {
                if (!used[d]) {
                    count += perm(10 - i - 1, len - i - 1);
                }
            }

            if (used[digit]) {
                return count;
            }

            used[digit] = true;
        }

        return count + 1;
    }

    private int perm(int m, int r) {

        int result = 1;

        for (int i = 0; i < r; i++) {
            result *= (m - i);
        }
        return result;
    }
}