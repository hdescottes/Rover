package com.test.rover;

import com.test.rover.direction.Direction;
import com.test.rover.model.PlateauDto;
import com.test.rover.model.RoverDto;

import java.util.ArrayList;

import static com.test.rover.constant.CommandEnum.*;

public class CommonTests {

    private int upperX = 5;
    private int upperY = 5;
    protected int x = 1;
    protected int y = 2;

    protected PlateauDto createPlateau() {
        return new PlateauDto(upperX, upperY);
    }

    protected RoverDto createRover(Direction direction) {
        return new RoverDto(createPlateau(), x, y, direction);
    }

    protected ArrayList<String> createCommandList() {
        ArrayList<String> commands = new ArrayList<>();
        commands.add(L.getName());
        commands.add(M.getName());
        commands.add(R.getName());
        return commands;
    }
}
