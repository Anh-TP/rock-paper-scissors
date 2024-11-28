package rock_paper_scissors;

public class Computer extends Games{

    int score = 0;

    int input () {
        int randomNum = 1 + (int)(Math.random() * ((3 - 1) + 1));
        if (randomNum == 1) {
            return randomNum;
        } else if (randomNum == 2) {
            return randomNum;
            } else {
            return randomNum;
        }
    }

    void addPoints () {
        this.score++;
    }
}
