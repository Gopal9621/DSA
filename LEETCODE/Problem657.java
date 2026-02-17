public class Problem657 {   // ✅ Class name = file name

    // ✅ Your actual logic (method)
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'U': y++; break;
                case 'D': y--; break;
                case 'L': x--; break;
                case 'R': x++; break;
            }
        }
        return x == 0 && y == 0;
    }

    // ✅ Main method — program starts here
    public static void main(String[] args) {
        Problem657 obj = new Problem657();
        String moves = "UDLR";
        boolean result = obj.judgeCircle(moves);
        System.out.println(result);
    }
}
