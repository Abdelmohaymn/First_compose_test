package com.example.firstcompose.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcompose.ui.theme.CardBackGroundColor
import com.example.firstcompose.ui.theme.PrimaryTextColor
import com.example.firstcompose.ui.theme.SecondaryTextColor
import com.example.firstcompose.ui.theme.rubik

@Composable
fun InformationCard(title:String, information:String,onChange:(String)->Unit){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top=8.dp, bottom = 8.dp),
        backgroundColor = CardBackGroundColor,
        shape = RoundedCornerShape(16.dp),
        elevation = 0.dp
    ) {
        Column (
            modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp)
        ){
            Text(
                text = title,
                color = SecondaryTextColor,
                fontFamily = rubik,
                fontSize = 9.sp,
                fontWeight = FontWeight.Normal
            )
            BasicTextField(
                value = information,
                onValueChange = onChange,
                /*color = PrimaryTextColor,
                fontFamily = rubik,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal*/
            )
        }
    }
}