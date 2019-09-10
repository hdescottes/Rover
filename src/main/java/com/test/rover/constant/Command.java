package com.test.rover.constant;

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

}
