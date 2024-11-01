package screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.fastForEach
import androidx.navigation.NavController
import data.HomeCardData
import me.sample.library.resources.Logos
import me.sample.library.resources.Res
import me.sample.library.resources.app_name
import me.sample.library.resources.img
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import util.HomeScreenCard


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,

    ) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(text = stringResource(Res.string.app_name),
                            fontFamily = FontFamily.Cursive,
                            fontSize = 28.sp,
                            color = Color.White
                        )
                    }
                },
                navigationIcon = {
                    Image(painterResource(Res.drawable.Logos),
                    null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.padding(2.dp)
                        .size(60.dp)
                )},
                backgroundColor = MaterialTheme.colorScheme.primary
//                colors = TopAppBarDefaults.mediumTopAppBarColors(
//                    containerColor = MaterialTheme.colorScheme.primary,
//                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
//                )
            )
        },

        content = {
            val dataList = listOf(
                HomeCardData(
                    text = "A",
                    onClick = {}
                ),
                HomeCardData(
                    text = "B",
                    onClick = {}
                ),
                HomeCardData(
                    text = "C",
                    onClick = {}
                ),
                HomeCardData(
                    text = "D",
                    onClick = {}
                ),
                HomeCardData(
                    text = "E",
                    onClick = {}
                ),
                HomeCardData(
                    text = "F",
                    onClick = {}
                ),
                HomeCardData(
                    text = "G",
                    onClick = {}
                )
            )
            Surface(modifier = Modifier.fillMaxSize()) {
                Spacer(Modifier.height(50.dp))
            Box(modifier = Modifier.fillMaxSize()) {

                Image(
                    painterResource(Res.drawable.img),
                    null,
                    alpha = 0.40f,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxSize()
                )




            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxHeight()
                    .padding(it)
//                    .verticalScroll(rememberScrollState())
//                    .verticalScroll(rememberScrollState())
                    .background(Color.Transparent),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .padding(12.dp)
                        .horizontalScroll(rememberScrollState())

                ) {
                    dataList.fastForEach {
                        HomeScreenCard(it.text,it.onClick)
                    }
                }
                Row(
                    modifier = Modifier
                        .padding(12.dp)
                        .horizontalScroll(rememberScrollState())

                ) {
                    dataList.fastForEach {
                        HomeScreenCard(it.text,it.onClick)
                    }
                }
            }
            }

            }
        },
        containerColor = MaterialTheme.colorScheme.primaryContainer
    )
}