package com.test.rover.Constant;

/**
 * Constants used for the different possible command
 */
public enum Command {

    LEFT(0, "L"),
    RIGHT(1, "R"),
    FORWARD(2, "M");

    private int value;

    private String shortName;

    Command(int value, String shortName) {
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
