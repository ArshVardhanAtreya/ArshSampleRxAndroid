package schedulers

import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

/**
 * Returns a default, shared Scheduler instance that creates a new Thread for each unit of work.
 **/

fun main() {
    Observable.just("Apple", "Orange", "Banana")
        .subscribeOn(Schedulers.newThread())
        .subscribe { v -> println("Received: $v") }
}