package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    CampusCardScreen()
                }
            }
        }
    }
}

@Composable
fun CampusCardScreen() {
    val pinkPrimary = Color(0xFFE0829D)
    val pinkLight = Color(0xFFFCE4EC)
    val greyLight = Color(0xFFF5F5F5)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(pinkLight, RoundedCornerShape(16.dp))
                .padding(20.dp)
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                            .background(pinkPrimary),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("А", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    }
                    Column {
                        Text("Аяра", fontWeight = FontWeight.Bold, fontSize = 16.sp)

                    }
                }

                Divider(color = Color.LightGray.copy(alpha = 0.5f))



                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(greyLight, RoundedCornerShape(8.dp))
                        .padding(12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("09:00", fontSize = 13.sp, fontWeight = FontWeight.Medium)
                    Text("Web-разработка", modifier = Modifier.weight(1f).padding(horizontal = 8.dp), fontSize = 13.sp)
                    Text("Каб. 304", fontSize = 13.sp, color = Color.DarkGray)
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(greyLight, RoundedCornerShape(8.dp))
                        .padding(12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("11:00", fontSize = 13.sp, fontWeight = FontWeight.Medium)
                    Text("Базы данных", modifier = Modifier.weight(1f).padding(horizontal = 8.dp), fontSize = 13.sp)
                    Text("Лаба 2", fontSize = 13.sp, color = Color.DarkGray)
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement =
                        Arrangement.spacedBy(8.dp)
                ) {
                    Button(
                        onClick = {},
                        modifier = Modifier.weight(1f),
                        colors = ButtonDefaults.buttonColors(containerColor = pinkPrimary)
                    ) {
                        Text("Карта")
                    }
                    OutlinedButton(
                        onClick = {},
                        modifier = Modifier.weight(1f)
                    ) {
                        Text("QR-код")
                    }
                }
            }
        }
    }
}