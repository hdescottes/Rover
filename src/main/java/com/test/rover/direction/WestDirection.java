package com.test.rover.direction;

import com.test.rover.model.RoverDto;

public class WestDirection implements Direction {

    @Override
    public Direction spinRight(RoverDto roverDto) {
        return new NorthDirection();
    }

    @Override
    public Direction spinLeft(RoverDto roverDto) {
        return new SouthDirection();
    }

    @Override
    public void moveForward(RoverDto roverDto) {
        roverDto.setX(roverDto.getX() - 1);
    }
}
