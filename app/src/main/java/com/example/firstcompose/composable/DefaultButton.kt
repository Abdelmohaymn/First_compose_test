package com.example.firstcompose.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcompose.ui.theme.Green
import com.example.firstcompose.ui.theme.rubik

@Composable
fun DefaultButton(text:String,onClick:()->Unit,modifier: Modifier=Modifier){
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(54.dp),
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Green),
        elevation = ButtonDefaults.elevation(0.dp)
    ){
        Text(
            text = text,
            color = Color.White,
            fontFamily = rubik,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium
        )
    }
}