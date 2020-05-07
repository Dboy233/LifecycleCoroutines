# LifecycleCoroutines

#### Half line of code to get coroutine life cycle recycling，When the Activity executes On Destroy, the coroutine is automatically canceled!

#### Using extension functions to achieve life cycle binding does not affect the code structure.

### [中文文档](README-CN.md)

## HOW TO USE

##### Paste[**LifecycleCorutines.kt**](\app\src\main\java\com\dboy\lifecyclecoroutines\LifecycleCorutines.kt) Into your project。

##### `launch` use

```kotlin
GlobalScope.launch(Dispatchers.IO){
    
}.lifeRecycle(lifecycle) <<<<it's here
```

##### `async` use

```kotlin
GlobalScope.async(Dispatchers.IO){

}.lifeRecycle(lifecycle) <<<<it's here
```

##### `runBlocking ` use

```kotlin
runBlocking(Dispatchers.IO) {
	lifeRecycle(lifecycle) <<<<it's here
}
```

##### `withContext` use

```kotlin
withContext(Dispatchers.Main){
	lifeRecycle(lifecycle) <<<<it's here
}
```

##### Examples of use

```kotlin
//This is a network request
GlobalScope.launch(Dispatchers.IO) {
            //Simulation timeout
            delay(2000)
            //Internet request. Friends who will not use coroutine + Retrofit can search related articles to learn
            val response = TestNet.retrofit.create(TestApi::class.java).test()
            //End of request
            Log.d("MainActivity", "job Response" + response.body()?.toString())
            //Update UI
            withContext(Dispatchers.Main) {
                Toast.makeText(baseContext, "network job success!", Toast.LENGTH_SHORT).show()
            }
            Log.d("MainActivity", "job end")
        }
            .lifeRecycle(lifecycle) 
```

