package com.example.kotlin_businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlin_businesscard.ui.theme.KotlinBusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinBusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardLayout()
                }
            }
        }
    }
}

@Composable
fun LogoSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(id = R.drawable.ic_task_completed)
        Image(
            painter = image,
            contentDescription = "Logo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(130.dp)
        )
            Text(
                text = "Full Name",
                fontSize = 24.sp,
                color = Color(0xFF3ddc84)
            )
            Text(
                text = "Title",
                fontSize = 16.sp,
                color = Color(0xFF3ddc84)
            )
        }
    }


@Composable
fun ContactInfoSection() {
    Column {
        val image = painterResource(id = R.drawable.ic_task_completed)
        Row {
            Image(
                painter = image,
                contentDescription = "Logo",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(25.dp)
                    .padding(5.dp)
            )
            Text(
                text = "Contact Information",
                fontSize = 20.sp,
                color = Color(0xFF3ddc84)
            )
        }
        Row {
            Image(
                painter = image,
                contentDescription = "Logo",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(25.dp)
                    .padding(5.dp)
            )
            Text(
                text = "Address: Your Address",
                fontSize = 16.sp,
                color = Color(0xFF3ddc84)
            )
        }
        Row {
            Image(
                painter = image,
                contentDescription = "Logo",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(25.dp)
                    .padding(5.dp)
            )
            Text(
                text = "Phone: Your Phone",
                fontSize = 16.sp,
                color = Color(0xFF3ddc84)
            )
        }
        Row {
            Image(
                painter = image,
                contentDescription = "Logo",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(25.dp)
                    .padding(5.dp)
            )
            Text(
                text = "Email: Your Email",
                fontSize = 16.sp,
                color = Color(0xFF3ddc84)
            )
        }
    }
}


@Composable
fun BusinessCardLayout() {
    Box {
        Column(
            modifier = Modifier
                .fillMaxSize()
            .padding(top = 100.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LogoSection()
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 5.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ContactInfoSection()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinBusinessCardTheme {
        BusinessCardLayout()
    }
}