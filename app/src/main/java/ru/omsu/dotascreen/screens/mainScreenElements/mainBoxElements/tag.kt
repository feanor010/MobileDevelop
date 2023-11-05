package ru.omsu.dotascreen.screens.mainScreenElements.mainBoxElements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.omsu.dotascreen.R
import ru.omsu.dotascreen.ui.styles.NORMALWEIGHT
import ru.omsu.dotascreen.ui.theme.montserrat

@Composable
fun tag( tag : String){
    Box(modifier = Modifier
        .padding(end = dimensionResource(id = R.dimen.tagEndPadding))
        .clip(CircleShape)
        .background(colorResource(R.color.tag_color)),
    ){
        Text(text = tag,
            Modifier.padding(10.dp, 5.dp),
            fontFamily = montserrat,
            color = colorResource(R.color.tag_text_color),
            fontSize = 10.sp,
            fontWeight = FontWeight(NORMALWEIGHT),
        )
    }
}
