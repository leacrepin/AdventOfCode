package com.aoc.adventofcode;

import com.aoc.adventofcode.utils.BinaryDiagnostic;
import com.aoc.adventofcode.utils.FileReader;
import com.aoc.adventofcode.utils.SubmarineDive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
public class DayThreeTests {

    public static final int DAYTHREE_ANSWER_1 = 3985686;
    //public static final int DAYTHREE_ANSWER_2 = 1340836560;

    public static final String DAY_3_INPUT = "src/main/resources/day3_input";

    @Autowired
    FileReader fileReader;

    @Autowired
    BinaryDiagnostic binaryDiagnostic;

    @Test
    void DayThree_input_partOne() throws IOException {
        Assertions.assertEquals(DAYTHREE_ANSWER_1, binaryDiagnostic.solve(fileReader.reverseInputListString(DAY_3_INPUT)));
    }

//    @Test
//    void DayThree_input_partTwo() throws IOException {
//        Assertions.assertEquals(DAYTHREE_ANSWER_2, binaryDiagnostic.solve(fileReader.reverseInputListString(DAY_3_INPUT)));
//    }
}
