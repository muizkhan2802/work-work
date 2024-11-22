package com.example.userpage

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable

fun editprofilebutton()
{
    Button(
        onClick = { /* TODO: Add Edit Profile functionality brother i.e edit prof scrn */ },
        colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
        modifier = Modifier.fillMaxWidth(0.8f)
    ) {
        Text(
            text = "edit profile",
            color = Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }
}