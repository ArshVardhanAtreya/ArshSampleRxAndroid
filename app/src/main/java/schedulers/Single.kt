package schedulers

import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

/**
 * Returns a default, shared, single-thread-backed Scheduler instance for work
 * requiring strongly-sequential execution on the same background thread.
 * */

fun main() {
    Observable.just("Apple", "Orange", "Banana")
        .subscribeOn(Schedulers.single())
        .subscribe { v -> println("Received: $v") }
}