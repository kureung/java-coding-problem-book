package com.github.kureung.codingproblembook.countingCharacters;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CharacterCountCalculatorTest {
    @Test
    @DisplayName("문자 개수 세기")
    void execute1() {
        var target = "ABC";
        Map<Character, Long> expected = Map.of(
                'A', 1L,
                'B', 1L,
                'C', 1L
        );

        var actual = CharacterCountCalculator.execute(target);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("중복된 문자가 있을 경우 제외한다")
    void execute2() {
        var target = "AAB";
        Map<Character, Long> expected = Map.of(
                'A', 2L,
                'B', 1L
        );

        var actual = CharacterCountCalculator.execute(target);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("중복된 문자가 있을 경우 제외한다")
    void execute3() {
        var target = "AaB";
        Map<Character, Long> expected = Map.of(
                'A', 1L,
                'a', 1L,
                'B', 1L
        );

        var actual = CharacterCountCalculator.execute(target);
        assertThat(actual).isEqualTo(expected);
    }
}
