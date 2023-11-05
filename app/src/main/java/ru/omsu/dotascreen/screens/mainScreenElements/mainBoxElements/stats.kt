package ru.omsu.dotascreen.screens.mainScreenElements.mainBoxElements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.omsu.dotascreen.R
import ru.omsu.dotascreen.ui.styles.BOLDWEIGHT
import ru.omsu.dotascreen.ui.styles.ULTRABOLD
import ru.omsu.dotascreen.ui.theme.modernist

@Composable
fun stats() {
    Row (Modifier.padding(top = 40.dp)){
        Text(text = "4.9",
            fontFamily = modernist,
            fontSize = 48.sp,
            fontWeight = FontWeight(BOLDWEIGHT),
            color = Color.White,
        )
        Column (Modifier.padding(start = 16.dp)){
            Image(
                painter = painterResource(id = R.drawable.fourandhalf),
                contentDescription = "4.5 звезд",
                modifier = Modifier
                    .padding(top = 14.dp)
                    .width(80.dp)
                    .height(15.dp),
            )
            Text(text = "70M Reviews",
                Modifier.padding(top = 7.dp),
                color = colorResource(R.color.ReviewsColor),
                fontFamily = modernist,
                fontSize = 12.sp,
                fontWeight = FontWeight(ULTRABOLD),
                letterSpacing = 0.5f.sp,
            )

        }
    }
}
