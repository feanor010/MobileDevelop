package ru.omsu.dotascreen.screens.mainScreenElements

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
fun dotaIcon() {
    Image(
        painter = painterResource(R.drawable.icon),
        contentDescription = "Dota icon",
        modifier = Modifier
            .padding(top = 290.dp, start = 10.dp)
            .size(dimensionResource(id = R.dimen.iconSize)),
    )
}
