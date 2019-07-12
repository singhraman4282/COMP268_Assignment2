

/*
 * Copyright (c) 2019. Made by Raman Singh
 */

public class Robot {
    int x;
    int y;
    String name = "";

    public static final int UP = 1;
    public static final int DOWN = 2;
    public static final int LEFT= 3;
    public static final int RIGHT = 4;
    public static final int LEFT_UP_CORNER = 5;
    public static final int LEFT_DOWN_CORNER = 6;
    public static final int RIGHT_UP_CORNER = 7;
    public static final int RIGHT_DOWN_CORNER = 8;


    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println(name + " changing x from " + this.x + " to " + x);
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println(name + " changing y from " + this.y + " to " + y);
        this.y = y;
    }
}
