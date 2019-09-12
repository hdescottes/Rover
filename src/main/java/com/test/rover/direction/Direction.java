package com.test.rover.direction;

import com.test.rover.model.RoverDto;

public interface Direction {

    Direction spinRight(RoverDto roverDto);

    Direction spinLeft(RoverDto roverDto);

    void moveForward(RoverDto roverDto);

}
