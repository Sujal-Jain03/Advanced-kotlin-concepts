package com.example.flowsinkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.launch


suspend fun main(){
    simpleFlow().collect{value->
        println(value)
    }

    val flowFirst=flow{
        emit(1)
        emit(2)
    }

    val flowTwo=flowOf(1,2,3)

    val flowThree=(1..50).asFlow()

    val flowFour= channelFlow {
        send(1)
        launch { send(2) }
    }

    val transformFlow = flow{
        emit(1)
        emit(2)
        emit(3)
    }
        .map{it*2}   //multiple the value by 2,4,6,--
        .filter{it>3} // keeps only value which is greater than 3
        .take(1)  // takes only first value

}

fun simpleFlow()=flow{
    for(i:Int in 1..50){
        emit(i)
        delay(500)

    }
}