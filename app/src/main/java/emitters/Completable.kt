package emitters

import io.reactivex.Completable


/**
 * A completable won’t emit any data, what it does is let you know whether the operation was successfully completed.
 * If it was, it calls onComplete and if it wasn’t it calls onError .
 * A common use case of completable is for REST APIs, where successful access will return HTTP 204 ,
 * and errors can ranger from HTTP 301 , HTTP 404 , HTTP 500 , etc.
 * We might do something with the information.
 * */

fun main() {
    Completable.create { emitter ->
        emitter.onComplete()
        emitter.onError(Exception())
    }
}