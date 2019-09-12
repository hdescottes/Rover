package com.test.rover.service;

import com.test.rover.CommonTests;
import com.test.rover.model.RoverDto;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.test.rover.direction.DirectionEnum.N;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverServiceTests extends CommonTests {

    private RoverDto roverDto = createRover(N.getDirection());

    private RoverService roverServiceTest = new RoverService(roverDto);

    @Test
    void executeCommandList_ShouldSucceed() {
        ArrayList<String> commands = createCommandList();
        roverServiceTest.executeCommandList(commands);
        assertEquals(0, roverDto.getX());
        assertEquals(2, roverDto.getY());
        assertEquals(N.getDirection().getClass(), roverDto.getDirection().getClass());
    }
}
