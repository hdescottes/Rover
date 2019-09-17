package com.test.rover.direction;

import com.test.rover.model.Rover;

public class SouthDirection implements Direction {

    @Override
    public Direction spinRight(Rover rover) {
        return new WestDirection();
    }

    @Override
    public Direction spinLeft(Rover rover) {
        return new EastDirection();
    }

    @Override
    public void moveForward(Rover rover) {
        rover.setY(rover.getY() - 1);
    }
}
