package com.test.rover.service;

import com.test.rover.CommonTests;
import com.test.rover.model.Rover;
import org.junit.jupiter.api.Test;

import static com.test.rover.constant.Direction.*;
import static org.assertj.core.api.Assertions.assertThat;

class CommandServiceTests extends CommonTests {

    private CommandService commandService = new CommandService();

    @Test
    void spinRight_ShouldSucceed() {
        Rover rover = createRover(N);
        commandService.spinRight(rover, rover.getDirection());
        assertThat(rover.getDirection()).isEqualTo(E);
        commandService.spinRight(rover, rover.getDirection());
        assertThat(rover.getDirection()).isEqualTo(S);
        commandService.spinRight(rover, rover.getDirection());
        assertThat(rover.getDirection()).isEqualTo(W);
        commandService.spinRight(rover, rover.getDirection());
        assertThat(rover.getDirection()).isEqualTo(N);
    }

    @Test
    void spinLeft_ShouldSucceed() {
        Rover rover = createRover(N);
        commandService.spinLeft(rover, rover.getDirection());
        assertThat(rover.getDirection()).isEqualTo(W);
        commandService.spinLeft(rover, rover.getDirection());
        assertThat(rover.getDirection()).isEqualTo(S);
        commandService.spinLeft(rover, rover.getDirection());
        assertThat(rover.getDirection()).isEqualTo(E);
        commandService.spinLeft(rover, rover.getDirection());
        assertThat(rover.getDirection()).isEqualTo(N);
    }

    @Test
    void forwardNorth_ShouldSucceed() {
        Rover rover = createRover(N);
        commandService.forward(rover, rover.getDirection());
        assertThat(rover.getY()).isEqualTo(y + 1);
    }

    @Test
    void forwardEast_ShouldSucceed() {
        Rover rover = createRover(E);
        commandService.forward(rover, rover.getDirection());
        assertThat(rover.getX()).isEqualTo(x + 1);
    }

    @Test
    void forwardSouth_ShouldSucceed() {
        Rover rover = createRover(S);
        commandService.forward(rover, rover.getDirection());
        assertThat(rover.getY()).isEqualTo(y - 1);
    }

    @Test
    void forwardWest_ShouldSucceed() {
        Rover rover = createRover(W);
        commandService.forward(rover, rover.getDirection());
        assertThat(rover.getX()).isEqualTo(x - 1);
    }
}
