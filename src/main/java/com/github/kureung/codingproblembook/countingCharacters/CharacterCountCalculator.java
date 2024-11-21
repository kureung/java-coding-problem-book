package com.github.kureung.codingproblembook.countingCharacters;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCountCalculator {
    public static Map<Character, Long> execute(String target) {
        if (target == null) {
            throw new IllegalArgumentException("target is null");
        }

        return target.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
