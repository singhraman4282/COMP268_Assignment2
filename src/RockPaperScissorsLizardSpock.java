/*
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

public class RockPaperScissorsLizardSpock {
    private static int consecutiveWins;
    private static int lastWinner;
    private static final int ROCK = 1;
    private static final int PAPER = 2;
    private static final int SCISSORS = 3;
    private static final int LIZARD = 4;
    private static final int SPOCK = 5;
    private static final int PLAYER1 = 1;
    private static final int PLAYER2 = 2;


    public static int getConsecutiveWins() {
        return consecutiveWins;
    }

    public static int getLastWinner() {
        return lastWinner;
    }

    public int random() {
        return (int)(Math.random() * 5) + 1;
    }

    public static String convert(int i) {
        String[] types = {"ROCK", "PAPER", "SCISSORS", "LIZARD", "SPOCK"};
        return types[i];
    }

    public void play(int player1, int player2) {

        consecutiveWins = 0;
        boolean gameOver = false;

        do {
            int lw = getLastWinner();
            int player1Hand = random();
            int player2Hand = random();
            lastWinner = getWinner(player1Hand, player2Hand);
            System.out.println("PLAYER" + lastWinner + " won this hand.");
            if (lw == lastWinner) {
                consecutiveWins++;
            } else {
                consecutiveWins = 1;
            }
            gameOver = (consecutiveWins == 4);

        } while (!gameOver);

        System.out.println("The winner is PLAYER" + lastWinner);

    }

    private int getWinner(int player1Hand, int player2Hand) {

        if (player1Hand == player2Hand) {
            return getNextWinner();
        }

        System.out.println("Player 1: " + convert(player1Hand - 1));
        System.out.println("Player 2: " + convert(player2Hand - 1));
        if (player1Hand == ROCK) {
            switch (player2Hand) {
                case LIZARD:
                case SCISSORS:
                    return PLAYER1;
                case PAPER:
                case SPOCK:
                    return PLAYER2;
                    default:
                        return getNextWinner();
            }
        }

        if (player1Hand == PAPER) {
            switch (player2Hand) {
                case ROCK:
                case SPOCK:
                    return PLAYER1;
                case LIZARD:
                case SCISSORS:
                    return PLAYER2;
                    default:
                        return getNextWinner();
            }
        }

        if (player1Hand == SCISSORS) {
            switch (player2Hand) {
                case PAPER:
                case LIZARD:
                    return PLAYER1;
                case SPOCK:
                case ROCK:
                    return PLAYER2;
                default:
                    return getNextWinner();
            }
        }

        if (player1Hand == LIZARD) {
            switch (player2Hand) {
                case SPOCK:
                case PAPER:
                    return PLAYER1;
                case ROCK:
                case SCISSORS:
                    return PLAYER2;
                    default:
                        return getNextWinner();
            }
        }

        if (player1Hand == SPOCK) {
            switch (player2Hand) {
                case SCISSORS:
                case ROCK:
                    return PLAYER1;
                case LIZARD:
                case PAPER:
                    return PLAYER2;
                    default:
                        return getNextWinner();
            }
        }

        return getNextWinner();
    }

    private int getNextWinner() {
        int p1Hand = random();
        int p2Hand = random();
        return getWinner(p1Hand, p2Hand);
    }



}


/*

Scissors > Paper > rock >lizard >spock >scissors >
 */