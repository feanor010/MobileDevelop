package ru.omsu.dotascreen.screens.mainScreenElements.mainBoxElements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.omsu.dotascreen.R
import ru.omsu.dotascreen.ui.styles.EASYWEIGHT
import ru.omsu.dotascreen.ui.theme.modernist

@Composable
fun description() { // Описание игры
    Column(modifier = Modifier.padding(top = 145.dp, start = 21.dp, end = 27.dp),) {
        Text(
            text = stringResource(R.string.Description),
            fontSize = 12.sp,
            color = colorResource(R.color.ReviewsColor),
            fontFamily = modernist,
            lineHeight = 19.sp,
            fontWeight = FontWeight(EASYWEIGHT),
        )

    }
}
