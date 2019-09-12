package com.test.rover.service;

import com.test.rover.model.Rover;

import java.util.ArrayList;

import static com.test.rover.constant.Command.*;

/**
 * Business logic related to the rover
 */
public class RoverService {

    private Rover rover;

    public RoverService(Rover rover) {
        this.rover = rover;
    }

    public void executeCommandList(ArrayList<String> commands) {
        for (String command : commands)
            if (command.equals(L.getName())) {
                rover.setDirection(rover.getDirection().spinLeft(rover));
            } else if (command.equals(R.getName())) {
                rover.setDirection(rover.getDirection().spinRight(rover));
            } else if (command.equals(M.getName())) {
                rover.getDirection().moveForward(rover);
            }
    }
}
