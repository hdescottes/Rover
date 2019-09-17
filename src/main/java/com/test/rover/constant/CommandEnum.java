package com.test.rover.constant;

import com.test.rover.model.Rover;

import java.util.function.Consumer;

/**
 * Constants used for the different possible command
 */
public enum CommandEnum {

    L("LEFT", Rover::turnLeft),
    R("RIGHT", Rover::turnRight),
    M("FORWARD", Rover::goForward);

    private String name;
    private Consumer<Rover> action;

    CommandEnum(String name, Consumer<Rover> action) {
        this.name = name;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doAction(Rover rover) {
        action.accept(rover);
    }
}
