package ru.omsu.dotascreen.screens.mainScreenElements.mainBoxElements

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import ru.omsu.dotascreen.R

@Composable
fun screen (@DrawableRes icon: Int) {
    Image(
        painter = painterResource(icon),
        contentDescription = "Gameplay Screen",
        modifier = Modifier
            .padding(start = 10.dp, end = 15.dp)
            .size(dimensionResource(id = R.dimen.screenshotWidth),
                dimensionResource(id = R.dimen.screenshotHeight)),
    )
}
