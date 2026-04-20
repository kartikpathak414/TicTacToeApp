public class TicTacToeApp {

    // Method to validate move
    public static boolean isValidMove(char[][] board, int row, int col) {

        // 1. Boundary check (0–2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // 2. Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true; // Valid move
    }

    public static void main(String[] args) {

        // Sample board
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        int row = 1;
        int col = 1;

        if (isValidMove(board, row, col)) {
            System.out.println("Valid move!");
        } else {
            System.out.println("Invalid move!");
        }
    }
}

