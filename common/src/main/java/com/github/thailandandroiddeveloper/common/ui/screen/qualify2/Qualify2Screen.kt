package com.github.thailandandroiddeveloper.common.ui.screen.qualify2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
fun Qualify2Screen(
    modifier: Modifier = Modifier,
    onSkipClick: () -> Unit,
    onNextClick: () -> Unit,
) {
    Box(modifier = modifier) {
        Qualify2SkipTextButtonComponent(
            onClick = onSkipClick,
            modifier =
                Modifier
                    .align(Alignment.TopEnd)
                    .padding(8.dp),
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 32.dp,
                        top = 64.dp,
                        end = 32.dp,
                    ),
        ) {
            Qualify2TitleTextComponent()
            Spacer(modifier = Modifier.height(16.dp))
            Qualify2DetailTextComponent()
            Spacer(modifier = Modifier.height(32.dp))
            Qualify2ImagePagerComponent()
        }
        Box(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primaryContainer)
                    .padding(horizontal = 80.dp, vertical = 31.dp)
                    .align(Alignment.BottomCenter),
        ) {
            Qualify2ButtonComponent(
                onClick = onNextClick,
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .height(40.dp),
            )
        }
    }
}

// region Read-only because we use this to process your score.
@Composable
@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
fun Qualify2ScreenPreview() =
    AppTheme {
        Qualify2Screen(
            modifier = Modifier.fillMaxSize(),
            onSkipClick = {},
            onNextClick = {},
        )
    }
// endregion
