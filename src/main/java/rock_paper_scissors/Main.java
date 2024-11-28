package rock_paper_scissors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Computer c1 = new Computer();
        Players p1 = new Players();

        System.out.println("Enter your name to start playing:");
        p1.setPlayerName(sc.next());

        System.out.println("Hello " + p1.getPlayerName() + "! Let's play!");

//        Start game
        Games.playGame(p1.input(),c1.input());
    }
}