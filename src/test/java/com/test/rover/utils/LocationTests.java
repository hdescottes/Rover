package com.test.rover.utils;

import com.test.rover.CommonTests;
import org.junit.jupiter.api.Test;

import static com.test.rover.utils.Location.checkPlateau;
import static com.test.rover.utils.Location.checkPosition;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class LocationTests extends CommonTests {

    @Test
    void checkPlateau_ShoulfFailedCauzNullCoordinates() {
        String[] inputArray = new String[2];
        inputArray[0] = "0";
        inputArray[1] = "0";
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> checkPlateau(inputArray));
    }

    @Test
    void checkPosition_ShoulfFailedCauzRoverIsBeyondPlateau() {
        String[] inputArray = new String[2];
        inputArray[0] = "3";
        inputArray[1] = "9";
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> checkPosition(inputArray, createPlateau()));
    }
}
