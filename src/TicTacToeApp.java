import java.util.Scanner;

public class TicTacToeApp {

    // Method to take user input
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();   // Read integer input

        return slot;  // Return the value
    }

    public static void main(String[] args) {

        int userSlot = getUserInput();  // Call method

        System.out.println("You selected slot: " + userSlot);
    }
}

