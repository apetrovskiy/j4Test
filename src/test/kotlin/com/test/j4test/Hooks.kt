package com.test.j4test

import org.awaitility.Awaitility
import org.junit.BeforeClass
import java.time.Duration
import java.util.concurrent.TimeUnit

class Hooks {
    @BeforeClass
    fun beforeClass() {
        Awaitility.setDefaultPollInterval(POLL_INTERVAL_MILLIS, TimeUnit.MILLISECONDS)
        Awaitility.setDefaultPollDelay(Duration.ZERO)
    }

    companion object {
        val FIRST_CLASS_FIRST_METHOD = "first class first method"
        val FIRST_CLASS_SECOND_METHOD = "first class second method"
        val SECOND_CLASS_FIRST_METHOD = "second class first method"
        val SECOND_CLASS_SECOND_METHOD = "second class second method"
        val THIRD_CLASS_FIRST_METHOD = "third class first method"
        val THIRD_CLASS_SECOND_METHOD = "third class second method"
        val FOURTH_CLASS_FIRST_METHOD = "fourth class first method"
        val FOURTH_CLASS_SECOND_METHOD = "fourth class second method"
        val AT_MOST_SECONDS = 4L
        val POLL_INTERVAL_MILLIS = 2000L

        @JvmStatic
        fun printCurrentThreadName(data: String) {
            println(Thread.currentThread().getName() + if ("" != data) " " + data else "")
        }
    }
}
