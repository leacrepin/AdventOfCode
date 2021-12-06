package com.aoc.adventofcode;

import com.aoc.adventofcode.utils.FileReader;
import com.aoc.adventofcode.utils.SonarVariation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class DayOneTests {

    public static final int DAYONE_ANSWER_1 = 1616;
    public static final int DAYONE_ANSWER_2 = 1645;

    public static final String DAY_1_INPUT = "src/main/resources/day1_input";

    @Autowired
    FileReader fileReader;

    @Autowired
    SonarVariation sonarVariation;

    @Test
    void DayOne_input_partOne() throws IOException {
        Assertions.assertEquals(DAYONE_ANSWER_1, sonarVariation.solve(fileReader.readFileInputListInteger(DAY_1_INPUT), 1));
    }

    @Test
    void DayOne_input_partTwo() throws IOException {
        Assertions.assertEquals(DAYONE_ANSWER_2, sonarVariation.solve(fileReader.readFileInputListInteger(DAY_1_INPUT), 3));
    }

}

