public class Point {

    private int player;
    private int score;
    private static final int PLAYER1 = 1;
    private static final int PLAYER2 = 2;
    public String stroke;

    public Point(int player, int score, String stroke) {
        this.player = player;
        this.score = score;
        this.stroke = stroke;
    }

    public int getPlayer() {
        return player;
    }

    public int getScore() {
        return score;
    }

    public String getStroke() {
        return stroke;
    }
}
