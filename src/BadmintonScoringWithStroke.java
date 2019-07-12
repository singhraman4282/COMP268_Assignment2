import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BadmintonScoringWithStroke {

    ArrayList<Point> scores;
    int score1;
    int score2;
    static final int PLAYER1 = 1;
    static final int PLAYER2 = 2;

    public BadmintonScoringWithStroke(ArrayList<Point> scores) {
        this.scores = scores;
    }

    public String getMostUsedStrokesPlayer1() {

        return getMostStrokes(PLAYER1);
    }

    public String getMostUsedStrokesPlayer2() {
        return getMostStrokes(PLAYER2);
    }

    private String getMostStrokes(int player) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        for (Point point: scores) {
            if (point.getPlayer() == player) {
                if (point.getStroke().equals("a"))
                    a++;
                if (point.getStroke().equals("b"))
                    b++;
                if (point.getStroke().equals("c"))
                    c++;
                if (point.getStroke().equals("d"))
                    d++;
                if (point.getStroke().equals("e"))
                    e++;
            }
        }

        int[] values = {a,b,c,d,e};
        Arrays.sort(values);
        int maxValue = values[4];

        if (a == maxValue)
            return "a";
        if (b == maxValue)
            return "b";
        if (c == maxValue)
            return "c";
        if (d == maxValue)
            return "d";

        return "e";
    }
}
