package com.test.rover.constant;

/**
 * Constants used for the different possible direction
 */
public enum Direction {

    N(1, "y"),
    E(1, "x"),
    S(-1, "y"),
    W(-1, "x");

    Direction(int value, String directionLook) {
    }
}
