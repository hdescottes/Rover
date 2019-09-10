package com.test.rover.constant;

/**
 * Constants used for the different possible direction
 */
public enum Direction {

    N("NORTH"),
    E("EAST"),
    S("SOUTH"),
    W("WEST");

    private String name;

    Direction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
