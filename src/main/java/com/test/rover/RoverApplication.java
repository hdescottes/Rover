package com.test.rover;

import com.test.rover.constant.CommandEnum;
import com.test.rover.model.Plateau;
import com.test.rover.model.Rover;
import com.test.rover.service.RoverService;
import com.test.rover.utils.InputsUtils;
import com.test.rover.utils.LocationUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class RoverApplication {

    public static void main(String[] args) throws IOException, URISyntaxException {
        List<String> inputFileAsList = InputsUtils.parseInputFromFile(Paths.get(Objects.requireNonNull(RoverApplication.class.getClassLoader().getResource("inputs.txt")).toURI()).toString());
        List<String> roverInput = inputFileAsList.subList(1, inputFileAsList.size());

        System.out.println("Input:" + "\n");
        Stream.of(inputFileAsList)
                .forEach(System.out::println);

        System.out.println("\n" + "Output:" + "\n");
        Plateau plateau = InputsUtils.parsePlateauInput(inputFileAsList.get(0));
        for (int i = 0; i < roverInput.size(); i += 2) {
            Rover rover = InputsUtils.parsePositionInput(roverInput.get(i), plateau);
            RoverService roverService = new RoverService(rover);
            ArrayList<CommandEnum> commands = InputsUtils.parseCommandInput(roverInput.get(i + 1));
            roverService.executeCommandList(commands);
            System.out.println(LocationUtils.showLocation(rover));
        }
    }
}