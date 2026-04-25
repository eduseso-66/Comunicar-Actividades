package com.equipo1.a2actividades

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.equipo1.a2actividades.ui.theme.AppTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                ActivityTwoScreen(
                    onBackToActivityOne = { finish() }
                )
            }
        }
    }
}

@Composable
fun ActivityTwoScreen(
    onBackToActivityOne: () -> Unit,
    modifier: Modifier = Modifier
) {
    var visible by remember { mutableStateOf(false) }
    val alpha by animateFloatAsState(
        targetValue = if (visible) 1f else 0f,
        animationSpec = tween(durationMillis = 600),
        label = "fade"
    )

    LaunchedEffect(Unit) { visible = true }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF1A0533),
                        Color(0xFF2D1B69),
                        Color(0xFF11998E)
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .alpha(alpha)
                .padding(horizontal = 32.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Badge de actividad
            Surface(
                shape = RoundedCornerShape(50),
                color = Color(0xFF80CBC4).copy(alpha = 0.15f),
                modifier = Modifier.padding(bottom = 24.dp)
            ) {
                Text(
                    text = "ACTIVIDAD 2",
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp),
                    color = Color(0xFF80CBC4),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    letterSpacing = 2.sp
                )
            }

            // Ícono decorativo
            Text(
                text = "",
                fontSize = 52.sp,
                modifier = Modifier.padding(bottom = 20.dp)
            )

            // Mensaje principal
            Text(
                text = stringResource(R.string.activity_two_message),
                color = Color.White,
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                lineHeight = 44.sp,
                modifier = Modifier.padding(bottom = 12.dp)
            )

            // Subtítulo
            Text(
                text = stringResource(R.string.activity_two_subtitle),
                color = Color.White.copy(alpha = 0.6f),
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                lineHeight = 22.sp,
                modifier = Modifier.padding(bottom = 48.dp)
            )

            // Tarjeta informativa
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 40.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White.copy(alpha = 0.07f)
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "✅",
                        fontSize = 28.sp,
                        modifier = Modifier.padding(end = 16.dp)
                    )
                    Text(
                        text = stringResource(R.string.activity_two_card_text),
                        color = Color.White.copy(alpha = 0.8f),
                        fontSize = 14.sp,
                        lineHeight = 22.sp,
                        modifier = Modifier.weight(1f)
                    )
                }
            }

            // Botón de regreso con ícono
            OutlinedButton(
                onClick = onBackToActivityOne,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color(0xFF80CBC4)
                ),
                border = androidx.compose.foundation.BorderStroke(
                    1.5.dp,
                    Color(0xFF80CBC4).copy(alpha = 0.6f)
                )
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = null,
                    modifier = Modifier.padding(end = 8.dp),
                    tint = Color(0xFF80CBC4)
                )
                Text(
                    text = stringResource(R.string.back_to_activity_one),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    letterSpacing = 0.5.sp
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ActivityTwoPreview() {
    AppTheme {
        ActivityTwoScreen(onBackToActivityOne = {})
    }
}
