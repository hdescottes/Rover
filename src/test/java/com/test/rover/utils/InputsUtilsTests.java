package com.test.rover.utils;

import com.test.rover.CommonTests;
import com.test.rover.constant.CommandEnum;
import com.test.rover.model.PlateauDto;
import com.test.rover.model.Rover;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.test.rover.constant.CommandEnum.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InputsUtilsTests extends CommonTests {

    @Test
    void parseInputFromFile_ShouldSucceed() throws URISyntaxException, IOException {
        String dest = Paths.get(Objects.requireNonNull(getClass().getClassLoader().getResource("testInputs.txt")).toURI()).toString();
        List<String> testFileLines = InputsUtils.parseInputFromFile(dest);

        assertEquals(5, testFileLines.size());
        assertEquals("5 5", testFileLines.get(0));
        assertEquals("1 2 N", testFileLines.get(1));
        assertEquals("LMLMLMLMM", testFileLines.get(2));
        assertEquals("3 3 E", testFileLines.get(3));
        assertEquals("MMRMMRMRRM", testFileLines.get(4));
    }

    @Test
    void parsePlateauInput_ShouldSucceed() {
        String plateauInput = "5 5";
        PlateauDto plateauDtoOutput = InputsUtils.parsePlateauInput(plateauInput);

        assertEquals(0, plateauDtoOutput.getOriginX());
        assertEquals(0, plateauDtoOutput.getOriginY());
        assertEquals(5, plateauDtoOutput.getUpperX());
        assertEquals(5, plateauDtoOutput.getUpperY());
    }

    @Test
    void parsePositionInput_ShouldSucceed() {
        String positionInput = "1 2 N";
        Rover roverOutput = InputsUtils.parsePositionInput(positionInput, createPlateau());

        assertEquals(1, roverOutput.getX());
        assertEquals(2, roverOutput.getY());
        assertEquals('N', roverOutput.getDirection().getClass().getSimpleName().charAt(0));
    }

    @Test
    void parseCommandInput_ShouldSucceed() {
        String commandInput = "LMLMRMLMM";
        ArrayList<CommandEnum> commandOutput = InputsUtils.parseCommandInput(commandInput);

        assertEquals(L, commandOutput.get(2));
        assertEquals(R, commandOutput.get(4));
        assertEquals(M, commandOutput.get(7));
    }
}
