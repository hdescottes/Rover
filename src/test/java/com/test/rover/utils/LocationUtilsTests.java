package com.test.rover.utils;

import com.test.rover.CommonTests;
import org.junit.jupiter.api.Test;

import static com.test.rover.utils.LocationUtils.checkPlateau;
import static com.test.rover.utils.LocationUtils.checkPosition;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class LocationUtilsTests extends CommonTests {

    @Test
    void checkPlateau_ShouldFailedCauzNullCoordinates() {
        String[] inputArray = new String[2];
        inputArray[0] = "0";
        inputArray[1] = "0";
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> checkPlateau(inputArray));
    }

    @Test
    void checkPosition_ShouldFailedCauzRoverIsBeyondPlateau() {
        String[] inputArray = new String[2];
        inputArray[0] = "3";
        inputArray[1] = "9";
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> checkPosition(inputArray, createPlateau()));
    }
}
