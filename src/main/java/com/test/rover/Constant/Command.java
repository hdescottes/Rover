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

    public static void spinRight(Rover rover, Direction direction) {
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

    public static void spinLeft(Rover rover, Direction direction) {
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

    public static void forward(Rover rover, Direction direction) {
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
