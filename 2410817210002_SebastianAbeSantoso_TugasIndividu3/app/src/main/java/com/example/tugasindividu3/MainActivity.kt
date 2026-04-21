package com.example.tugasindividu3

import androidx.compose.foundation.Image
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasindividu3.ui.theme.TugasIndividu3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp (){
    TugasIndividu3Theme {
        val content: @Composable (PaddingValues) -> Unit = { TitleContent(Modifier) }
        TitleScreen(modifier = Modifier.fillMaxSize(), content)
    }
}

@Composable
fun TitleScreen(
    modifier: Modifier = Modifier,
    content: @Composable (PaddingValues) -> Unit){

    Scaffold(
    modifier.fillMaxSize()
    ) { innerPadding ->
        content(innerPadding)
    }
}

@Composable
fun TitleContent(modifier: Modifier){
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(start = 30.dp, end = 30.dp, top = 30.dp),
    ) {
        Row(
            modifier = Modifier
                .weight(0.5f)
                .fillMaxWidth()
                .padding(bottom = 20.dp)){

            Image(
                painter = painterResource(id = R.drawable.solid_blue),
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
                    .weight(1F)
                    .aspectRatio(1f))

            Column(
                modifier = Modifier.fillMaxSize()
                    .weight(2F)) {
                Text(
                    "Title",
                    modifier = Modifier.padding(start = 10.dp, bottom = 10.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 26.sp)

                Text(
                    "Sub-Title",
                    modifier = Modifier.padding(start = 10.dp),
                    fontSize = 15.sp)

                Row(
                    modifier = Modifier.fillMaxSize()
                        .padding(start = 10.dp),
                    verticalAlignment = Alignment.CenterVertically) {

                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = null,
                        tint = Color(0xFFFFC107),
                        modifier = Modifier.size(40.dp)
                    )

                    Text(
                        text = "9.23",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 6.dp)
                    )
                }
            }
        }

        Box(
            modifier
                .weight(2f, fill = false)
                .fillMaxWidth()){
            Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin sodales eget sem ac imperdiet. Vivamus tempor cursus fermentum. Vivamus rhoncus enim commodo nibh aliquam, at finibus ipsum convallis. Vivamus mauris elit, iaculis sed elit nec, gravida fermentum sem. Fusce et volutpat dolor. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Integer tincidunt blandit auctor. Integer commodo, massa at faucibus commodo, quam nisi malesuada erat, sed ornare nisi tellus malesuada velit. Curabitur non lorem venenatis, tempor quam lacinia, eleifend odio.\n")
        }

        Row(
            modifier
                .weight(1f, fill = false)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(15.dp)) {

            val context = LocalContext.current

            Button(
                onClick = { Toast.makeText(context, "Like button Clicked!", Toast.LENGTH_SHORT).show()},
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(6.dp),
                border = BorderStroke(2.dp, Color.Black),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4A5F92),
                )
            ) {Text("Like")}

            Button(
                onClick = { Toast.makeText(context, "Dislike button Clicked!", Toast.LENGTH_SHORT).show()},
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(6.dp),
                border = BorderStroke(2.dp, Color.Black),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD32121))
            ) {Text("Dislike")}

            Button(
                onClick = { Toast.makeText(context, "Share button Clicked!", Toast.LENGTH_SHORT).show()},
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(6.dp),
                border = BorderStroke(2.dp, Color.Black),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF204D14))
            ) {Text("Share")}
        }
    }
}