package com.test.j4test

import com.test.j4test.Hooks.Companion.FIRST_CLASS_FIRST_METHOD
import com.test.j4test.Hooks.Companion.FIRST_CLASS_SECOND_METHOD
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT

@Execution(CONCURRENT)
class SquareFactoryFirstTest {
    @Test
    fun firstTest() {
        awaitExecution(buildSquare(1), FIRST_CLASS_FIRST_METHOD)
    }

    @Test
    fun fsecondTest() {
        awaitExecution(buildSquare(2), FIRST_CLASS_SECOND_METHOD)
    }
}
