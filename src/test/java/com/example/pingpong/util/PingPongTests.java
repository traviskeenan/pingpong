package com.example.pingpong.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PingPongTests {

    @ParameterizedTest
    @MethodSource
    public void echo(int input, String expected) {
        PingPong pingPong = new PingPong();
        assertEquals(expected, pingPong.volley(input));
    }
    // init test
    private static Stream<Arguments> echo() {
        return Stream.of(
            Arguments.of(1, "1"),
            Arguments.of(2, "2")
        );
    }

    @ParameterizedTest
    @MethodSource
    public void ping(int input, String expected) {
        PingPong pingPong = new PingPong();
        assertEquals(expected, pingPong.volley(input));
    }
    // divisible by 3
    private static Stream<Arguments> ping() {
        return Stream.of(
            Arguments.of(1, "1"),
            Arguments.of(2, "2"),
            Arguments.of(3, "ping"),
            Arguments.of(4, "4")
        );
    }

    @ParameterizedTest
    @MethodSource
    public void pong(int input, String expected) {
        PingPong pingPong = new PingPong();
        assertEquals(expected, pingPong.volley(input));
    }
    // divisible by 5
    private static Stream<Arguments> pong() {
        return Stream.of(
            Arguments.of(1, "1"),
            Arguments.of(2, "2"),
            Arguments.of(3, "ping"),
            Arguments.of(4, "4"),
            Arguments.of(5, "pong"),
            Arguments.of(6, "ping"),
            Arguments.of(7, "7"),
            Arguments.of(8, "8"),
            Arguments.of(9, "ping"),
            Arguments.of(10, "pong"),
            Arguments.of(11, "11"),
            Arguments.of(12, "ping"),
            Arguments.of(13, "13"),
            Arguments.of(14, "14")
        );
    }

    @ParameterizedTest
    @MethodSource
    public void ping_pong(int input, String expected) {
        PingPong pingPong = new PingPong();
        assertEquals(expected, pingPong.volley(input));
    }
    // divisible by 3 and 5
    private static Stream<Arguments> ping_pong() {
        return Stream.of(
            Arguments.of(1, "1"),
            Arguments.of(2, "2"),
            Arguments.of(3, "ping"),
            Arguments.of(4, "4"),
            Arguments.of(5, "pong"),
            Arguments.of(6, "ping"),
            Arguments.of(7, "7"),
            Arguments.of(8, "8"),
            Arguments.of(9, "ping"),
            Arguments.of(10, "pong"),
            Arguments.of(11, "11"),
            Arguments.of(12, "ping"),
            Arguments.of(13, "13"),
            Arguments.of(14, "14"),
            Arguments.of(15, "pingpong"),
            Arguments.of(16, "16"),
            Arguments.of(17, "17"),
            Arguments.of(18, "ping"),
            Arguments.of(19, "19"),
            Arguments.of(20, "pong"),
            Arguments.of(21, "ping"),
            Arguments.of(22, "22"),
            Arguments.of(23, "23"),
            Arguments.of(24, "ping"),
            Arguments.of(25, "pong"),
            Arguments.of(26, "26"),
            Arguments.of(27, "ping"),
            Arguments.of(28, "28"),
            Arguments.of(29, "29"),
            Arguments.of(30, "pingpong")
        );
    }
}
