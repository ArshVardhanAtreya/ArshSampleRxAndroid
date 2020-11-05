## Rx is an abbreviation for ReativeX.

## Observables
Observables is an asynchronous data stream producer. It can be Hot Observable or Cold Observable. For Example:
- Click Events (Hot Observable)
- Keyboard Input (Hot Observable)
- Database Access (Hot Observable)
- Server Response (Hot Observable)
- Chaining (Hot Observable)
- Abstraction (Hot Observable)
- Data Transformation (Hot Observable)
- Accessing a File (Cold Observable)

Following are the types of observables:

#### 1. CREATE
It creates an Observable from scratch by means of a function
#### 2. FROM ARRAY
FromArray converts various other objects and data types into Observables

#### 3. FROM ITERABLE
Iterables can be thought of as a sort of synchronous Observable

#### 4. JUST
Just converts an object or a set of objects into an Observable that emits that or those objects

### Observers
Any object that wants to be notified when another object changes.

## Emitters


#### 1. COMPLETABLE
A completable won’t emit any data, what it does is let you know whether the operation was successfully completed.
If it was, it calls onComplete and if it wasn’t it calls onError .
A common use case of completable is for REST APIs, where successful access will return HTTP 204 ,
and errors can ranger from HTTP 301 , HTTP 404 , HTTP 500 , etc.
We might do something with the information.

#### 2. FLOWABLE
It works exactly like an Observable but it supports Back-pressure.

#### 3. MAYBE
It used when you’d like to return a single optional value.
The methods are mutually exclusive, in other words, only one of them is called.
If there is an emitted value, it calls onSuccess , if there’s no value,
it calls onComplete or if there’s an error, it calls onError .

#### 4. SINGLE
It’s used when there’s a single value to be returned.
If we use this class and there is a value emitted, onSuccess will be called.
If there’s no value, onError will be called.

## Operators
Operators helps originate new Observables.

#### 1. MAP
For a given Observable<T>, the map() operator will transform a T emission  
into an R emission using the provided Function<T,R> lambda.

#### 2. FLATMAP
As you can see, with a map you get T (generic type) for the value and R for the result, plain as that.
And for the flatMap() you transform T into an Observable, which can have its own specific chains, including specifying its own thread.

#### 3. FILTERS
The  filter() operator accepts Predicate<T> for a given Observable<T>. This means that you provide it a lambda that qualifies each emission by mapping it to a Boolean value, and emissions with false will not go forward.

#### 4. CONCAT
As the name suggests, concat() will concatenate (join together) two or more Observable .

#### 5. REPEAT
This operator will repeat the emission of the values however many times we may need.

#### 6. ZIP
This operator will combine the values of multiple Observable together through a specific function.

## Schedulers
Helps you to handle concurrency

#### 1. COMPUTATION
Returns a default, shared Scheduler instance intended for computational work.

#### 2. IO
Returns a default, shared Scheduler instance intended for IO-bound work.

#### 3. NEW_THREAD
Returns a default, shared Scheduler instance that creates a new Thread for each unit of work.

#### 4. SINGLE
Returns a default, shared, single-thread-backed Scheduler instance for work requiring strongly-sequential execution on the same background thread.

#### 5. TRAMPOLINE
Returns a default, shared Scheduler instance whose Worker instances queue work and execute them in a FIFO manner on one of the participating threads.
