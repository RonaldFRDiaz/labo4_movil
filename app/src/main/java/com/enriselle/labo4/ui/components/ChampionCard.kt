package com.enriselle.labo4.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import coil.compose.rememberAsyncImagePainter
import com.enriselle.labo4.utils.ChampionInformation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChampionCard(champion: ChampionInformation, onClick: (ChampionInformation) -> Unit) {
    Card(onClick = { onClick(champion) }) {
        Row {
            Image(painter = rememberAsyncImagePainter(champion.image.sprite), contentDescription = champion.name)
            Column {
                Text(champion.name)
                Text(champion.title)
                Text(champion.blurb)
            }
        }
}}