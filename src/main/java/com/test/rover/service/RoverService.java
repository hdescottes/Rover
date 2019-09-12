package com.test.rover.service;

import com.test.rover.model.RoverDto;

import java.util.ArrayList;

import static com.test.rover.constant.CommandEnum.*;

/**
 * Business logic related to the rover
 */
public class RoverService {

    private RoverDto roverDto;

    public RoverService(RoverDto roverDto) {
        this.roverDto = roverDto;
    }

    public void executeCommandList(ArrayList<String> commands) {
        for (String command : commands)
            if (command.equals(L.getName())) {
                roverDto.setDirection(roverDto.getDirection().spinLeft(roverDto));
            } else if (command.equals(R.getName())) {
                roverDto.setDirection(roverDto.getDirection().spinRight(roverDto));
            } else if (command.equals(M.getName())) {
                roverDto.getDirection().moveForward(roverDto);
            }
    }
}
