package com.test.rover.service;

import com.test.rover.constant.Direction;
import com.test.rover.model.Rover;

import static com.test.rover.constant.Direction.*;

/**
 * Business logic related to the command
 */
public class CommandService {

    void spinRight(Rover rover, Direction direction) {
        if (direction == N) {
            rover.setDirection(E);
        } else if (direction == E) {
            rover.setDirection(S);
        } else if (direction == S) {
            rover.setDirection(W);
        } else {
            rover.setDirection(N);
        }
    }

    void spinLeft(Rover rover, Direction direction) {
        if (direction == N) {
            rover.setDirection(W);
        } else if (direction == E) {
            rover.setDirection(N);
        } else if (direction == S) {
            rover.setDirection(E);
        } else {
            rover.setDirection(S);
        }
    }

    void forward(Rover rover, Direction direction) {
        if (direction.equals(E)) {
            rover.setX(rover.getX() + 1);
        } else if (direction.equals(W)) {
            rover.setX(rover.getX() - 1);
        } else if (direction.equals(N)) {
            rover.setY(rover.getY() + 1);
        } else {
            rover.setY(rover.getY() - 1);
        }
    }
}
