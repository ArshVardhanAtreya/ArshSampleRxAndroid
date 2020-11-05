package schedulers

import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

/**
 * Returns a default, shared Scheduler instance whose Worker
 * instances queue work and execute them in a FIFO manner on one of the participating threads.
 * */

fun main() {
    Observable.just("Apple", "Orange", "Banana")
        .subscribeOn(Schedulers.trampoline())
        .subscribe { v -> println("Received: $v") }
}