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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.omsu.dotascreen.R
import ru.omsu.dotascreen.ui.styles.BOLDWEIGHT
import ru.omsu.dotascreen.ui.styles.EASYWEIGHT
import ru.omsu.dotascreen.ui.theme.modernist

@Composable
fun gameInfo(){
    Column  (modifier = Modifier.padding(start = 125.dp, top = 14.dp),){
        Text(
            // Надпись Dota
            color = Color.White,
            text = stringResource(R.string.gameName),
            fontFamily = modernist,
            fontSize = 20.sp,
            fontWeight = FontWeight(BOLDWEIGHT),
            lineHeight = 26.sp,
            letterSpacing = 0.5f.sp,
            modifier = Modifier.padding(start = 2.dp),
        )

        Row {
            Image(
                painter = painterResource(id = R.drawable.fivestart),
                contentDescription = "5 звезд",
                modifier = Modifier
                    .padding(top = 7.dp)
                    .width(70.dp)
                    .height(10.dp)
            )
            Text(text = "70M",
                fontWeight = FontWeight(EASYWEIGHT),
                letterSpacing = 0.5f.sp,
                fontFamily = modernist,
                fontSize = 11.sp,
                color = colorResource(R.color.grayColor),
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
            )
        }
    }
}


