package com.dboy.lifecyclecoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.dboy.lifecyclecoroutines.net.TestApi
import com.dboy.lifecyclecoroutines.net.TestNet
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    //network request job
    var launch: Job? = null


    fun requestNet(view: View) {

        //GlobalScope.launch
        launch = GlobalScope.launch(Dispatchers.IO) {
            //Simulation time-consuming
            delay(2000)
            //Network request
            val response = TestNet.retrofit.create(TestApi::class.java).test()
            //End of network request
            Log.d("MainActivity", "job Response" + response.body()?.toString())
            //Update UI
            withContext(Dispatchers.Main) {
                Toast.makeText(baseContext, "network job success!", Toast.LENGTH_SHORT).show()
            }
            Log.d("MainActivity", "job end")
        }
            .lifeRecycle(lifecycle) // <<<<<<<<<<<<<<<  The life cycle of binding coroutines and activities

        //GlobalScope.async
        GlobalScope.async(Dispatchers.IO) {
            //Simulation time-consuming
            delay(3000)
            //Network request
            val response = TestNet.retrofit.create(TestApi::class.java).test()
            //End of network request
            Log.d("MainActivity", "async job Response" + response.body()?.toString())
            //Update UI
            withContext(Dispatchers.Main) {
                Toast.makeText(baseContext, "async network job success!", Toast.LENGTH_SHORT).show()
            }
            Log.d("MainActivity", "async job end")
        }
            .lifeRecycle(lifecycle) // <<<<<<<<<<<<<<<  The life cycle of binding coroutines and activities

        //runBlocking and withContext use
//        runBlocking(Dispatchers.IO) {
//            lifeRecycle(lifecycle) // <<<<<<<<<<<<<<<  The life cycle of binding coroutines and activities
//           //Simulation time-consuming
//            delay(5000)
//            //Update UI
//            withContext(Dispatchers.Main) {
//                lifeRecycle(lifecycle) // <<<<<<<<<<<<<<<  The life cycle of binding coroutines and activities
//                Log.d("ManActivity", "withContext end")
//            }
//            Log.d("ManActivity", "runBlocking end")
//        }
    }
}

