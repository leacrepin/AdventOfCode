package com.aoc.adventofcode.utils;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class SonarVariation {

    public int solve (List<Integer> sonar_numbers, int mesurement){
        return IntStream.range(0, sonar_numbers.subList(mesurement, sonar_numbers.size()).size())
                .mapToObj(i -> Map.entry(sonar_numbers.get(i), sonar_numbers.subList(mesurement, sonar_numbers.size()).get(i)))
                .collect(Collectors.toList()).stream().filter(u -> u.getValue()>u.getKey()).mapToInt(u -> 1).sum();
    }
}
