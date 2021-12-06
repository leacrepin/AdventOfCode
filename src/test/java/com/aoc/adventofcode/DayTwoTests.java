package com.aoc.adventofcode;

import com.aoc.adventofcode.utils.FileReader;
import com.aoc.adventofcode.utils.SubmarineDive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
public class DayTwoTests {

    public static final int DAYTWO_ANSWER_1 = 1499229;
    public static final int DAYTWO_ANSWER_2 = 1340836560;

    public static final String DAY_2_INPUT = "src/main/resources/day2_input";

    @Autowired
    FileReader fileReader;

    @Autowired
    SubmarineDive submarineDive;

    @Test
    void DayTwo_input_partOne() throws IOException {
        Assertions.assertEquals(DAYTWO_ANSWER_1, submarineDive.solve(fileReader.readFileInputListStringString(DAY_2_INPUT)));
    }

    @Test
    void DayTwo_input_partTwo() throws IOException {
        Assertions.assertEquals(DAYTWO_ANSWER_2, submarineDive.solveWithAim(fileReader.readFileInputListStringString(DAY_2_INPUT)));
    }
}
