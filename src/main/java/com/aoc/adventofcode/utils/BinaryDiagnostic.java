package com.aoc.adventofcode.utils;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BinaryDiagnostic {

    public int solve(List<String> binary){
        return Integer.parseInt(gammaRate(binary), 2)*Integer.parseInt(epsilonRate(binary), 2);
    }

    private String gammaRate(List<String> binary) {
        return binary.stream().map(u -> (StringUtils.countOccurrencesOf(u, "1") > StringUtils.countOccurrencesOf(u, "0")) ? "1" : "0").collect(Collectors.joining());
    }

    private String epsilonRate(List<String> binary) {
        return binary.stream().map(u -> (StringUtils.countOccurrencesOf(u, "1") > StringUtils.countOccurrencesOf(u, "0")) ? "0" : "1").collect(Collectors.joining());
    }
}
