package com.aoc.adventofcode.utils;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class FileReader {

    public List<Integer> readFileInputListInteger(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .map(line -> line.split("\\s+")).flatMap(Arrays::stream)
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

    public List<String> readFileInputListString(String filePath){
        try {
            return Files.lines(Paths.get(filePath)).toList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Map.Entry<String, String>> readFileInputListStringString(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath)).toList()
                .stream().map(line -> Map.entry(Arrays.stream(line.split(" ")).toList().get(0), Arrays.stream(line.split(" ")).toList().get(1))).toList();
    }

    public List<String> reverseInputListString(String filePath) throws IOException {
        return IntStream.range(0, readFileInputListString(filePath).stream().toList().get(0).length())
                .mapToObj(i -> readFileInputListString(filePath).stream().toList().stream().map(u -> u.charAt(i)).map(String::valueOf).collect(Collectors.joining())).toList();
    }
}
