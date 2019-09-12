package com.test.rover.service;

import com.test.rover.CommonTests;
import com.test.rover.model.Rover;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.test.rover.direction.DirectionEnum.N;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverServiceTests extends CommonTests {

    private Rover rover = createRover(N.getDirection());

    private RoverService roverServiceTest = new RoverService(rover);

    @Test
    void executeCommandList_ShouldSucceed() {
        ArrayList<String> commands = createCommandList();
        roverServiceTest.executeCommandList(commands);
        assertEquals(0, rover.getX());
        assertEquals(2, rover.getY());
        assertEquals(N.getDirection().getClass(), rover.getDirection().getClass());
    }
}
