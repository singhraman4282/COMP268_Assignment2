/*
 Craps is a dice game where two dice are rolled. Each die has six faces representing values
1, 2, 3, 4, 5, or 6.
I. If the sum is 2, 3, or 12 (called craps), you lose;
II. If the sum is 7 or 11 (called natural), you win;
III. If the sum is any other value (4, 5, 6, 8, 9, or 10), a value point is established, and you continue
to roll until you either roll a sum of the value point or a 7. If the sum of the new roll is equal to
the value point, then you win; if the sum of the new roll is equal to 7, then you lose.
 Remember, in option (III), you continue to roll until you get a 7 or the value point.
Sample runs:
• You rolled 5 + 6 = 11; you win
• You rolled 1 + 2 = 3; you lose
• You rolled 2 + 2 = 4; you establish the value point 4;
– Roll again 2 + 3 = 5; roll
– Roll again 2 + 1 = 3; roll
– Roll again 2 + 2 = 4; you win
• You rolled 2 + 6 = 8; you establish the value point 8;
– Roll again 4 + 4 = 8; you win
• You rolled 3 + 2 = 5; you establish the value point 5;
– Roll again 1 + 1 = 2; roll
– Roll again 2 + 2 = 4; roll
Computer Science 268: Introduction to Programming in Java Page 5 of 12
– Roll again 1 + 1 = 2; roll
– Roll again 3 + 4 = 7; you lose
Develop a program that plays craps with a player three times. At the end, the program prints the
number of times the player won and the number of times the player lost.
 */

public class Question4 {

    public static void main(String[] args) {



        int n = 0;
        int gamesWon = 0;
        boolean gameOver = false;

        do {
            n++;
            RandomSumGame randomSumGame = new RandomSumGame();
            boolean a = randomSumGame.play();
            if (a)
                gamesWon++;


            gameOver = (n >= 3);

        } while (!gameOver);

        System.out.println("Game Over!");
        System.out.println("You won " + gamesWon + " games.");
        System.out.println("You lost " + (3 - gamesWon) + " games.");
    }

}
