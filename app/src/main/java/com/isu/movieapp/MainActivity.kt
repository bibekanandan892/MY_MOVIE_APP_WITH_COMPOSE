package com.isu.movieapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.isu.movieapp.navagation.MovieNavigation
import com.isu.movieapp.ui.theme.MovieAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MovieNavigation()
            }
        }
    }
}

@Composable
fun MyApp( content : @Composable () -> Unit){
    MovieAppTheme {
        content()
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp {
        MovieNavigation()
    }
}