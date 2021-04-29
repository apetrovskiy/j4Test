package com.test.j4test

import com.test.j4test.Hooks.Companion.THIRD_CLASS_FIRST_METHOD
import com.test.j4test.Hooks.Companion.THIRD_CLASS_SECOND_METHOD
import org.junit.Test

class SquareFactoryThirdTest {
    @Test
    fun fifthTest() {
        awaitExecution(buildSquare(5), THIRD_CLASS_FIRST_METHOD)
    }

    @Test
    fun sixthTest() {
        awaitExecution(buildSquare(6), THIRD_CLASS_SECOND_METHOD)
    }
}
