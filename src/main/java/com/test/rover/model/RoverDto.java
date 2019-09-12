package com.test.rover.model;

import com.test.rover.direction.Direction;

/**
 * Business representation of a rover
 */
public class RoverDto {

    private final PlateauDto plateauDto;

    private int x;

    private int y;

    private Direction direction;

    public RoverDto(PlateauDto plateauDto, int x, int y, Direction direction) {

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

}
