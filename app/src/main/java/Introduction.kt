import io.reactivex.Observable

/**
 * In order to visualize how to convert a native array processing code
 * into its asynchronous Rx counterpart, we will start with the most basic example:
 * */


fun main() {
    arrayExample()
    observableExample()
}

/**
 * A native array processing code
 * */
fun arrayExample() {
    val myArray = listOf(1, 2, 3) // Created an array with 3 elements, all immediately defined.
    val transformation = myArray.map { e ->
        println("Map: $e")
        e * 2
        // Multiplying all the values it emits by 2
    }
    val filtered = transformation.filter { e ->
        println("Filter: $e")
        e > 2
        // Discarded the ones equal to or less than 2
    }
    filtered.forEach { e ->
        println("Result: $e")
    }
    println("Done!")
    println("As you can see, array example did not start filtering before multiplying all the values with 2. Once 2, 4 and 6 is ready, it discarded the 2 and showed us the results. \n")
}

/**
 * Asynchronous Rx counterpart for the above native array processing code
 * */
fun observableExample() {
    val myObservable = Observable.fromArray(
        1,
        2,
        3
    ) // Created an observable with 3 elements, all immediately defined.
    val transformation = myObservable.map { e ->
        println("Rx: Map: $e")
        e * 2
        // Multiplying all the values it emits by 2
    }
    val filtered = transformation.filter { e ->
        println("Rx: Filter: $e")
        e > 2
        // Discarded the ones equal to or less than 2
    }
    filtered.subscribe(
        { e ->
            // onNext
            println("Rx: Result: $e")
        },
        { ex ->
            // onError
            println("Rx: Error: $ex")
        },
        {
            // onComplete
            println("Rx: Done!")
            println(" The first thing you should notice is that at least the order of the results is still preserved. \n Remember that we are both printing the transformation and the filtering – since our first element is 1, it is multiplied by 2 as usual. \n Then, 2 is printed again which tells us that our observable decided to filter it instead of multiplying the next element by 2. \n If we used a longer list of numbers, the order of the mapping and filtering would also change on each run. \n This happens because none of the elements waits for its neighbours’ operations before continuing with its own transformations, \n giving us the opportunity to process multiple elements of data independently as long as they share the same type.")
        },
        {
            //onSubscribe
            println("Rx: Subscribed!")
        }
    ) // Subscribed to the observable and told it to print all the results one by one, or the errors if any occur
}
