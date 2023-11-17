package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

                }
            }
        }
    }
}

@Composable
fun DisplayText() {
    Article(title = stringResource(R.string.jetpack_compose_tutorial), shortDesciption = stringResource(
        id = R.string.about_jetpack), longDescription = stringResource(R.string.explanation),
        imagePainter = painterResource(id = R.drawable.bg_compose_background)
    )
}

@Composable
fun Article(title : String, shortDesciption : String, longDescription : String, imagePainter : Painter, modifier: Modifier = Modifier ){
    Column (modifier = Modifier){
        Image(painter = imagePainter, contentDescription = null)
        Text(
            text = title,
            modifier = Modifier
                .padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = shortDesciption,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = longDescription,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )

    }


}

@Preview(showBackground = true, showSystemUi = true,
    name =  "JetpackCompose")
@Composable
fun GreetingPreview() {
    JetpackComposeTutorialTheme {
        DisplayText()

    }
}
