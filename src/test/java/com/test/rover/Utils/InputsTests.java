package com.test.rover.Utils;

import com.test.rover.model.Plateau;
import com.test.rover.model.Rover;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InputsTests {

    private final Plateau plateau = new Plateau(5, 5);

    @Test
    void parseInputFromFile_ShouldSucceed() {
        InputStream testFileInputStream = getClass().getResourceAsStream("/testInputs.txt");
        ArrayList<String> testFileLines = Inputs.parseInputFromFile(testFileInputStream);

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
        Plateau plateauOutput = Inputs.parsePlateauInput(plateauInput);

        assertEquals(0, plateauOutput.getOriginX());
        assertEquals(0, plateauOutput.getOriginY());
        assertEquals(5, plateauOutput.getUpperX());
        assertEquals(5, plateauOutput.getUpperY());
    }

    @Test
    void whenPositionInputIsParsedRoverIsConstructed() {
        String positionInput = "1 2 N";
        Rover roverOutput = Inputs.parsePositionInput(positionInput, plateau);

        assertEquals(1, roverOutput.getX());
        assertEquals(2, roverOutput.getY());
        //direction to be tested
    }
}
