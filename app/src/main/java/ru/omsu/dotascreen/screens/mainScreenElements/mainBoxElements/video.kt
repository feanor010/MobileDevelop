package ru.omsu.dotascreen.screens.mainScreenElements.mainBoxElements

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import ru.omsu.dotascreen.R

@Composable
fun video (@DrawableRes icon: Int) {
    Box(){
        Image(
            painter = painterResource(icon),
            contentDescription = "Gameplay video",
            modifier = Modifier
                .padding(start = 10.dp, end = 15.dp)
                .size(
                    dimensionResource(id = R.dimen.screenshotWidth),
                    dimensionResource(id = R.dimen.screenshotHeight)
                ),
        )
        Box(
            modifier = Modifier
                .size(dimensionResource(id = R.dimen.playButtonCircle))
                .offset(107.dp, 35.dp)
                .clip(CircleShape)
                .background(colorResource(R.color.PlayerButtonColor)),
        )
        Image(
            painter = painterResource(id = R.drawable.play),
            contentDescription = null,
            Modifier
                .size(dimensionResource(id = R.dimen.playButtonIcon))
                .offset(119.dp, 47.dp),
        )
    }

}
