package com.test.rover.Utils;

import com.test.rover.model.Rover;

/**
 * Some useful methods for the location
 */
public class Location {

    public static String showLocation(Rover rover) {
        return rover.getX() + " " + rover.getY() + " " + rover.getDirection();
    }
}
