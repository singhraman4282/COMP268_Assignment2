public class BadmintonScoring {

    int[][] scores;
    static final int PLAYER1 = 1;
    static final int PLAYER2 = 2;

    public BadmintonScoring(int[][] scores) {
        this.scores = scores;
    }

    public int getContinuousPointsPlayer1() {
        return -1;
    }

    public int getContinuousPointsPlayer2() {
        return -1;
    }

    public int getPlayer1Points() {
        return -1;
    }

    public int getPlayer2Points() {
        return -1;
    }
}
