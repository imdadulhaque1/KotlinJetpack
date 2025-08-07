package com.example.nativefeatures

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextGeometricTransform
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CounterScreen() {
    val shape: Shape= RoundedCornerShape(12.dp)
    val context = LocalContext.current
    var count by  remember { mutableStateOf(0) }

    Column(modifier = Modifier
        .fillMaxWidth()
        .shadow(8.dp, shape)
        .clip(shape)
        .background(Color.LightGray)
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {

        Text("$count", color= Color.Black, fontSize = 25.sp)

        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            val isMax = count >=10
            Button(onClick = {
                if (count < 10){
                    count += 1
                }else{
                    Toast.makeText(context, "Count is at maximum (10)", Toast.LENGTH_LONG).show()
                }
            },
//                enabled = count<10,
                colors = if (isMax) ButtonDefaults.buttonColors(containerColor = Color.Red, contentColor = Color.Red)
                else ButtonDefaults.buttonColors()

                ) {
                Text("increment by 1".replaceFirstChar { it.uppercase() }  , color=Color.White, fontSize = 15.sp)
            }

            val isMin = count <=0
            Button(onClick = {
                if (count > 0){
                    count -=1
                }else{
                    Toast.makeText(context, "Count is at minimum (0)", Toast.LENGTH_LONG).show()
                }

            },
//                enabled = count > 0,
                colors = if(isMin) ButtonDefaults.buttonColors(containerColor = Color.Red, contentColor = Color.Red)
                else ButtonDefaults.buttonColors()
            ) { Text("decrement by 1".replaceFirstChar { it.uppercase() }, color=Color.White, fontSize = 15.sp)}
        }
    }

}