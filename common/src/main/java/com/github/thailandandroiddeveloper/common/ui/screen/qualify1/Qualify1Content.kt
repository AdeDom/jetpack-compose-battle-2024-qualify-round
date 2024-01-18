package com.github.thailandandroiddeveloper.common.ui.screen.qualify1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
fun Qualify1Content(
    modifier: Modifier = Modifier,
    onThumbDownClick: () -> Unit,
    onThumbUpClick: () -> Unit,
) {
    Box(modifier = modifier) {
        Box(
            modifier =
                Modifier
                    .clip(RoundedCornerShape(16.dp)),
        ) {
            Qualify1UserImageComponent()
            Qualify1UserInfoComponent(
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .height(192.dp)
                        .alpha(0.75f)
                        .background(MaterialTheme.colorScheme.primary)
                        .padding(
                            start = 20.dp,
                            top = 20.dp,
                            end = 20.dp,
                            bottom = 40.dp,
                        )
                        .align(Alignment.BottomCenter),
            )
        }
        Qualify1ThumbButtonComponent(
            onThumbDownClick = onThumbDownClick,
            onThumbUpClick = onThumbUpClick,
            modifier =
                Modifier
                    .align(Alignment.BottomCenter)
                    .offset(y = 24.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
internal fun Qualify1ContentPreview() {
    AppTheme {
        Qualify1Content(
            onThumbDownClick = {},
            onThumbUpClick = {},
        )
    }
}
