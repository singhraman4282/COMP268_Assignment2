/*
 * Copyright (c) 2019. Made by Raman Singh
 */

import java.util.ArrayList;

public class MovingRobot extends Robot {

    ArrayList<Integer> moves;
    int nextMove;

    public boolean validateNextMove() {
        int m = generateNextMove();

        switch (x) {
            case 0:
                switch (y) {
                    case 0:
                        return (m == Robot.RIGHT || m == Robot.DOWN || m == Robot.RIGHT_DOWN_CORNER);
                    case 9:
                        return (m == Robot.RIGHT || m == Robot.UP || m == Robot.RIGHT_UP_CORNER);
                    default:
                        return (m == Robot.RIGHT || m == Robot.UP || m == Robot.RIGHT_UP_CORNER || m == Robot.DOWN || m == Robot.RIGHT_DOWN_CORNER);
                }
            case 9:
                switch (y) {
                    case 0:
                        return (m == Robot.LEFT || m == Robot.DOWN || m == Robot.LEFT_DOWN_CORNER);
                    case 9:
                        return (m == Robot.LEFT || m == Robot.UP || m == Robot.LEFT_UP_CORNER);
                    default:
                        return (m == Robot.LEFT || m == Robot.UP || m == Robot.LEFT_UP_CORNER || m == Robot.DOWN || m == Robot.LEFT_DOWN_CORNER);
                }

                default:
                    switch (y) {
                        case 0:
                            return (m == Robot.LEFT || m == Robot.DOWN || m == Robot.LEFT_DOWN_CORNER || m == Robot.RIGHT || m == Robot.RIGHT_DOWN_CORNER) ;
                        case 9:
                            return (m == Robot.LEFT || m == Robot.UP || m == Robot.LEFT_UP_CORNER || m == Robot.RIGHT || m == Robot.RIGHT_UP_CORNER) ;
                            default:
                                return true;
                    }
        }
    }

    public int generateNextMove() {
        return (int)(Math.random() * 8) + 1;
    }

    public MovingRobot(int x, int y) {
        super(x,y);
    }

    public static boolean sameSlot(Robot r1, Robot r2) {
        return false;
    }

    public String printMoves() {
        return "";
    }

    public void move() {

    }
}
