import java.util.Random;

public class TicTacToeApp {

    public static void main(String[] args) {

        // Player names (you can modify later)
        String player1 = "Player 1";
        String player2 = "Player 2";

        // Game state variables
        String currentPlayer;
        char player1Symbol;
        char player2Symbol;

        // 1. Random Toss
        Random random = new Random();
        int toss = random.nextInt(2); // 0 or 1

        // 2. Conditional Logic
        if (toss == 0) {
            currentPlayer = player1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = player2;
            player2Symbol = 'X';
            player1Symbol = 'O';
        }

        // 3. Display Results
        System.out.println("Toss Result Completed!");
        System.out.println(player1 + " Symbol: " + player1Symbol);
        System.out.println(player2 + " Symbol: " + player2Symbol);
        System.out.println("Starting Player: " + currentPlayer);
    }
}
