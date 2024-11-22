package com.example.userpage

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
import com.example.userpage.ui.theme.UserPageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            /* Spacer(modifier = Modifier.height(16.dp))

        Image(painterResource(id = R.drawable.a), contentDescription = "userImage", modifier = Modifier.size(200.dp))

        Spacer(modifier = Modifier.height(16.dp))*/


     //      UserPageScreen() //look is ready and all solid principles are applied acc to me
            EditProfileScreen() //testing phase rn
                }
            }
        }


