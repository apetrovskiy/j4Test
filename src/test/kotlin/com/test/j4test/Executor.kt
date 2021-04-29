package com.test.j4test

import com.test.j4test.model.Square
import org.awaitility.Awaitility
import java.time.Duration
import java.time.LocalDateTime

fun awaitExecution(data: Square, description: String) {
    val AT_MOST_SECONDS = 5L
    val startTime = LocalDateTime.now()
    Awaitility.await()
        .atMost(Duration.ofSeconds(AT_MOST_SECONDS))
        .ignoreExceptions()
        .until {
            println(data)
            printCurrentThreadName(description)
            LocalDateTime.now() > startTime.plusSeconds(AT_MOST_SECONDS - 1)
        }
}

fun printCurrentThreadName(data: String) {
    println(Thread.currentThread().getName() + if ("" != data) " " + data else "")
}
