package com.test.rover.direction;

import com.test.rover.model.RoverDto;

public class EastDirection implements Direction {

    @Override
    public Direction spinRight(RoverDto roverDto) {
        return new SouthDirection();
    }

    @Override
    public Direction spinLeft(RoverDto roverDto) {
        return new NorthDirection();
    }

    @Override
    public void moveForward(RoverDto roverDto) {
        roverDto.setX(roverDto.getX() + 1);
    }
}
