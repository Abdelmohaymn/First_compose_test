package com.example.firstcompose.composable

import androidx.compose.foundation.clickable
import androidx.compose.material.Colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.firstcompose.ui.theme.Orange
import com.example.firstcompose.ui.theme.rubik


@Composable
fun TextButton(text:String,onClick:()->Unit){
    Text(
        text = text,
        color = Orange,
        fontFamily = rubik,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        modifier = Modifier.clickable { onClick }
    )
}