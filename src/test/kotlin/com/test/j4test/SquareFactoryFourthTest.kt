package com.test.j4test

import com.test.j4test.Hooks.Companion.FOURTH_CLASS_FIRST_METHOD
import com.test.j4test.Hooks.Companion.FOURTH_CLASS_SECOND_METHOD
import org.awaitility.Awaitility
import org.junit.Test
import java.time.Duration

class SquareFactoryFourthTest {
    @Test
    fun seventhTest() {
        val square = buildSquare(7)
        Awaitility.await()
            .atMost(Duration.ofSeconds(Hooks.AT_MOST_SECONDS))
            .until {
                println(square)
                Hooks.printCurrentThreadName(FOURTH_CLASS_FIRST_METHOD)
                false
            }
    }

    @Test
    fun eightTest() {
        val square = buildSquare(8)
        Awaitility.await()
            .atMost(Duration.ofSeconds(Hooks.AT_MOST_SECONDS))
            .until {
                println(square)
                Hooks.printCurrentThreadName(FOURTH_CLASS_SECOND_METHOD)
                false
            }
    }
}
