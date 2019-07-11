/*
Write a program that plays the Rock-Paper-Scissors-Lizard-Spock game. Refer to
http://en.wikipedia.org/wiki/Rock-paper-scissors-lizard-Spock for more information.
Normally, one player is a human and the other is the computer program. However, in this exercise,
the program will generate two players who play against each other. The play continues until either
of the computer-generated players wins four consecutive times.
In this game, two random integers are generated in the range of [1 to 5], one per player. 1 refers to
Rock, 2 refers to Paper, 3 refers to Scissors, 4 refers to Lizard, and 5 refers to Spock.
For example, if the computer randomly generates integers 2 and 5 in the first iteration, 2 is for the
first player and 5 is for the second player. Based on Rule 8 in the following 10 rules, Paper (2)
disproves Spock (5), so Player 1 wins. Repeat it to generate one more pair and determine who wins
that iteration. Continue the iterations until one player wins four consecutive times.
Rule 1: Scissors cut paper
Rule 2: Paper covers rock
Rule 3: Rock crushes lizard
Rule 4: Lizard poisons Spock
Rule 5: Spock smashes (or melts) scissors
Rule 6: Scissors decapitate lizard
Rule 7: Lizard eats paper
Rule 8: Paper disproves Spock
Rule 9: Spock vaporizes rock
Rule 10: Rock breaks scissors
 */

public class Question2 {

    public static void main(String[] args) {
        RockPaperScissorsLizardSpock rockPaperScissorsLizardSpock = new RockPaperScissorsLizardSpock();
        rockPaperScissorsLizardSpock.play(1,2);
    }

}
