package ru.omsu.dotascreen.screens.mainScreenElements.mainBoxElements

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import ru.omsu.dotascreen.R

@Composable
fun button() {
    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier.padding(top = 840.dp, start = 34.dp, bottom = 30.dp,)
    ) {
        Image(
            modifier = Modifier
                .size(dimensionResource(id = R.dimen.buttonWidth),
                    dimensionResource(id = R.dimen.buttonHeight), )
                .clickable { Log.d("Filled button", "Filled button clicked.") },
            painter = painterResource(R.drawable.installbutton),
            contentDescription = "Install button"
        )
    }
}

