package emitters

import io.reactivex.Single

/**
 * It’s used when there’s a single value to be returned.
 * If we use this class and there is a value emitted, onSuccess will be called.
 * If there’s no value, onError will be called.
 * */

fun main() {
    Single.just("Single Example")
        .subscribe(
            { v -> println("Value is: $v") },
            { e -> println("Error: $e") }
        )
}