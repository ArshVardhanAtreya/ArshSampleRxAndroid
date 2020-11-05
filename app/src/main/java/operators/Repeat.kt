package operators

import io.reactivex.Observable

/**
 * This operator will repeat the emission of the values however many times we may need.
 * */

fun main() {
    Observable.just(2, 3, 4)
        .repeat(2)
        .subscribe { v -> println("$v") }
}
