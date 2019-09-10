package com.test.rover.constant;

import com.test.rover.model.Rover;

import static com.test.rover.constant.Direction.*;

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
