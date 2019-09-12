package com.test.rover;

import com.test.rover.model.PlateauDto;
import com.test.rover.model.RoverDto;
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

public class TestRoverApplication {

    public static void main(String[] args) throws IOException, URISyntaxException {
        String dest = Paths.get(Objects.requireNonNull(TestRoverApplication.class.getClassLoader().getResource("inputs.txt")).toURI()).toString();
        List<String> inputFileAsList = InputsUtils.parseInputFromFile(dest);
        List<String> roverInput = inputFileAsList.subList(1, inputFileAsList.size());

        System.out.println("Input:" + "\n");
        Stream.of(inputFileAsList)
                .forEach(System.out::println);

        System.out.println("\n" + "Output:" + "\n");
        PlateauDto plateauDto = InputsUtils.parsePlateauInput(inputFileAsList.get(0));
        for (int i = 0; i < roverInput.size(); i += 2) {
            RoverDto roverDto = InputsUtils.parsePositionInput(roverInput.get(i), plateauDto);
            RoverService roverService = new RoverService(roverDto);
            ArrayList<String> commands = InputsUtils.parseCommandInput(roverInput.get(i + 1));
            roverService.executeCommandList(commands);
            System.out.println(LocationUtils.showLocation(roverDto));
        }
    }
}