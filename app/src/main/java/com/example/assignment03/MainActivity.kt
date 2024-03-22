package com.example.assignment03

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment03.data.Thai
import com.example.assignment03.data.thais
import com.example.assignment03.ui.theme.Assignment03Theme
import com.example.assignment03.ui.theme.Poppins
import java.nio.channels.AcceptPendingException
import kotlin.math.exp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment03Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Assignment03("Android")
                }
            }
        }
    }
}

@Composable
fun texDesc(
    thai: Thai ,
    num: Int,
    expanded: Boolean )
{
//    var expanded by remember { mutableStateOf(true) }
    if (expanded) {
        Row (
        ){
            Text(
                text = stringResource(id = thai.desc),
                modifier = Modifier
                    .padding(start = 26.dp, top = 6.dp)

            )
        }

    }
}

@Composable
fun Assignment03(name: String, modifier: Modifier = Modifier) {
    Column(

    ) {
        var expanded by remember { mutableStateOf(false) }
        var texNum by remember { mutableStateOf(0) }

        var selectedIndex by remember { mutableStateOf(0) }
        val onItemClick = { index: Int -> selectedIndex = index }

        Text(
            text = "30 Days of Thailand place",
            fontFamily = Poppins,
            fontSize = 24.sp,
            modifier = modifier
                .padding( top = 10.dp , start =  10.dp)
//                .clickable {  expanded = ! expanded }
        )
        LazyColumn{
            items( thais){
                 Card(
                    modifier = Modifier
                        .padding(start = 12.dp, end = 12.dp, bottom = 10.dp)
                        .clickable { expanded = !expanded  }
                        .animateContentSize(
                            spring(
                                dampingRatio = Spring.DampingRatioNoBouncy,
                                stiffness = Spring.StiffnessVeryLow
                            )
                        )
                ){
//                    texNum = it.desc
                    Text(text = "Day"+ " " + it.num , Modifier.padding( start = 26.dp , top = 6.dp))
                    Text(
                        text = stringResource(id = it.subj ), Modifier.padding( start = 26.dp , top = 6.dp))
                    Row (
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(160.dp)
                    ){
                        Image(
                            contentScale = ContentScale.FillWidth,
                            painter = painterResource(id = it.imageResourceId)  ,
                            contentDescription = null,
                        )
                    }
                     texDesc(
                         it,
                         texNum,
                         expanded
                     )
//                     if (expanded)
//                     Text(
//                         text = stringResource(id = it.desc), Modifier.padding( start = 26.dp , top = 6.dp)
//
//                     )

                }
            }
        }
    }

}
