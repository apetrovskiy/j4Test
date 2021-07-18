package com.test.j4test;

import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class LuckyTicketTest {
    @P
    void testSummator(int inputNumber){

    }

    static Stream<Arguments> getInputData(){
        Stream.of(
                Arguments.of(123456,false),
                Arguments.of(111111,true)
        );
    }
}
