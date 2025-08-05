package com.example.nativefeatures

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ProductListCard(name: String, age: Int, color: Color, cornerRadius: Dp=12.dp, shadowElevation: Dp = 8.dp, modifier: Modifier = Modifier){
    val shape: Shape= RoundedCornerShape(cornerRadius)
    Column (
        modifier = modifier
            .fillMaxWidth()
            .shadow(shadowElevation, shape)
            .clip(shape)
            .background(color)
            .padding(16.dp)
    ){
        Text("Name: $name", color=Color.Black)
        Text("Age: $age", color=Color.Black)
        Text("Favourite Color: ${color.toString()}", color=Color.Black)
    }

}