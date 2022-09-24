package com.njagi.ens.feature_presentation.onboarding_view

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import com.njagi.ens.ui.theme.ENSTheme


@Composable
fun PageView(page: Page) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize().padding(5.dp)
    ) {
        Image(
            painter = painterResource(id = page.image), contentDescription = "",
            modifier = Modifier
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
        )
        Row(horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(15.dp)
        ){
            Text(
                text = page.title, fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                color = Color.Green,
                textAlign = TextAlign.Center
            )
        }

         Row(horizontalArrangement = Arrangement.End,
             verticalAlignment = Alignment.CenterVertically,
              modifier = Modifier.padding(15.dp)
             ) {
             Text(text = page.description, fontSize = 20.sp,
                 fontWeight = FontWeight.Normal,
                 modifier = Modifier
                     .fillMaxWidth()
                     .padding(2.dp),
                 maxLines = 2
             )
         }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun FinishButton(modifier: Modifier,pagerState: PagerState, onClick:()-> Unit) {
   Row(modifier = modifier
       .fillMaxSize()
       .padding(20.dp),
       horizontalArrangement = Arrangement.End) {
       AnimatedVisibility(
           visible = pagerState.currentPage == 2,
       modifier = Modifier.fillMaxSize()) {
           Button(onClick =  onClick) {
               Text(text="finish")
           }
       }
   }
}

@Preview(showBackground = true)
@Composable
fun PageviewPreview() {
    ENSTheme() {
        PageView(page = Page.First)
    }
}
@Preview(showBackground = true)
@Composable
fun PageviewPreview2() {
    ENSTheme() {
        PageView(page = Page.Second)
    }
}
@Preview(showBackground = true)
@Composable
fun PageviewPreview3() {
    ENSTheme() {
        PageView(page = Page.Third)
    }
}