package ru.omsu.dotascreen.screens.mainScreenElements
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import ru.omsu.dotascreen.R
import ru.omsu.dotascreen.screens.mainScreenElements.mainBoxElements.description
import ru.omsu.dotascreen.screens.mainScreenElements.mainBoxElements.gameInfo
import ru.omsu.dotascreen.screens.mainScreenElements.mainBoxElements.gameTags
import ru.omsu.dotascreen.screens.mainScreenElements.mainBoxElements.installButton
import ru.omsu.dotascreen.screens.mainScreenElements.mainBoxElements.review
import ru.omsu.dotascreen.screens.mainScreenElements.mainBoxElements.screens

@Composable
fun mainBox() {
    Box(
        modifier = Modifier
            .padding(top = 320.dp)
            .clip(shape = RoundedCornerShape(25.dp, 25.dp, 0.dp, 0.dp))
            .background(colorResource(R.color.MainBoxColor)),



    ) {
        gameInfo()
        gameTags()
        description()
        screens()
        review()
        installButton()
    }
}
