package schedulers

import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

/**
 * Returns a default, shared Scheduler instance intended for IO-bound work.
 * */

fun main() {
    Observable.just("Apple", "Orange", "Banana")
        .subscribeOn(Schedulers.io())
        .subscribe { v -> println("Received: $v") }
}