package com.github.thailandandroiddeveloper.common.ui.screen.qualify1

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.component.AppIconComponent
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Qualify1Screen(
    modifier: Modifier = Modifier,
    onNavigationIconClick: () -> Unit,
    onActionsClick: () -> Unit,
    onThumbDownClick: () -> Unit,
    onThumbUpClick: () -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors =
                    TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                    ),
                title = {},
                navigationIcon = {
                    IconButton(onClick = onNavigationIconClick) {
                        AppIconComponent(res = R.drawable.ic_qualify_1_menu)
                    }
                },
                actions = {
                    IconButton(onClick = onActionsClick) {
                        AppIconComponent(res = R.drawable.ic_qualify_1_profile)
                    }
                },
            )
        },
        modifier = modifier,
    ) { innerPadding ->
        Qualify1Content(
            onThumbDownClick = onThumbDownClick,
            onThumbUpClick = onThumbUpClick,
            modifier =
                Modifier
                    .fillMaxSize()
                    .padding(
                        start = 16.dp,
                        top = 16.dp,
                        end = 16.dp,
                        bottom = 72.dp,
                    )
                    .padding(innerPadding),
        )
    }
}

// region Read-only because we use this to process your score.
@Composable
@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
fun Qualify1ScreenPreview() =
    AppTheme {
        Qualify1Screen(
            onNavigationIconClick = {},
            onActionsClick = {},
            onThumbDownClick = {},
            onThumbUpClick = {},
        )
    }
// endregion
