package com.test.rover.service;

import com.test.rover.constant.CommandEnum;
import com.test.rover.model.Rover;

import java.util.ArrayList;

/**
 * Business logic related to the rover
 */
public class RoverService {

    private Rover rover;

    public RoverService(Rover rover) {
        this.rover = rover;
    }

    public void executeCommandList(ArrayList<CommandEnum> commands) {
        commands.forEach(c -> c.doAction(rover));
    }
}
