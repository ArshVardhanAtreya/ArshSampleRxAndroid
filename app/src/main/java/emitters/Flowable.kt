package emitters

import io.reactivex.Flowable

/**
 * It works exactly like an Observable but it supports Back-pressure.
 * */

fun main() {

    Flowable.just("Flowable Example")
        .subscribe(
            { value -> println("Received: $value") },
            { error -> println("Error: $error") },
            { println("Completed") }
        )

}