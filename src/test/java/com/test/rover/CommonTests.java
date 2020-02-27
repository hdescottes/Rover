package com.test.rover;

import com.test.rover.constant.CommandEnum;
import com.test.rover.direction.Direction;
import com.test.rover.model.Plateau;
import com.test.rover.model.Rover;

import java.util.ArrayList;

import static com.test.rover.constant.CommandEnum.*;

public class CommonTests {

    private int upperX = 5;
    private int upperY = 5;
    protected int x = 1;
    protected int y = 2;

    protected Plateau createPlateau() {
        return new Plateau(upperX, upperY);
    }

    protected Rover createRover(Direction direction) {
        return new Rover(createPlateau(), x, y, direction);
    }

    protected ArrayList<CommandEnum> createCommandList() {
        ArrayList<CommandEnum> commands = new ArrayList<>();
        commands.add(L);
        commands.add(M);
        commands.add(R);
        return commands;
    }
}
