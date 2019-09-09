package com.test.rover.model;

/**
 * Business model for the plateau
 */
public class Plateau {

    private int upperX;

    private int upperY;

    public Plateau(int upperX, int upperY) {
        this.upperX = upperX;
        this.upperY = upperY;
    }

    public int getOriginX() {
        return 0;
    }

    public int getOriginY() {
        return 0;
    }

    public int getUpperX() {
        return upperX;
    }

    public int getUpperY() {
        return upperY;
    }
}
