package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.TextButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.modernist
import com.example.myapplication.ui.theme.montserrat


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()

        }
    }
}

@Composable
fun MainScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(ScrollState(0))
    ) {
        Image(           // Заглавное изображение
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(R.drawable.topimage),
            contentDescription = "Main image",
            contentScale = ContentScale.Crop,
        )

        MainBox()
        DotaIcon()
    }

}

@Composable
fun DotaIcon() {
    Image(
        painter = painterResource(R.drawable.icon),
        contentDescription = "Dota icon",
        modifier = Modifier
            .padding(top = 290.dp, start = 10.dp)
            .size(130.dp)
    )
}

@Composable
fun MainBox() {
    Box(
        modifier = Modifier
            .padding(top = 320.dp)
            .clip(shape = RoundedCornerShape(25.dp, 25.dp, 0.dp, 0.dp))
            .background(Color(0xFF050B18))


    ) {
        GameInfo()
        GameTags()
        Description()
        Screens()
        Review()
        InstallButton()
    }
}

@Composable
fun GameTags(){
    Row(modifier = Modifier.padding(start = 30.dp, top = 90.dp)){
        Tag("MOBA")
        Tag ("MULTIPLAYER")
        Tag (" STRATEGY")

    }
}

@Composable
fun Tag( tag : String){
    Box(modifier = Modifier
        .padding(end = 10.dp)
        .clip(CircleShape)
        .background(Color(0x4444A9F4))
    ){
        Text(text = tag,
            Modifier.padding(10.dp, 5.dp),
            fontFamily = montserrat,
            color = Color(0xFF44A9F4),
            fontSize = 10.sp,
            fontWeight = FontWeight(500),


            )
    }
}

@Composable
fun GameInfo(){
    Column  (modifier = Modifier.padding(start = 125.dp, top = 14.dp)){
        Text( // Надпись Dota
            color = Color.White,
            text = "DoTa 2",
            fontFamily = modernist,
            fontSize = 20.sp,
            fontWeight = FontWeight(700),
            lineHeight = 26.sp,
            letterSpacing = 0.5f.sp,
            modifier = Modifier.padding(start = 2.dp)
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
                fontWeight = FontWeight(400),
                letterSpacing = 0.5f.sp,
                fontFamily = modernist,
                fontSize = 11.sp,
                color = Color(0xFF45454D),
                modifier = Modifier.padding(start = 10.dp, top = 4.dp)
                )
        }
    }
}

@Composable
fun Review() {
    Box(
        modifier = Modifier
            .padding(top = 400.dp, start = 15.dp)
    ) {
        Text(       // Текст Review & Ratings
            text = "Review & Ratings",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight(700)
        )
        Stats()
        Column(modifier = Modifier.padding(top = 100.dp)) {// Отзывы
            Card(R.drawable.gaben, R.string.First_comment, "Gabe Newell", "September 24, 2023")
            Box(modifier = Modifier.padding(start = 38.dp, end = 37.dp)){
                Divider(color = Color(0xFF1A1F29), thickness = 1.dp)
            }
            Card(R.drawable.lich, R.string.Second_comment, "Lich King", "October 4, 2023" )
        }
    }

}

@Composable
fun Stats() {
    Row (Modifier.padding(top = 40.dp)){
        Text(text = "4.9",
            fontFamily = modernist,
            fontSize = 48.sp,
            fontWeight = FontWeight(700),
            color = Color.White

            )
        Column (Modifier.padding(start = 16.dp)){
            Image(
                painter = painterResource(id = R.drawable.fourandhalf),
                contentDescription = "4.5 звезд",
                modifier = Modifier
                    .padding(top = 14.dp)
                    .width(80.dp)
                    .height(15.dp)
            )
            Text(text = "70M Reviews",
                Modifier.padding(top = 7.dp),
                color = Color(0xFFA8ADB7),
                fontFamily = modernist,
                fontSize = 12.sp,
                fontWeight = FontWeight(800),
                letterSpacing = 0.5f.sp
            )

        }
    }
}

@Composable
fun Card(@DrawableRes icon: Int, @StringRes comment: Int, name: String, date: String) {
    Column  (modifier = Modifier.padding(top = 24.dp, bottom = 24.dp)){
        Row() {
            Image( // Аватарка обзорщика
                painter = painterResource(icon),
                contentDescription = "Ava",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
            )
            Column() {
                Text(   // Имя
                    fontFamily = modernist,
                    text = name,
                    modifier = Modifier.padding(start = 20.dp),
                    color = Color.White,
                    fontSize = 16.sp,
                    letterSpacing = 0.5f.sp,
                    fontWeight = FontWeight(400)
                )
                Text(  // Дата написания
                    letterSpacing = 0.5f.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = modernist,
                    text = date,
                    color = Color.Gray,
                    modifier = Modifier.padding(start = 20.dp, top = 5.dp),
                    fontSize = 12.sp
                )
            }

        }
        Text(text = stringResource(comment), // Сам коммент
            color = Color(0xFFA8ADB7),
            fontSize = 12.sp,
            letterSpacing = 0.5f.sp,
            modifier = Modifier.padding(top = 10.dp, end = 24.dp),
            fontFamily = modernist,
            lineHeight = 19.sp,
            fontWeight = FontWeight(400)
            )

    }

}

@Composable
fun InstallButton() {
    Button(onClick = { Log.d("Filled button", "Text button clicked.") })
}

@Composable
fun Description() { // Описание игры
    Column(modifier = Modifier.padding(top = 145.dp, start = 21.dp, end = 27.dp)) {
        Text(text = stringResource(R.string.Description),
            fontSize = 12.sp,
            color = Color(0xFFA8ADB7),
            fontFamily = modernist,
            lineHeight = 19.sp,
            fontWeight = FontWeight(400),
        )

    }
}

@Composable
fun Screens() {
    Box(
        modifier = Modifier
            .padding(top = 240.dp, start = 10.dp)
    ) {
        Row(
            modifier = Modifier
                .horizontalScroll(ScrollState(0))
        ) {
            Video(R.drawable.left_image)
            Screen(R.drawable.right_image)
        }
    }
}

@Composable
fun Video (@DrawableRes icon: Int) {
    Box(){
        Image(
            painter = painterResource(icon),
            contentDescription = "Gameplay video",
            modifier = Modifier
                .padding(start = 10.dp, end = 15.dp)
                .size(240.dp, 128.dp)
        )
        Box(modifier = Modifier
            .size(48.dp)
            .offset(107.dp, 35.dp)
            .clip(CircleShape)
            .background(Color(0x44FFFFFF))
        )
        Image(
            painter = painterResource(id = R.drawable.play),
            contentDescription = null,
            Modifier
                .size(24.dp)
                .offset(119.dp, 47.dp)
        )
    }

}
@Composable
fun Screen (@DrawableRes icon: Int) {
    Image(
        painter = painterResource(icon),
        contentDescription = "Gameplay Screen",
        modifier = Modifier
            .padding(start = 10.dp, end = 15.dp)
            .size(240.dp, 128.dp)
    )
}

@Composable
fun Button(onClick: () -> Unit) {
    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier.padding(top = 840.dp, start = 40.dp, bottom = 30.dp)
    ) {
        Image(
            modifier = Modifier
                .size(300.dp, 70.dp)
                .clickable { Log.d("Filled button", "Filled button clicked.") },
            painter = painterResource(R.drawable.installbutton),
            contentDescription = "Install button"
        )
    }
}

@Preview
@Composable
fun PreviewMessageCard() {
    MainScreen()
}



