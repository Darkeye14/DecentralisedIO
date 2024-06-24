package screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import data.HomeCardData
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
            CenterAlignedTopAppBar(
                title = {
                    Text(text = stringResource(Res.string.app_name))
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
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

                LazyVerticalGrid(
                    columns = GridCells.Adaptive(minSize = 250.dp),
                    modifier = Modifier.padding(13.dp)
                ) {

                    items(dataList) { data ->

                        HomeScreenCard(
                            text = data.text,
                            onClick = data.onClick
                        )
                    }

                }



//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .fillMaxHeight()
//                    .padding(it)
//                    .verticalScroll(rememberScrollState())
//                    .background(Color.Transparent),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Row(
//                    modifier = Modifier.padding(8.dp),
//                    horizontalArrangement = Arrangement.SpaceBetween
//                ) {
//                    HomeScreenCard(Modifier.weight(1f), text = "Your Profiles") {
//
//                        //       navigateTo(navController, DestinationScreen.MyProfilesScreen.route)
//                    }
//                    HomeScreenCard(Modifier.weight(1f), text = "Saved Profiles") {
//
//                        //      navigateTo(navController, DestinationScreen.SavedScreen.route)
//                    }
//                    HomeScreenCard(Modifier.weight(1f), text = "Saved Profiles") {
//
//                        //      navigateTo(navController, DestinationScreen.SavedScreen.route)
//                    }
//                }
//            }
            }

            }
        },
        containerColor = MaterialTheme.colorScheme.primaryContainer
    )
}