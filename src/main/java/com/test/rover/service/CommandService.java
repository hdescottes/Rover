package com.test.rover.service;

import com.test.rover.constant.Direction;
import com.test.rover.model.Rover;

import static com.test.rover.constant.Direction.*;

/**
 * Business logic related to the command
 */
public class CommandService {

    void spinRight(Rover rover, Direction direction) {
        switch (direction) {
            case N: rover.setDirection(E); break;
            case E: rover.setDirection(S); break;
            case S: rover.setDirection(W); break;
            case W: rover.setDirection(N); break;
            default: throw new IllegalArgumentException ("Invalid direction type: " + direction);
        }
    }

    void spinLeft(Rover rover, Direction direction) {
        switch (direction) {
            case N: rover.setDirection(W); break;
            case E: rover.setDirection(N); break;
            case S: rover.setDirection(E); break;
            case W: rover.setDirection(S); break;
            default: throw new IllegalArgumentException ("Invalid direction type: " + direction);
        }
    }

    void forward(Rover rover, Direction direction) {
        switch (direction) {
            case E: rover.setX(rover.getX() + 1); break;
            case W: rover.setX(rover.getX() - 1); break;
            case N: rover.setY(rover.getY() + 1); break;
            case S: rover.setY(rover.getY() - 1); break;
            default: throw new IllegalArgumentException ("Invalid direction type: " + direction);
        }
    }
}
