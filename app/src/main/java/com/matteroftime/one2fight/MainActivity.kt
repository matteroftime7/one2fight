package com.matteroftime.one2fight

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.matteroftime.feature.auth.api.AuthNavKey
import com.matteroftime.feature.auth.impl.ui.LoginScreen
import com.matteroftime.one2fight.ui.theme.One2fightTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            One2fightTheme {

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    val backStack = rememberNavBackStack(AuthNavKey)

                    NavDisplay(
                        modifier = Modifier.fillMaxSize().padding(innerPadding),
                        backStack = backStack,
                        entryProvider = { key ->
                            when (key) {
                                is AuthNavKey -> {
                                    NavEntry(key = key) {
                                        LoginScreen()
                                    }
                                }
                                else -> throw RuntimeException("Invalid NavKey")
                            }
                        },
                    )
                }
            }
        }
    }
}

