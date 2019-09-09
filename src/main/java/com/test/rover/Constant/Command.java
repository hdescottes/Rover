package com.test.rover.Constant;

import com.test.rover.model.Rover;

import static com.test.rover.Constant.Direction.*;

/**
 * Constants used for the different possible command
 */
public enum Command {

    L("LEFT"),
    R("RIGHT"),
    M("FORWARD");

    private String name;

    Command(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Direction spinRight(Rover rover, Direction direction) {
        if (direction == N) {
            return rover.setDirection(E);
        } else if (direction == E) {
            return rover.setDirection(S);
        } else if (direction == S) {
            return rover.setDirection(W);
        } else {
            return rover.setDirection(N);
        }
    }

    public static Direction spinLeft(Rover rover, Direction direction) {
        if (direction == N) {
            return rover.setDirection(W);
        } else if (direction == E) {
            return rover.setDirection(N);
        } else if (direction == S) {
            return rover.setDirection(E);
        } else {
            return rover.setDirection(S);
        }
    }

    public static int forward(Rover rover, Direction direction) {
        if (direction.equals(E)) {
            return rover.setX(rover.getX() +1);
        } else if (direction.equals(W)) {
            return rover.setX(rover.getX() - 1);
        } else if (direction.equals(N)) {
            return rover.setY(rover.getY() + 1);
        } else return rover.setY(rover.getY() - 1);
    }

}
