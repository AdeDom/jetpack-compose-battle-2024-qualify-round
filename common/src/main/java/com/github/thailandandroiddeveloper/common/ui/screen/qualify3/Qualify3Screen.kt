package com.github.thailandandroiddeveloper.common.ui.screen.qualify3

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.component.AppIconComponent
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Qualify3Screen(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit,
    onCopyClick: () -> Unit,
    onCalendarClick: () -> Unit,
    onMenuClick: () -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors =
                    TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                    ),
                title = {
                    Text(
                        text = stringResource(id = R.string.john_doe),
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        style = MaterialTheme.typography.titleLarge,
                    )
                },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        AppIconComponent(res = R.drawable.ic_qualify_3_back)
                    }
                },
                actions = {
                    IconButton(onClick = onCopyClick) {
                        AppIconComponent(res = R.drawable.ic_qualify_3_copy)
                    }
                    IconButton(onClick = onCalendarClick) {
                        AppIconComponent(res = R.drawable.ic_qualify_3_calendar)
                    }
                    IconButton(onClick = onMenuClick) {
                        AppIconComponent(res = R.drawable.ic_qualify_3_menu)
                    }
                },
            )
        },
        modifier = modifier,
    ) { innerPadding ->
        Qualify3Content(
            modifier =
                Modifier
                    .padding(top = 16.dp)
                    .padding(innerPadding),
        )
    }
}

// region Read-only because we use this to process your score.
@Composable
@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
fun Qualify3ScreenPreview() =
    AppTheme {
        Qualify3Screen(
            onBackClick = {},
            onCopyClick = {},
            onCalendarClick = {},
            onMenuClick = {},
        )
    }
// endregion
