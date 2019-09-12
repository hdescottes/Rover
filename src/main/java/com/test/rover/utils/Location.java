package com.test.rover.utils;

import com.test.rover.model.PlateauDto;
import com.test.rover.model.RoverDto;

/**
 * Some useful methods for the location
 */
public class Location {

    public static String showLocation(RoverDto roverDto) {
        return roverDto.getX() + " " + roverDto.getY() + " " + roverDto.getDirection().getClass().getSimpleName().charAt(0);
    }

    static void checkPlateau(String[] inputArray) {
        if (inputArray[0].isEmpty() || inputArray[1].isEmpty() || Integer.parseInt(inputArray[0]) == 0 || Integer.parseInt(inputArray[1]) == 0) {
            throw new IllegalArgumentException("The plateau's coordinates must not be null or equal to 0");
        }
    }

    static void checkPosition(String[] inputArray, PlateauDto plateauDto) {
        if (inputArray[0].isEmpty() || inputArray[1].isEmpty() || Integer.parseInt(inputArray[0]) > plateauDto.getUpperX() || Integer.parseInt(inputArray[1]) > plateauDto.getUpperY()) {
            throw new IllegalArgumentException("The rover's coordinates must not be null or beyond plateau's ones");
        }
    }
}
