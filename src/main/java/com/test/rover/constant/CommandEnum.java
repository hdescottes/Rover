package com.test.rover.constant;

/**
 * Constants used for the different possible command
 */
public enum CommandEnum {

    L("LEFT"),
    R("RIGHT"),
    M("FORWARD");

    private String name;

    CommandEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
