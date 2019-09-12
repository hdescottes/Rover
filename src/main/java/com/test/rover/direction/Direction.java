package com.test.rover.direction;

import com.test.rover.model.Rover;

public interface Direction {

    public abstract Direction spinRight(Rover rover);

    public abstract Direction spinLeft(Rover rover);

    public abstract void moveForward(Rover rover);

}
