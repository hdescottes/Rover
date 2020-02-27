package com.test.rover.utils;

import com.test.rover.constant.CommandEnum;
import com.test.rover.direction.DirectionEnum;
import com.test.rover.model.Plateau;
import com.test.rover.model.Rover;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Some useful methods for the inputs
 */
public class InputsUtils {

    public static List<String> parseInputFromFile(String fileLocation) throws IOException {
        return Files.lines(Paths.get(fileLocation)).collect(Collectors.toList());
    }

    public static Plateau parsePlateauInput(String plateauInput) {
        String[] inputArray = plateauInput.split(" ");
        LocationUtils.checkPlateau(inputArray);
        return new Plateau(Integer.parseInt(inputArray[0]), Integer.parseInt(inputArray[1]));
    }

    public static Rover parsePositionInput(String positionInput, Plateau plateau) {
        String[] inputArray = positionInput.split(" ");
        LocationUtils.checkPosition(inputArray, plateau);
        return new Rover(plateau, Integer.parseInt(inputArray[0]), Integer.parseInt(inputArray[1]), DirectionEnum.valueOf(inputArray[2]).getDirection());
    }

    public static ArrayList<CommandEnum> parseCommandInput(String command) {
        char[] inputArray = command.toCharArray();
        ArrayList<CommandEnum> commandArrayList = new ArrayList<>();

        for (char character : inputArray) {
            CommandEnum currentCommand = CommandEnum.valueOf(Character.toString(character));
            commandArrayList.add(currentCommand);
        }

        return commandArrayList;
    }

}
