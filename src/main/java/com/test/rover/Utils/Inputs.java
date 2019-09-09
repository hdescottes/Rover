package com.test.rover.Utils;

import com.test.rover.Constant.Direction;
import com.test.rover.model.Plateau;
import com.test.rover.model.Rover;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Some useful methods for the inputs
 */
public class Inputs {

    public static ArrayList<String> parseInputFromFile(InputStream fileLocation) {
        ArrayList<String> inputsFromFile = new ArrayList<>();
        Stream.of(fileLocation).flatMap(f -> new BufferedReader(new InputStreamReader(f)).lines())
                .forEach(inputsFromFile::add);

        return inputsFromFile;
    }

    public static Plateau parsePlateauInput(String plateauInput) {
        String[] inputArray = plateauInput.split(" ");
        return new Plateau(Integer.parseInt(inputArray[0]), Integer.parseInt(inputArray[1]));
    }

    public static Rover parsePositionInput(String positionInput, Plateau plateau) {
        String[] inputArray = positionInput.split(" ");
        return new Rover(plateau, Integer.parseInt(inputArray[0]), Integer.parseInt(inputArray[1]), Direction.valueOf(inputArray[2]));
    }

    // Add a parse Command here

}
