package com.github.thailandandroiddeveloper.common.ui.screen.qualify2

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.component.AppImageComponent
import com.github.thailandandroiddeveloper.common.ui.component.ButtonTextComponent
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
fun Qualify2SkipTextButtonComponent(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    TextButton(
        onClick = onClick,
        modifier = modifier,
    ) {
        Text(
            text = stringResource(R.string.skip),
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.labelLarge,
            textAlign = TextAlign.Center,
        )
    }
}

@Composable
fun Qualify2TitleTextComponent(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.lorem_title),
        color = MaterialTheme.colorScheme.onSurface,
        style = MaterialTheme.typography.headlineSmall,
        textAlign = TextAlign.Center,
        modifier = modifier,
    )
}

@Composable
fun Qualify2DetailTextComponent(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.lorem_detail),
        color = MaterialTheme.colorScheme.onSurface,
        style = MaterialTheme.typography.bodyMedium,
        textAlign = TextAlign.Center,
        modifier = modifier,
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Qualify2ImagePagerComponent(modifier: Modifier = Modifier) {
    val list =
        listOf(
            R.drawable.img_qualify_2_onboard,
            R.drawable.img_qualify_2_onboard,
            R.drawable.img_qualify_2_onboard,
            R.drawable.img_qualify_2_onboard,
            R.drawable.img_qualify_2_onboard,
        )

    val pagerState =
        rememberPagerState(pageCount = {
            list.size
        })

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(32.dp),
        modifier = modifier,
    ) {
        HorizontalPager(
            state = pagerState,
            pageSpacing = 8.dp,
        ) {
            AppImageComponent(res = list[it])
        }
        Row {
            repeat(pagerState.pageCount) { iteration ->
                if (iteration == 3) {
                    Box(
                        modifier =
                            Modifier
                                .padding(4.dp)
                                .clip(RoundedCornerShape(16.dp))
                                .background(MaterialTheme.colorScheme.primary)
                                .size(32.dp, 16.dp),
                    )
                } else {
                    Box(
                        modifier =
                            Modifier
                                .padding(4.dp)
                                .clip(CircleShape)
                                .background(MaterialTheme.colorScheme.primaryContainer)
                                .size(16.dp),
                    )
                }
            }
        }
    }
}

@Composable
fun Qualify2ButtonComponent(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    ButtonTextComponent(
        res = R.string.next,
        onClick = onClick,
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
internal fun Qualify2SkipTextButtonComponentPreview() {
    AppTheme {
        Qualify2SkipTextButtonComponent(
            onClick = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
internal fun Qualify2TitleTextComponentPreview() {
    AppTheme {
        Qualify2TitleTextComponent()
    }
}

@Preview(showBackground = true)
@Composable
internal fun Qualify2DetailTextComponentPreview() {
    AppTheme {
        Qualify2DetailTextComponent()
    }
}

@Preview(showBackground = true)
@Composable
internal fun Qualify2ImagePagerComponentPreview() {
    AppTheme {
        Qualify2ImagePagerComponent()
    }
}

@Preview(showBackground = true)
@Composable
internal fun Qualify2ButtonComponentPreview() {
    AppTheme {
        Qualify2ButtonComponent(
            onClick = {},
        )
    }
}
