package com.test.rover.direction;

import com.test.rover.model.Rover;

public class EastDirection implements Direction {

    @Override
    public Direction spinRight(Rover rover) {
        return new SouthDirection();
    }

    @Override
    public Direction spinLeft(Rover rover) {
        return new NorthDirection();
    }

    @Override
    public void moveForward(Rover rover) {
        rover.setX(rover.getX() + 1);
    }
}
