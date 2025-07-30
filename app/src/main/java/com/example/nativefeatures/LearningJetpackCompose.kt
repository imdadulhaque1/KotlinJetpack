package com.example.nativefeatures

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun GreetingFunc(name: String){
    Text("Hello, $name !")
}