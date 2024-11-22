package com.example.userpage

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun signoutbutton()
{
    var showDialog by remember { mutableStateOf(false) }

    Button(
        onClick = { showDialog = true }, // Show confirmation dialog
        colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .padding(bottom = 8.dp)
    ) {
        Text(
            text = "sign out",
            color = Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }

    //FOR CONFIRMATION BROTHER
    if (showDialog) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0x80000000)) // Semi-transparent black background
                .clickable(enabled = false) {}, // Block interactions outside the dialog
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .background(Color.Gray, shape = CircleShape)
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Are you sure?",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // YES button
                    Button(
                        onClick = { /* Handle "YES" action */ },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
                        shape = CircleShape
                    ) {
                        Text(
                            text = "YES",
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }

                    // NO button
                    Button(
                        onClick = { showDialog = false }, // Close dialog
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                        shape = CircleShape
                    ) {
                        Text(
                            text = "NO",
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }
                }
            }
        }
    }
}

