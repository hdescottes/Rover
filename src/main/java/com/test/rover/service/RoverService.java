package com.test.rover.service;

import com.test.rover.model.Rover;

import java.util.ArrayList;

import static com.test.rover.constant.Command.*;

/**
 * Business logic related to the rover
 */
public class RoverService {

    private Rover rover;

    private CommandService commandService;

    public RoverService(Rover rover, CommandService commandService) {
        this.rover = rover;
        this.commandService = commandService;
    }

    public void executeCommandList(ArrayList<String> commands) {
        for (String command : commands)
            if (command.equals(L.getName())) {
                commandService.spinLeft(rover, rover.getDirection());
            } else if (command.equals(R.getName())) {
                commandService.spinRight(rover, rover.getDirection());
            } else if (command.equals(M.getName())) {
                commandService.forward(rover, rover.getDirection());
            }
    }
}
