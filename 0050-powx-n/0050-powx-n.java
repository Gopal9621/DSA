class Solution {
    public double myPow(double x, int n) {

        long power = n;
        boolean negative = false;

        if (power < 0) {
            negative = true;
            power = -power;
        }

        double ans = 1;

        while (power > 0) {

            if (power % 2 == 1) {
                ans = ans * x;
            }

            x = x * x;
            power = power / 2;
        }

        if (negative) {
            return 1 / ans;
        }

        return ans;
    }
}