package observables

import io.reactivex.Observable

/**
 * It creates an Observable from scratch by means of a function
 * */

fun main() {
    val myList = listOf("Arsh", "Vardhan", "Atreya")
    Observable.create<String> { emitter ->
        myList.forEach { kind ->
            if (kind == "") {
                emitter.onError(Exception("No value to show"))
            }
            emitter.onNext(kind)
        }
        emitter.onComplete()
    }.subscribe { print("$it ") }
}