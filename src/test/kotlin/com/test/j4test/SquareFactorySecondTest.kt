package com.test.j4test

import com.test.j4test.Hooks.Companion.SECOND_CLASS_FIRST_METHOD
import com.test.j4test.Hooks.Companion.SECOND_CLASS_SECOND_METHOD
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT

@Execution(CONCURRENT)
class SquareFactorySecondTest {
    @Test
    fun thirdTest() {
        awaitExecution(buildSquare(3), SECOND_CLASS_FIRST_METHOD)
    }

    @Test
    fun fourthTest() {
        awaitExecution(buildSquare(4), SECOND_CLASS_SECOND_METHOD)
    }
}
