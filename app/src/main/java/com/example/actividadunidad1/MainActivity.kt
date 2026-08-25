package com.example.actividadunidad1

import androidx.compose.foundation.Image
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.actividadunidad1.ui.theme.ActividadUnidad1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ActividadUnidad1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(Modifier
                        .fillMaxSize()
                        .background(Color(0xFFE3F2FD))
                    ) {
                       /* Image(
                            painter= painterResource(R.drawable.fondo),
                            contentDescription="imagen de fondo"  ,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                            )
                        */
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.TopCenter)
                                .padding(top = 150.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        )
                        {
                            Image(
                                painter = painterResource(R.drawable.logo),
                                contentDescription = "imagen Udc",
                                modifier = Modifier
                                    .width(300.dp),
                                contentScale = ContentScale.Crop
                                )
                        }


                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "¡Hola Mundo!",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF1565C0),
                                modifier = Modifier
                                    .background(Color(0xFFBBDEFB), shape = RoundedCornerShape(50))
                                    .padding(horizontal = 14.dp, vertical = 4.dp)
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Soy Antonio Díaz",
                                color = Color.White,
                                fontSize = 20.sp ,
                                modifier = Modifier
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(Color(0xFF1E88E5))
                                    .padding(8.dp)

                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Estudiante de Ingeniería de Software",
                                color = Color.DarkGray
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(
                                text = "Bienvenidos al curso de desarrollo de apps 2026/2",
                                /* color = Color.White,
                                fontSize = 20.sp ,
                                modifier = Modifier
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(Color.LightGray)
                                    .padding(8.dp)
                                   */
                                fontSize = 14.sp,
                                color = Color(0xFF1976D2),
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(Color.White.copy(alpha = 0.7f))
                                    .padding(horizontal = 16.dp, vertical = 10.dp)
                            )
                            Spacer(modifier = Modifier.height(16.dp))

                        }
                        Row(
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .padding(bottom = 32.dp),
                            horizontalArrangement = Arrangement.spacedBy(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            //logo de git hub
                           Row(
                               verticalAlignment = Alignment.CenterVertically,
                               horizontalArrangement = Arrangement.spacedBy(6.dp),
                               modifier = Modifier
                                   .clip(RoundedCornerShape(10.dp))
                                   .background(Color.White))
                                   {
                                       Image(
                                           painter = painterResource(R.drawable.github),
                                           contentDescription = "logo de git hub",
                                           modifier = Modifier
                                               .height(30.dp),
                                       )
                                       Text(
                                           text = "/AntonioDiazM",
                                           fontSize = 12.sp,
                                           fontWeight = FontWeight.Medium,
                                           color = Color(0xFF333333)
                                       )
                                   }
                            //logo de instagram
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(6.dp),
                                modifier = Modifier
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(Color.White))
                                     {
                                         Image(
                                            painter = painterResource(R.drawable.instagram),
                                             contentDescription = "logo de instagram",
                                             modifier = Modifier
                                                 .height(30.dp),

                                            )
                                         Text(
                                             text = "@_antonio_dz",
                                             fontSize = 12.sp,
                                             fontWeight = FontWeight.Medium,
                                             color = Color(0xFF333333)
                                         )
                                     }

                        }
                    }
                }
            }
        }
    }
}