package com.test.j4test

import org.junit.Test
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode

@Execution(ExecutionMode.CONCURRENT)
class SquareFactoryThirdTest {
    @Test
    fun fifthTest() {
        val square = buildSquare(5)
//        Awaitility.await()
//            .atMost(Duration.ofSeconds(AT_MOST_SECONDS))
//            .until {
//                println(Thread.currentThread().getName() + SECOND_CLASS_FIRST_METHOD)
//                false
//            }
        println(square)
        println(Thread.currentThread().getName() + Hooks.SECOND_CLASS_FIRST_METHOD)
    }

    @Test
    fun sixthTest() {
        val square = buildSquare(6)
//        Awaitility.await()
//            .atMost(Duration.ofSeconds(AT_MOST_SECONDS))
//            .until {
//                println(Thread.currentThread().getName() + SECOND_CLASS_SECOND_METHOD)
//                false
//            }
        println(square)
        println(Thread.currentThread().getName() + Hooks.SECOND_CLASS_SECOND_METHOD)
    }
}
