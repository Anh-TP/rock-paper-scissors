package rock_paper_scissors;
import java.util.Scanner;

public class Players extends Games{

    private String playerName;
    public int score;
    Scanner sc = new Scanner(System.in);

    void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    String getPlayerName() {
        return playerName;
    }

    public int input () {
        System.out.println("\n Select a number: \n 1.Rock  2.Paper  3.Scissors");
        try {
            int playerInput = sc.nextInt();

            if (playerInput == 1) {
                System.out.println("You chose: Rock");
                return playerInput;
            } else if (playerInput == 2) {
                System.out.println("You chose: Paper");
                return playerInput;
            } else if (playerInput == 3) {
                System.out.println("You chose: Scissors");
                return playerInput;
            } else return playerInput;

        }
        catch (RuntimeException mismatch) {
            System.out.println("Invalid input: please enter an integer");
            return 0;
        }
    }

    void addPoints () {
        this.score++;
    }
}



//       catch (InputMismatchException misMatch) {
//        System.out.println("Invalid value - use integers only");
//        }