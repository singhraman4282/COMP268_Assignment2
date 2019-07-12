public class BadmintonScoring {

    int[][] scores;
    static final int PLAYER1 = 1;
    static final int PLAYER2 = 2;

    public BadmintonScoring(int[][] scores) {
        this.scores = scores;
    }

    public int getContinuousPointsPlayer1() {
        return maxInRow(scores[0]) - 1;
    }

    public int getContinuousPointsPlayer2() {
        return maxInRow(scores[1]) - 1;
    }

    public int getPlayer1Points() {
        return -1;
    }

    public int getPlayer2Points() {
        return -1;
    }

    private int maxInRow(int[] arr) {

        int max = 0;
        int row = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                row++;
            } else {
                if (row > max)
                    max = row;
                row = 0;
            }

            if (i == arr.length - 1) {
                if (row > max)
                    max = row;
            }
        }

        return max;
    }
}
