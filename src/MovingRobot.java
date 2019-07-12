/*
 * Copyright (c) 2019. Made by Raman Singh
 */

import javax.swing.*;
import java.util.ArrayList;

public class MovingRobot extends Robot {

    ArrayList<Integer> moves;
    int nextMove;

    public boolean validateNextMove() {

        switch (x) {
            case 0:
                switch (y) {
                    case 0:
                        return (nextMove == Robot.RIGHT || nextMove == Robot.DOWN || nextMove == Robot.RIGHT_DOWN_CORNER);
                    case 9:
                        return (nextMove == Robot.RIGHT || nextMove == Robot.UP || nextMove == Robot.RIGHT_UP_CORNER);
                    default:
                        return (nextMove == Robot.RIGHT || nextMove == Robot.UP || nextMove == Robot.RIGHT_UP_CORNER || nextMove == Robot.DOWN || nextMove == Robot.RIGHT_DOWN_CORNER);
                }
            case 9:
                switch (y) {
                    case 0:
                        return (nextMove == Robot.LEFT || nextMove == Robot.DOWN || nextMove == Robot.LEFT_DOWN_CORNER);
                    case 9:
                        return (nextMove == Robot.LEFT || nextMove == Robot.UP || nextMove == Robot.LEFT_UP_CORNER);
                    default:
                        return (nextMove == Robot.LEFT || nextMove == Robot.UP || nextMove == Robot.LEFT_UP_CORNER || nextMove == Robot.DOWN || nextMove == Robot.LEFT_DOWN_CORNER);
                }

            default:
                switch (y) {
                    case 0:
                        return (nextMove == Robot.LEFT || nextMove == Robot.DOWN || nextMove == Robot.LEFT_DOWN_CORNER || nextMove == Robot.RIGHT || nextMove == Robot.RIGHT_DOWN_CORNER);
                    case 9:
                        return (nextMove == Robot.LEFT || nextMove == Robot.UP || nextMove == Robot.LEFT_UP_CORNER || nextMove == Robot.RIGHT || nextMove == Robot.RIGHT_UP_CORNER);
                    default:
                        return true;
                }
        }
    }

    public int generateNextMove() {
        return (int) (Math.random() * 8) + 1;
    }

    public MovingRobot(int x, int y) {
        super(x, y);
        moves = new ArrayList<Integer>();
    }

    public static boolean sameSlot(Robot r1, Robot r2) {
        return (r1.getX() == r2.getX() && r1.getY() == r2.getY());
    }

    public String printMoves() {
        String m = name + "'s moves: ";

        for (Integer move : moves) {
//            m = m + getMoveName(move) + ", ";
            m = m + move + ", ";
        }
        return m;
    }

    public void move() {

        boolean correctMove = false;

        do {
            nextMove = generateNextMove();
            correctMove = validateNextMove();
        } while (!correctMove);

        moves.add(nextMove);
        System.out.println(name + "'s next move: " + getMoveName(nextMove));

        switch (nextMove) {
            case Robot.LEFT:
                setX(getX() - 1);
                break;
            case Robot.LEFT_DOWN_CORNER:
                setX(getX() - 1);
                setY(getY() + 1);
                break;
            case Robot.LEFT_UP_CORNER:
                setX(getX() - 1);
                setY(getY() - 1);
                break;
            case Robot.RIGHT:
                setX(getX() + 1);
                break;
            case Robot.RIGHT_DOWN_CORNER:
                setX(getX() + 1);
                setY(getY() + 1);
                break;
            case Robot.RIGHT_UP_CORNER:
                setX(getX() + 1);
                setY(getY() - 1);
                break;
            case Robot.UP:
                setY(getY() - 1);
                break;

                default:
                    setY(getY() + 1);
        }


        System.out.println(name + " is at: (" + getY() + "," + getX() + ")");


//        System.out.println(name + " Adding move to the list: " + getMoveName(nextMove));


    }

    private String getMoveName(int move) {
        String[] moveNames = {"none", "UP", "DOWN", "LEFT", "RIGHT", "LEFT_UP_CORNER", "LEFT_DOWN_CORNER", "RIGHT_UP_CORNER", "RIGHT_DOWN_CORNER"};
        return moveNames[move];
    }
}
