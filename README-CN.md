# LifecycleCoroutines

#### 半行代码搞定协程生命周期回收，当Activity执行OnDestroy的时候自动取消协程！

#### 使用扩展函数实现生命周期的绑定，不影响代码结构。



## 如何使用

##### 粘贴[**LifecycleCorutines.kt**](app\src\main\java\com\dboy\lifecyclecoroutines\LifecycleCorutines.kt)到你的项目中。

##### `launch` 使用

```kotlin
GlobalScope.launch(Dispatchers.IO){
    
}.lifeRecycle(lifecycle) <<<<在这里
```

##### `async` 使用

```kotlin
GlobalScope.async(Dispatchers.IO){

}.lifeRecycle(lifecycle) <<<<在这里
```

##### `runBlocking ` 使用

```kotlin
runBlocking(Dispatchers.IO) {
	lifeRecycle(lifecycle) <<<<在这里
}
```

##### `withContext` 使用

```kotlin
withContext(Dispatchers.Main){
	lifeRecycle(lifecycle) <<<<在这里
}
```

##### 使用实例

```kotlin
//这是一个网络请求
GlobalScope.launch(Dispatchers.IO) {
            //模拟超时
            delay(2000)
            //网络请求 还不会使用协程+Retrofit的朋友可以搜索相关文章学习
            val response = TestNet.retrofit.create(TestApi::class.java).test()
            //请求结束
            Log.d("MainActivity", "job Response" + response.body()?.toString())
            //更新UI
            withContext(Dispatchers.Main) {
                Toast.makeText(baseContext, "network job success!", Toast.LENGTH_SHORT).show()
            }
            Log.d("MainActivity", "job end")
        }
            .lifeRecycle(lifecycle) 
```

