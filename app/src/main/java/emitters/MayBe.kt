package emitters

import io.reactivex.Maybe

/**
 * This class is used when you’d like to return a single optional value.
 * The methods are mutually exclusive, in other words, only one of them is called.
 * If there is an emitted value, it calls onSuccess , if there’s no value,
 * it calls onComplete or if there’s an error, it calls onError .
 * */

fun main() {
    Maybe.just("Maybe Example")
        .subscribe(
            { value -> println("Received: $value") },
            { error -> println("Error: $error") },
            { println("Completed") }
        )
}