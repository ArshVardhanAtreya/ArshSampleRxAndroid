package operators

import io.reactivex.Observable

/**
 * The  filter() operator accepts Predicate<T> for a given Observable<T>.
 * This means that you provide it a lambda that qualifies each emission by mapping it to a Boolean value,
 * and emissions with false will not go forward.
 * */

fun main() {

    Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
        .filter { it.length != 5 }
        .subscribe { println(it) }

}
