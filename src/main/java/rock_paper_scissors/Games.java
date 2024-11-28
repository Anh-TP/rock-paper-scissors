package rock_paper_scissors;

import java.util.Scanner;

public class Games {

    static Players p1 = new Players();
    static Computer c1 = new Computer();

    static void playGame(int playerInput, int computerInput) {
        boolean gameStarted = true;

        while (gameStarted) {
            if (playerInput != 1 && playerInput != 2 && playerInput != 3) {
                System.out.println("Error: You must select a number between 1 and 3, Let's try again.");
                playGame(Players.p1.input(), Computer.c1.input());
            } else if (playerInput == computerInput) {
                System.out.println("It's a draw! Let's play again.");
                playGame(Players.p1.input(), Computer.c1.input());
            } else if (playerInput == 1 && computerInput == 2) {
                System.out.println("Computer chose: Paper");
                System.out.println("Yaay, you win!");
                p1.addPoints();
            } else if (playerInput == 2 && computerInput == 1) {
                System.out.println("Computer chose: Rock");
                System.out.println("Computer wins, better luck next time :(");
                c1.addPoints();
            } else if (playerInput == 3 && computerInput == 2) {
                System.out.println("Computer chose: Paper");
                System.out.println("Yaay, you win!");
                p1.addPoints();
            } else if (playerInput == 2 && computerInput == 3) {
                System.out.println("Computer chose: Scissors");
                System.out.println("Computer wins, better luck next time :(");
                c1.addPoints();
            } else if (playerInput == 1 && computerInput == 3) {
                System.out.println("Computer chose: Scissors");
                System.out.println("Yaay, you win!");
                p1.addPoints();
            } else if (playerInput == 3 && computerInput == 1) {
                System.out.println("Computer chose: Rock");
                System.out.println("Computer wins, better luck next time :(");
                c1.addPoints();
            } else {
                break;
            }
            gameStarted = false;
            newGame();
        }
    }

    static void newGame() {
        System.out.println("Play again? Y/N");
        Scanner sc = new Scanner(System.in);
        String play = sc.next().toLowerCase();

        switch (play) {
            case "n":
                System.out.println("Great game, see you next time!");
                break;
            case "y":
                System.out.println("Let's Play!");
                playGame(Players.p1.input(), Computer.c1.input());
                break;
            default:
                System.out.println("Great game, see you next time!");

        }
    }
}