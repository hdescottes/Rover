package com.test.rover.model;

import com.test.rover.Constant.Direction;

/**
 * Business representation of the coordinates
 */
public class Coordinates {

    private int x;

    private int y;

    public int getX() {
        return x;
    }

    public Coordinates setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public Coordinates setY(int y) {
        this.y = y;
        return this;
    }

}
