package com.enriselle.labo4.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import com.enriselle.labo4.utils.ChampionInformation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChampionCard(champion: ChampionInformation, onClick: (ChampionInformation) -> Unit) {
    Card(onClick = { onClick(champion) }) {
        Row {
            Image(
                painter = rememberAsyncImagePainter(champion.image.sprite),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Column {
                Text(champion.name)
                Text(champion.title)
            }
        }
}}