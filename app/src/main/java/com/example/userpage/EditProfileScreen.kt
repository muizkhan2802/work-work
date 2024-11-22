package com.example.userpage

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter

// Global variables for username, contact number, bio, and profile picture
var globalUsername = mutableStateOf("Muiz ul Islam Khan")
var globalContactNo = mutableStateOf("420")
var globalBio = mutableStateOf("an eye for an eye wont make the whole world blind, just more pirate-y")

@Composable
fun EditProfileScreen() {
    // State to hold the selected image URI
    var profileImageUri by remember { mutableStateOf<Uri?>(null) }

    // Launcher for the image picker
    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        profileImageUri = uri // Update the profile image URI
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Edit Username
        Text(
            text = "Edit username",
            color = Color.Magenta,
            fontSize = 18.sp,
            modifier = Modifier.align(Alignment.Start).padding(bottom = 8.dp)
        )
        BasicTextField(
            value = globalUsername.value,
            onValueChange = { globalUsername.value = it },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(8.dp),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Edit Contact Number
        Text(
            text = "Edit contact no.",
            color = Color.Cyan,
            fontSize = 18.sp,
            modifier = Modifier.align(Alignment.Start).padding(bottom = 8.dp)
        )
        BasicTextField(
            value = globalContactNo.value,
            onValueChange = { globalContactNo.value = it },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(8.dp),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Profile Picture Section
        if (profileImageUri != null) {
            // Display the selected image
            Image(
                painter = rememberAsyncImagePainter(profileImageUri),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.Gray),
                contentScale = ContentScale.Crop
            )
        } else {
            // Placeholder for the image area
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.Gray),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "No Image", color = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Button to upload/change profile picture
        Button(
            onClick = { launcher.launch("image/*") },
            modifier = Modifier.align(Alignment.Start)
        ) {
            Text(text = "change/upload profile picture", color = Color.Red)
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Edit Bio
        Text(
            text = "edit bio:",
            color = Color.White,
            fontSize = 18.sp,
            modifier = Modifier.align(Alignment.Start).padding(bottom = 8.dp)
        )
        BasicTextField(
            value = globalBio.value,
            onValueChange = {
                if (it.length <= 100) globalBio.value = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(8.dp),
            singleLine = false
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Save Changes Button
        Button(
            onClick = { /* Save changes logic here */ },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "save changes", color = Color.White)
        }
    }
}
