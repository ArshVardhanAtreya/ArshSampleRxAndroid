package schedulers

import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

/**
 * Returns a default, shared Scheduler instance intended for computational work.
 * */


fun main() {
    Observable.just("Apple", "Orange", "Banana")
        .subscribeOn(Schedulers.computation())
        .subscribe { v -> println("Received: $v") }
}