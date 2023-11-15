package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DisplayText("Android")
                }
            }
        }
    }
}

@Composable
fun DisplayText(paragraph: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $paragraph!",
        modifier = modifier
    )
}

@Composable
fun FrontImage(message: String,modifier: Modifier = Modifier ){
    val image = painterResource(id = R.drawable.bg_compose_background)
    Box{
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop, //fits the image to the screen
//            alpha = 0.7F //controls opacity
            alignment = 
        )
        DisplayText(paragraph = message, modifier = Modifier)
    }
}

@Preview(showBackground = true, showSystemUi = true,
    name =  "JetpackCompose")
@Composable
fun GreetingPreview() {
    JetpackComposeTutorialTheme {
        FrontImage("Android")
    }
}
