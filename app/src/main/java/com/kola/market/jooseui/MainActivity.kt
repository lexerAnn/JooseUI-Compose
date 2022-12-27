package com.kola.market.jooseui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kola.market.jooseui.auth.AuthDashBoardScreen
import com.kola.market.jooseui.auth.SignInScreen
import com.kola.market.jooseui.ui.theme.JooseUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JooseUITheme {
                JooseUiApp()
            }
        }
    }
}

@Composable
fun JooseUiApp(){
    val navigation = rememberNavController()
    NavHost(navController = navigation, startDestination = "authentication"){
        composable(route = "authentication"){
            AuthDashBoardScreen(
                onItemClick = {navigation.navigate("signInScreen")}
            )
        }
        composable(route = "signInScreen"){
            SignInScreen()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JooseUITheme {
      //  AuthDashBoardScreen()
//        Greeting("Android")
    }
}