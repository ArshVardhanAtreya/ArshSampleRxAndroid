package operators

import io.reactivex.Observable

/**
 * As the name suggests, concat() will concatenate (join together) two or more Observable .
 * */

fun main() {

    Observable.concat(
        Observable.just("Apple"),
        Observable.just("Orange", "Banana"),
        Observable.just("Pineapple", "Strawberry")
    )
        .subscribe { x -> println("$x") }
}