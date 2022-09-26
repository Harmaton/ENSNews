package com.njagi.ens.feature_presentation.common_components

import androidx.compose.foundation.layout.*
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.njagi.ens.ui.theme.ENSTheme

@Composable
fun TopAppSection(
              // TODO -> IMPLEMENT CHANGE OF SIZE WITH SCROLL
              ) {
    TopAppBar(
        backgroundColor = Color.Black,
        contentColor = Color.White,
        elevation = 10.dp,
        contentPadding = PaddingValues(10.dp)
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
            , verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "ENS NEWS!", color = Color.White,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Italic
            )

            Icon(imageVector = Icons.Default.Search,
                contentDescription = "Search news",
                modifier = Modifier.padding(end = 20.dp)
            )

        }
    }

}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview(){
    ENSTheme {
        TopAppSection()
    }
}