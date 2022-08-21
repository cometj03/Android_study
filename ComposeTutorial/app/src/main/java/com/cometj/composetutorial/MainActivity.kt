package com.cometj.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cometj.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

data class Message(
    val author: String,
    val body: String
)

@Composable
fun MessageCard(msg: Message) {
    Row {
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "content disc",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )
        
        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(text = msg.author)

            Spacer(modifier = Modifier.height(8.dp))
            
            Text(text = msg.body)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MessageCard(
        msg = Message("Author test", "Body test")
    )
}