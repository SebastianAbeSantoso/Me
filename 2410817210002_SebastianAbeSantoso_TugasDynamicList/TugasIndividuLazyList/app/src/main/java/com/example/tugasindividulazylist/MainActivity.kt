package com.example.tugasindividulazylist

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class ListItem(
    val number: Int,
    val title: String,
    val description: String
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ItemListScreen()
        }
    }
}

@Composable
fun ItemListScreen() {
    val items = listOf(
        ListItem(1, "Item Pertama", "Deskripsi Item Pertama"),
        ListItem(2, "Item Kedua", "Deskripsi Item Kedua"),
        ListItem(3, "Item Ketiga", "Deskripsi Item Ketiga"),
        ListItem(4, "Item Keempat", "Deskripsi Item Keempat"),
        ListItem(5, "Item Kelima", "Deskripsi Item Kelima")
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        itemsIndexed(items) { index, item ->
            ItemCard(
                item = item,
                isGreen = index % 2 == 1
            )
        }
    }
}

@Composable
fun ItemCard(
    item: ListItem,
    isGreen: Boolean
) {
    val context = LocalContext.current
    var switchOn by remember { mutableStateOf(false) }

    val backgroundColor = if (isGreen) {
        Color(0xFFDDF6D2)
    } else {
        Color.Transparent
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp))
            .background(backgroundColor)
            .padding(12.dp)
            .clickable {
                Toast.makeText(
                    context,
                    "Item telah ditekan untuk ${item.number}",
                    Toast.LENGTH_SHORT
                ).show()
            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        ImageBox(number = item.number)
        Spacer(modifier = Modifier.width(12.dp))

        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = item.title,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = item.description,
                fontSize = 12.sp,
                color = Color.DarkGray
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Switch(
                checked = switchOn,
                onCheckedChange = { checked ->
                    switchOn = checked

                    if (checked) {
                        Toast.makeText(
                            context,
                            "Switch hidup pada item ${item.number}",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            )

            Button(
                onClick = {
                    Toast.makeText(
                        context,
                        "Tombol telah ditekan untuk tombol ${item.number}",
                        Toast.LENGTH_SHORT
                    ).show()
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF4F46E5)
                ),
                contentPadding = PaddingValues(horizontal = 14.dp, vertical = 4.dp)
            ) {
                Text(
                    text = "Aksi",
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Composable
fun ImageBox(number: Int) {
    Column(
        modifier = Modifier
            .size(80.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color(0xFFE9E9E9))
            .padding(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = android.R.drawable.ic_menu_report_image),
            contentDescription = "Gambar item $number",
            modifier = Modifier.size(24.dp)
        )

        Text(
            text = "Gambar\n$number",
            fontSize = 11.sp,
            lineHeight = 12.sp
        )
    }
}