class Solution {
    public boolean exist(char[][] board, String word) {
   

        int rows = board.length;
        int cols = board[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                if (dfs(board, word, r, c, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board,
                        String word,
                        int row,
                        int col,
                        int index) {

        // We found the complete word
        if (index == word.length()) {
            return true;
        }

        // Out of bounds
        if (row < 0 || row >= board.length ||
            col < 0 || col >= board[0].length) {
            return false;
        }

        // Current cell doesn't match the word
        if (board[row][col] != word.charAt(index)) {
            return false;
        }

        // Mark current cell as visited
        char temp = board[row][col];
        board[row][col] = '#';

        // Try 4 directions
        boolean found =
                dfs(board, word, row - 1, col, index + 1) || // up
                dfs(board, word, row + 1, col, index + 1) || // down
                dfs(board, word, row, col - 1, index + 1) || // left
                dfs(board, word, row, col + 1, index + 1);   // right

        // Backtrack: restore original character
        board[row][col] = temp;

        return found;
    }
    
}
