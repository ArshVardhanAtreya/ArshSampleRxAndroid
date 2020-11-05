package operators

import io.reactivex.Observable

/**
 * As you can see, with a map you get T (generic type) for the value and R for the result, plain as that.
 * And for the flatMap() you transform T into an Observable,
 * which can have its own specific chains, including specifying its own thread.
 * */

fun main() {
    Observable.just("GOOD", "BETTER", "BEST")
        .flatMap { m ->
            Observable.just("${m.length}")
        }
        .subscribe { v -> println("Received: $v") }
}


