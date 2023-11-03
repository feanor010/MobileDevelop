package ru.omsu.dotascreen.screens.mainScreenElements.mainBoxElements

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.omsu.dotascreen.R
import ru.omsu.dotascreen.ui.styles.BOLDWEIGHT


@Composable
fun review() {
    Box(
        modifier = Modifier
            .padding(top = 400.dp, start = 15.dp),
    ) {
        Text(       // Текст Review & Ratings
            text = stringResource(R.string.ReviewText),
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight(BOLDWEIGHT)
        )
        stats()
        Column(modifier = Modifier.padding(top = 100.dp),) {// Отзывы
            card(R.drawable.gaben,
                R.string.First_comment,
                "Gabe Newell",
                "September 24, 2023")
            Box(modifier = Modifier.padding(start = 38.dp, end = 37.dp)){
                Divider(color = colorResource(R.color.thinLineColor), thickness = 1.dp)
            }
            card(R.drawable.lich,
                R.string.Second_comment,
                "Lich King",
                "October 4, 2023" )
        }
    }

}
