package com.test.j4test

import com.test.j4test.Hooks.Companion.AT_MOST_SECONDS
import com.test.j4test.Hooks.Companion.THIRD_CLASS_FIRST_METHOD
import com.test.j4test.Hooks.Companion.THIRD_CLASS_SECOND_METHOD
import org.awaitility.Awaitility
import org.junit.Test
import java.time.Duration

class SquareFactoryThirdTest {
    @Test
    fun fifthTest() {
        val square = buildSquare(5)
        Awaitility.await()
            .atMost(Duration.ofSeconds(AT_MOST_SECONDS))
            .until {
                println(square)
                Hooks.printCurrentThreadName(THIRD_CLASS_FIRST_METHOD)
                false
            }
    }

    @Test
    fun sixthTest() {
        val square = buildSquare(6)
        Awaitility.await()
            .atMost(Duration.ofSeconds(AT_MOST_SECONDS))
            .until {
                println(square)
                Hooks.printCurrentThreadName(THIRD_CLASS_SECOND_METHOD)
                false
            }
    }
}
