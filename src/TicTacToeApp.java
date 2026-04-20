public class TicTacToeApp {

    public static void main(String[] args) {

        // Create a 3x3 board
        char[][] board = new char[3][3];

        // Initialize the board with '-'
        for (int i = 0; i < 3; i++) {          // rows
            for (int j = 0; j < 3; j++) {      // columns
                board[i][j] = '-';
            }
        }

        // Display the board
        System.out.println("Empty Tic-Tac-Toe Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // next line after each row
        }
    }
}
