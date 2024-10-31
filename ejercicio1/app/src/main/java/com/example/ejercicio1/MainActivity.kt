package com.example.ejercicio1

import Screen1
import Screen2
import Screen3
import Screen4
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.example.ejercicio1.ui.theme.Ejercicio1Theme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio1Theme {
                val navController = rememberNavController()
                Scaffold(
                    topBar = {
                        CenterAlignedTopAppBar(
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = Color(color = 0xFFFFBF00)
                            ),
                            title = { Text(text = "IES Mare Nostrum") },
                            navigationIcon = {
                                Icon(
                                    imageVector = Icons.Filled.AccountCircle,
                                    contentDescription = "favorite",
                                    modifier = Modifier.padding(16.dp, 16.dp, 0.dp, 16.dp).size(32.dp)
                                )
                            },
                            actions = {
                                Icon(
                                    imageVector = Icons.Filled.Search,
                                    contentDescription = "favorite",
                                    modifier = Modifier.padding(0.dp, 16.dp, 16.dp, 16.dp).size(32.dp)
                                )
                                Icon(
                                    imageVector = Icons.Filled.Settings,
                                    contentDescription = "favorite",
                                    modifier = Modifier.padding(0.dp, 16.dp, 16.dp, 16.dp).size(32.dp)
                                )
                            }
                        )
                    },

                    bottomBar = {
                        BottomAppBar(containerColor = Color(0xFFFFBF00)) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceEvenly
                            ) {

                                Column (
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .clickable { navController.navigate("screen1") }) {
                                    Icon(
                                        imageVector = Icons.Filled.Home,
                                        contentDescription = "home",
                                        modifier = Modifier.size(32.dp)
                                    )
                                    Text(
                                        text = "Home",
                                        textAlign = TextAlign.Center)
                                }

                                Column (
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .clickable { navController.navigate("screen2") }) {
                                    Icon(
                                        imageVector = Icons.Filled.Edit,
                                        contentDescription = "Subjects",
                                        modifier = Modifier.size(32.dp)
                                    )
                                    Text(
                                        text = "Subjects",
                                        textAlign = TextAlign.Center)
                                }

                                Column (
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .clickable { navController.navigate("screen3") }) {
                                    Icon(
                                        imageVector = Icons.Filled.Favorite,
                                        contentDescription = "Favorites",
                                        modifier = Modifier.size(32.dp)
                                    )
                                    Text(
                                        text = "Favorites",
                                        textAlign = TextAlign.Center)
                                }

                                Column (
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .clickable { navController.navigate("screen4") }) {
                                    Icon(
                                        imageVector = Icons.Filled.Star,
                                        contentDescription = "Stared",
                                        modifier = Modifier.size(32.dp)
                                    )
                                    Text(
                                        text = "Stared",
                                        textAlign = TextAlign.Center)
                                }
                            }
                        }
                    },
                    modifier = Modifier.fillMaxSize()
                ) {
                    innerPadding -> MyNavControllerCustom(
                    navController = navController,
                    modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MyNavControllerCustom(navController: NavHostController, modifier: Modifier) {

    NavHost(navController = navController, startDestination = "screen2", modifier = modifier) {
        composable("screen1"){ Screen1() }
        composable("screen2"){ Screen2() }
        composable("screen3"){ Screen3() }
        composable("screen4"){ Screen4() }
    }
}


