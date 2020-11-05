package observables

import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

/**
 * Just converts an object or a set of objects into an Observable that emits that or those objects
 **/

fun main() {

    println("Observable for Data Transformation")
    val subscribe = Observable.just(1, 2, 3, 4, 5, 6, 7, 8)
        .map { "()".repeat(it) }
        .subscribe { println(it) }

    println("\nObservable for Chaining")
    val subscribe1 = Observable.just(1, 2, 3, 4, 5, 6, 7, 8)
        .map { "()".repeat(it) }
        .filter { it.length < 12 }
        .subscribe { println(it) }

    println("\nObservable for Abstraction")
    val subscribe2 = Observable.just(1, 2, 3, 4, 5, 6, 7, 8)
        .subscribeOn(Schedulers.io())
        .map { "()".repeat(it) }
        .subscribe { println(it) }


}