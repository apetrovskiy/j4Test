package com.test.j4test

import com.test.j4test.Hooks.Companion.AT_MOST_SECONDS
import com.test.j4test.Hooks.Companion.FIRST_CLASS_FIRST_METHOD
import com.test.j4test.Hooks.Companion.FIRST_CLASS_SECOND_METHOD
import org.awaitility.Awaitility
import org.junit.Test
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT
import java.time.Duration

@Execution(CONCURRENT)
class SquareFactoryFirstTest {
    @Test
    fun firstTest() {
        val square = buildSquare(1)
//        Awaitility.await()
//            .atMost(Duration.ofSeconds(AT_MOST_SECONDS))
//            .until {
//                println(Thread.currentThread().getName() + FIRST_CLASS_FIRST_METHOD)
//                false
//            }
        println(square)
        println(Thread.currentThread().getName() + FIRST_CLASS_FIRST_METHOD)
    }

    @Test
    fun fsecondTest() {
        val square = buildSquare(2)
//        Awaitility.await()
//            .atMost(Duration.ofSeconds(AT_MOST_SECONDS))
//            .until {
//                println(Thread.currentThread().getName() + FIRST_CLASS_SECOND_METHOD)
//                false
//            }
        println(square)
        println(Thread.currentThread().getName() + FIRST_CLASS_SECOND_METHOD)
    }
}
