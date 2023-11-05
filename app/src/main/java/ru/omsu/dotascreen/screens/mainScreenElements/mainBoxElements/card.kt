package ru.omsu.dotascreen.screens.mainScreenElements.mainBoxElements

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import ru.omsu.dotascreen.R
import ru.omsu.dotascreen.ui.styles.EASYWEIGHT
import ru.omsu.dotascreen.ui.theme.modernist

@Composable
fun card(@DrawableRes icon: Int,
         @StringRes comment: Int,
         name: String,
         date: String) {
    Column  (modifier = Modifier.padding(top = 24.dp, bottom = 24.dp),){
        Row() {
            Image( // Аватарка обзорщика
                painter = painterResource(icon),
                contentDescription = "Ava",
                modifier = Modifier
                    .size(dimensionResource(id = R.dimen.reviewerAva))
                    .clip(CircleShape),
            )
            Column() {
                Text(   // Имя
                    fontFamily = modernist,
                    text = name,
                    modifier = Modifier.padding(start = 20.dp),
                    color = Color.White,
                    fontSize = 16.sp,
                    letterSpacing = 0.5f.sp,
                    fontWeight = FontWeight(EASYWEIGHT),
                )
                Text(  // Дата написания
                    letterSpacing = 0.5f.sp,
                    fontWeight = FontWeight(EASYWEIGHT),
                    fontFamily = modernist,
                    text = date,
                    color = Color.Gray,
                    modifier = Modifier.padding(start = 20.dp, top = 5.dp),
                    fontSize = 12.sp,
                )
            }

        }
        Text(text = stringResource(comment), // Сам коммент
            color = colorResource(R.color.ReviewsColor),
            fontSize = 12.sp,
            letterSpacing = 0.5f.sp,
            modifier = Modifier.padding(top = 10.dp, end = 24.dp),
            fontFamily = modernist,
            lineHeight = 19.sp,
            fontWeight = FontWeight(EASYWEIGHT),
        )

    }

}
