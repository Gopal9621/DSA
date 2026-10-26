class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

        while (num != 0) {
            sb.append(hex[num & 15]);
            num >>>= 4;
        }

        return sb.reverse().toString();
    }
}