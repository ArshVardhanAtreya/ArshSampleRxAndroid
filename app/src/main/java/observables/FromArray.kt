package observables

import io.reactivex.Observable

/**
 * fromArray converts various other objects and data types into Observables
 * */
fun main() {
    Observable.fromArray("Arsh", "Vardhan", "Atreya")
        .subscribe { print("$it ") }
}