package com.test.rover.model;

import com.test.rover.direction.Direction;

/**
 * Business representation of a rover
 */
public class Rover {

    private final Plateau plateau;

    private int x;

    private int y;

    private Direction direction;

    public Rover(Plateau plateau, int x, int y, Direction direction) {

        this.plateau = plateau;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

}
