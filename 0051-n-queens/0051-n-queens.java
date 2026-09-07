class Solution {
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        solve(0, board, ans, n);
        return ans;
    }
    public void solve(int row, char[][] board,
                      List<List<String>> ans, int n) {
        if (row == n) {

            List<String> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                list.add(new String(board[i]));
            }

            ans.add(list);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';
                solve(row + 1, board, ans, n);
                board[row][col] = '.';
            }
        }
    }
    public boolean isSafe(int row, int col,
                           char[][] board, int n) {

        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        int i = row - 1;
        int j = col - 1;

        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j--;
        }
        i = row - 1;
        j = col + 1;

        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j++;
        }

        return true;
    }
}