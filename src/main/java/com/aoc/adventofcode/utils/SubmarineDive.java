package com.aoc.adventofcode.utils;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class SubmarineDive {

    public int solve (List<Map.Entry<String, String>> movements){
        int depth = 0;
        int horizontal = 0;
        for (Map.Entry<String, String> u : movements) {
            switch (u.getKey()){
                case "forward" -> horizontal = horizontal + Integer.parseInt(u.getValue());
                case "down" -> depth = depth + Integer.parseInt(u.getValue());
                case "up" -> depth = depth - Integer.parseInt(u.getValue());
            }
        }
        return depth*horizontal;
    }

    public int solveWithAim (List<Map.Entry<String, String>> movements){
        int depth = 0;
        int horizontal = 0;
        int aim = 0;
        for (Map.Entry<String, String> u : movements) {
            switch (u.getKey()){
                case "forward" -> {
                    horizontal = horizontal + Integer.parseInt(u.getValue());
                    depth = depth + aim * Integer.parseInt(u.getValue());
                }
                case "down" -> aim = aim + Integer.parseInt(u.getValue());
                case "up" -> aim = aim - Integer.parseInt(u.getValue());
            }
        }
        return depth*horizontal;
    }
}
