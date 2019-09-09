package com.test.rover;

import com.test.rover.Utils.Inputs;
import com.test.rover.Utils.Location;
import com.test.rover.model.Plateau;
import com.test.rover.model.Rover;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestRoverApplication {

    public static void main(String[] args) {

        ArrayList<String> inputFileAsList = Inputs.parseInputFromFile(TestRoverApplication.class.getResourceAsStream("/inputs.txt"));
        List<String> roverInput = inputFileAsList.subList(1, inputFileAsList.size());

        System.out.println("Input:" + "\n");
        Stream.of(inputFileAsList)
                .forEach(System.out::println);

        System.out.println("\n" + "Output:" + "\n");
        Plateau plateau = Inputs.parsePlateauInput(inputFileAsList.get(0));
        for (int i = 0; i < roverInput.size(); i += 2) {
            Rover rover = Inputs.parsePositionInput(roverInput.get(i), plateau);
            /*Use the parse Command*/
            System.out.println(Location.showLocation(rover));
        }
    }
}