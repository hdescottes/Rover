package com.test.rover.Constant;

/**
 * Constants used for the different possible direction
 */
public enum Direction {

    N(0, "N"),
    EAST(1, "E"),
    SOUTH(2, "S"),
    WEST(3, "W");

    private int value;

    private String shortName;

    Direction(int value, String shortName) {
        this.value = value;
        this.shortName = shortName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
