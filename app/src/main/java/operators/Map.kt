package operators

import io.reactivex.Observable

/**
 * For a given Observable<T>, the map() operator will transform a T emission into an R emission using the provided Function<T,R> lambda.
 * */


fun main() {

    Observable.fromArray(1, 2, 3, 4, 5)
        .map { it * 2 }
        .subscribe { println(it) }

}