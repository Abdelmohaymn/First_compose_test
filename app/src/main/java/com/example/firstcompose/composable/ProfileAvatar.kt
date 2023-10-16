package com.example.firstcompose.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.firstcompose.R

@Composable
fun ProfileAvatar(
    painter:Painter,
    size:Int=128,
    modifier: Modifier = Modifier
){
    Image(
        painter = painter,
        contentDescription = "profile picture",
        modifier = modifier
            .clip(RoundedCornerShape(16.dp))
            .size(size.dp),
        contentScale = ContentScale.Crop
    )
}