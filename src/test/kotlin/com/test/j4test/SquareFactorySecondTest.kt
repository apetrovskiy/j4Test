package com.test.j4test

import com.test.j4test.Hooks.Companion.AT_MOST_SECONDS
import com.test.j4test.Hooks.Companion.SECOND_CLASS_FIRST_METHOD
import com.test.j4test.Hooks.Companion.SECOND_CLASS_SECOND_METHOD
import org.awaitility.Awaitility
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT
import java.time.Duration

@Execution(CONCURRENT)
class SquareFactorySecondTest {
    @Test
    fun thirdTest() {
        val square = buildSquare(3)
        Awaitility.await()
            .atMost(Duration.ofSeconds(AT_MOST_SECONDS))
            .until {
                println(square)
                Hooks.printCurrentThreadName(SECOND_CLASS_FIRST_METHOD)
                false
            }
    }

    @Test
    fun fourthTest() {
        val square = buildSquare(4)
        Awaitility.await()
            .atMost(Duration.ofSeconds(AT_MOST_SECONDS))
            .until {
                println(square)
                Hooks.printCurrentThreadName(SECOND_CLASS_SECOND_METHOD)
                false
            }
    }
}
