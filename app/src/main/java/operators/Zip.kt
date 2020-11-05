package operators

import io.reactivex.Observable
import io.reactivex.functions.BiFunction

/**
 * The zip() operator will combine the values of multiple Observable together through a specific function.
 * */

fun main() {

    Observable.zip(
        Observable.just(
            "Roses", "Sunflowers", "Leaves", "Clouds", "Violets", "Plastics"
        ),
        Observable.just(
            "Red", "Yellow", "Green", "White or Grey", "Purple"
        ),
        BiFunction<String, String, String> { type, color ->
            "$type are $color"
        }
    )
        .subscribe { v -> println("Received: $v") }
}