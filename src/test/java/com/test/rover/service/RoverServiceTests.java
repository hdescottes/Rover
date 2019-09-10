package com.test.rover.service;

import com.test.rover.CommonTests;
import com.test.rover.model.Rover;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.test.rover.constant.Direction.N;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverServiceTests extends CommonTests {

    private Rover rover = createRover(N);

    private RoverService roverServiceTest = new RoverService(rover, new CommandService());

    @Test
    void executeCommandList_ShouldSucceed() {
        ArrayList<String> commands = createCommandList();
        roverServiceTest.executeCommandList(commands);
        assertEquals(0, rover.getX());
        assertEquals(2, rover.getY());
        assertEquals(N, rover.getDirection());
    }
}
