package com.test.rover.direction;

import com.test.rover.model.Rover;

public interface Direction {

    Direction spinRight(Rover rover);

    Direction spinLeft(Rover rover);

    void moveForward(Rover rover);

}
