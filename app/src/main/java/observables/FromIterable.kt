package observables

import io.reactivex.Observable

/**
 * Iterables can be thought of as a sort of synchronous Observable
 * */

fun main() {
    Observable.fromIterable(listOf("Arsh", "Vardhan", "Atreya"))
        .subscribe(
            { value -> println("$value ") },                // onNext
            { error -> println("Error: $error") },          // onError
            { println("Completed") }                        // onComplete
        )
}