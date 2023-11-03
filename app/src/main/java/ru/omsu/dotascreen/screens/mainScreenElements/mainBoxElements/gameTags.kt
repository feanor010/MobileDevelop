package ru.omsu.dotascreen.screens.mainScreenElements.mainBoxElements
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import ru.omsu.dotascreen.R

@Composable
fun gameTags(){
    Row(modifier = Modifier.padding(start = 30.dp, top = 90.dp),){
        tag(stringResource(R.string.tagMOBA))
        tag(stringResource(R.string.tagMULTIPLAYER))
        tag(stringResource(R.string.tagSTRATEGY))

    }
}
