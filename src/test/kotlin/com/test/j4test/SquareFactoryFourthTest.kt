package com.test.j4test

import com.test.j4test.Hooks.Companion.FOURTH_CLASS_FIRST_METHOD
import com.test.j4test.Hooks.Companion.FOURTH_CLASS_SECOND_METHOD
import org.junit.Test

class SquareFactoryFourthTest {
    @Test
    fun seventhTest() {
        awaitExecution(buildSquare(7), FOURTH_CLASS_FIRST_METHOD)
    }

    @Test
    fun eightTest() {
        awaitExecution(buildSquare(8), FOURTH_CLASS_SECOND_METHOD)
    }
}
