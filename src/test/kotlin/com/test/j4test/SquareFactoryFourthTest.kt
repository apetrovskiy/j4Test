package com.test.j4test

import com.test.j4test.Hooks.Companion.FOURTH_CLASS_FIRST_METHOD
import com.test.j4test.Hooks.Companion.FOURTH_CLASS_SECOND_METHOD
import com.test.j4test.Hooks.Companion.FOURTH_CLASS_THIRD_METHOD
import org.junit.Test
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode

@Execution(ExecutionMode.CONCURRENT)
class SquareFactoryFourthTest {
    @Test
    @org.junit.jupiter.api.Test
    fun seventhTest() {
        awaitExecution(buildSquare(7), FOURTH_CLASS_FIRST_METHOD)
    }

    @Test
    @org.junit.jupiter.api.Test
    fun eightTest() {
        awaitExecution(buildSquare(8), FOURTH_CLASS_SECOND_METHOD)
    }

    @Test
    fun ninthTest() {
        awaitExecution(buildSquare(9), FOURTH_CLASS_THIRD_METHOD)
    }
}
