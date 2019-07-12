/*
The following is a score of a single game in badminton. The top row is the score for
Player 1. The second row is the score for Player 2. Represent this data in an ArrayList in a class
called BadmintonScoring.

0 1 2 3 4 5

I. Compute the maximum points scored by Player 1 and Player 2.

II. Compute the maximum number of points scored in a continuous sequence by Player 1 and
Player 2. Hint: Player 1 scored the sequence 0-1-2, which implies s/he scored 2 points in a
continuous sequence. Similarly, for Player 2, 16-17-18-19-20-21 implies that s/he scored 5
points in a continuous sequence.

III. Extend BadmintonScoring to associate each point scored by a player with a particular stroke
that earned that point, using the notion of association list. You can represent each point as an
object and store the score of a player in an association list (refer to Chapter 7, section 7.4.2 for
details). For example, when Player 1 scored his/her first point, instead of just 1, it could have
been {1, slice}. Thus, each point is augmented with the type of stroke from the following list:
a. slice
b. drive
c. smash
d. drop
e. net-shot

IV. Store the following score of a single game using the modified BadmintonScoring class.

V. Identify the type of stroke that earned most points for each player.
 */

import java.util.ArrayList;

public class Question8 {

    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<Point>();

        points.add(new Point(BadmintonScoring.PLAYER1, 1,"a"));
        points.add(new Point(BadmintonScoring.PLAYER1, 2,"c"));

        points.add(new Point(BadmintonScoring.PLAYER2, 1,"d"));
        points.add(new Point(BadmintonScoring.PLAYER2, 2,"e"));
        points.add(new Point(BadmintonScoring.PLAYER2, 3,"d"));
        points.add(new Point(BadmintonScoring.PLAYER2, 4,"e"));
        points.add(new Point(BadmintonScoring.PLAYER2, 5,"d"));

        points.add(new Point(BadmintonScoring.PLAYER1, 3,"a"));
        points.add(new Point(BadmintonScoring.PLAYER1, 4,"c"));

        points.add(new Point(BadmintonScoring.PLAYER2, 6,"e"));
        points.add(new Point(BadmintonScoring.PLAYER2, 7,"e"));
        points.add(new Point(BadmintonScoring.PLAYER2, 8,"a"));
        points.add(new Point(BadmintonScoring.PLAYER2, 9,"d"));
        points.add(new Point(BadmintonScoring.PLAYER2, 10,"e"));
        points.add(new Point(BadmintonScoring.PLAYER2, 11,"e"));
        points.add(new Point(BadmintonScoring.PLAYER2, 12,"e"));
        points.add(new Point(BadmintonScoring.PLAYER2, 13,"e"));
        points.add(new Point(BadmintonScoring.PLAYER2, 14,"e"));
        points.add(new Point(BadmintonScoring.PLAYER2, 15,"e"));

        points.add(new Point(BadmintonScoring.PLAYER1, 5,"c"));

        points.add(new Point(BadmintonScoring.PLAYER2, 16,"e"));
        points.add(new Point(BadmintonScoring.PLAYER2, 17,"e"));
        points.add(new Point(BadmintonScoring.PLAYER2, 18,"e"));
        points.add(new Point(BadmintonScoring.PLAYER2, 19,"e"));
        points.add(new Point(BadmintonScoring.PLAYER2, 20,"e"));
        points.add(new Point(BadmintonScoring.PLAYER2, 21,"e"));


        int[][] scores = new int[2][26];


        for (int i = 0; i < 26; i++) {
            Point point = points.get(i);
            if (point.getPlayer() == 1) {
                scores[0][i] = point.getScore();
                scores[1][i] = 0;
            } else {
                scores[1][i] = point.getScore();
                scores[0][i] = 0;
            }

//            System.out.println(scores[0][i] + " " + scores[1][i]);
        }



        BadmintonScoring badmintonScoring = new BadmintonScoring(scores);

        System.out.println("Continous points by player1: " + badmintonScoring.getContinuousPointsPlayer1());
        System.out.println("Continous points by player2: " + badmintonScoring.getContinuousPointsPlayer2());

        System.out.println("points by player1: " + badmintonScoring.getPlayer1Points());
        System.out.println("points by player2: " + badmintonScoring.getPlayer2Points());







    }
}
