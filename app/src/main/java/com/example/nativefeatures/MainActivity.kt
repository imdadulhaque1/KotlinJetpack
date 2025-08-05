package com.example.nativefeatures

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.nativefeatures.ui.theme.NativeFeaturesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Allow drawing behind system bars
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            NativeFeaturesTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(PaddingValues(
                                top = WindowInsets.statusBars.asPaddingValues().calculateTopPadding(),
                                start = 10.dp,
                                end = 10.dp
                            )), // Adds top padding (like SafeAreaView)
//                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Top // <- Show content from top
                    ) {
                        RecompositionFunc("Kotlin jetpack Compose !")
                        RecompositionFunc("Learning Jetpack Compose Kotlin !")

                        ProductListCard("Imdadul Haque", 28, Color.LightGray, modifier = Modifier.padding(vertical = 16.dp)) // Here How can I set the margin vertically ?

                        CounterScreen()
                    }
                }
            }
        }
    }
}
