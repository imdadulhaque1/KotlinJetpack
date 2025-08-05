package com.example.nativefeatures
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun GreetingFunc(name: String){
    Text("Hello, $name !")
}

// ---> Re-composable Function
@Composable
fun RecompositionFunc(name: String){
    Text("Passing Text: $name .", color=Color.Black)
}