package com.test.rover.direction;

import com.test.rover.model.RoverDto;

public class NorthDirection implements Direction {

    @Override
    public Direction spinRight(RoverDto roverDto) {
        return new EastDirection();
    }

    @Override
    public Direction spinLeft(RoverDto roverDto) {
        return new WestDirection();
    }

    @Override
    public void moveForward(RoverDto roverDto) {
        roverDto.setY(roverDto.getY() + 1);
    }
}
