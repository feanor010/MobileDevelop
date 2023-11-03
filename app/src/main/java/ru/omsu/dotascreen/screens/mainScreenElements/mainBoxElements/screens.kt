package ru.omsu.dotascreen.screens.mainScreenElements.mainBoxElements

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.omsu.dotascreen.R

@Composable
fun screens() {
    Box(
        modifier = Modifier
            .padding(top = 240.dp, start = 10.dp),
    ) {
        Row(
            modifier = Modifier
                .horizontalScroll(ScrollState(0)),
        ) {
            video(R.drawable.left_image)
            screen(R.drawable.right_image)
        }
    }
}
