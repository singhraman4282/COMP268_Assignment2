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
        int player1Hand = random();
        int player2Hand = random();
        
    }

}
