package com.example.firstcompose.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.firstcompose.ui.theme.PrimaryTextColor
import com.example.firstcompose.ui.theme.SecondaryTextColor
import com.example.firstcompose.ui.theme.rubik


@Composable
fun Header(title:String,subTitle:String){
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = title,
            color = PrimaryTextColor,
            fontFamily = rubik,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium
        )
        Text(
            text = subTitle,
            color = SecondaryTextColor,
            fontFamily = rubik,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal
        )
    }
}