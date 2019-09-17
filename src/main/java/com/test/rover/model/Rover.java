package com.test.rover.model;

import com.test.rover.direction.Direction;

import java.util.stream.Stream;

/**
 * Business representation of a rover
 */
public class Rover {

    private final PlateauDto plateauDto;

    private int x;

    private int y;

    private Direction direction;

    public Rover(PlateauDto plateauDto, int x, int y, Direction direction) {

        this.plateauDto = plateauDto;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public PlateauDto getPlateauDto() {
        return plateauDto;
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

    public void turnLeft() {
        this.setDirection(direction.spinLeft(this));
    }

    public void turnRight() {
        this.setDirection(direction.spinRight(this));
    }

    public void goForward() {
        direction.moveForward(this);
    }

}
