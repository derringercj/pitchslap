package com.example.pitchslap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pitchslap.ui.theme.PitchSlapTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PitchSlapTheme {
                MainMenu()
            }
        }
    }
}


@Composable
fun MainMenu(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = stringResource(R.string.app_name),
            fontSize = 87.sp,
            modifier = Modifier.background(Color.LightGray)
        )
        Text(
            text = stringResource(R.string.todays_key),
            fontSize = 50.sp
        )
        Text(
            text = stringResource(R.string.c_major),
            fontSize = 35.sp
        )
        Image(
            painter = painterResource(R.drawable.cmajkey),
            contentDescription = stringResource(R.string.ckey_desc),
            modifier = Modifier.size(150.dp, 150.dp)
        )
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.height(100.dp).width(225.dp)
        ){
            Text(
                stringResource(R.string.menu_button_text),
                fontSize = 50.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuPreview() {
    PitchSlapTheme {
        MainMenu()
    }
}