package ru.omsu.dotascreen.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import ru.omsu.dotascreen.screens.mainScreenElements.dotaIcon
import ru.omsu.dotascreen.screens.mainScreenElements.mainBox
import ru.omsu.dotascreen.R


@Composable
fun mainScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(ScrollState(0)),
    ) {
        Image(           // Заглавное изображение
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(R.drawable.topimage),
            contentDescription = "Main image",
            contentScale = ContentScale.Crop,
        )

        mainBox()
        dotaIcon()
    }

}
