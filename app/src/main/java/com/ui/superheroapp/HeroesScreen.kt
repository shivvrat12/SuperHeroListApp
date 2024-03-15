package com.ui.superheroapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ui.superheroapp.model.Hero

@Composable
fun listItem(heroes: List<Hero>, modifier: Modifier = Modifier,
             contentPadding: PaddingValues = PaddingValues(0.dp),){
    LazyColumn {
        items(heroes) {  heroes ->
            listComposable(hero = heroes)
        }

    }
}
@Composable
fun listComposable(hero: Hero){
    Card(modifier = Modifier.padding(16.dp)) {
        Row (
            Modifier
                .padding(16.dp)
                .height(72.dp)){
            Column(Modifier.weight(3f)) {
                Text(text = stringResource(id = hero.nameRes),
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = stringResource(id = hero.descriptionRes),
                    fontSize = 15.sp)
            }
            Spacer(modifier = Modifier.height(2.dp))
            Image(painter = painterResource(id = hero.imageRes),
                contentDescription = stringResource(
                id = hero.descriptionRes
            ),Modifier.weight(1f))
        }
    }
}
