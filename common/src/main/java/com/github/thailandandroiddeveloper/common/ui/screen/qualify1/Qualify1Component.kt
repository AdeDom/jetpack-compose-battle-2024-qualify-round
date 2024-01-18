package com.github.thailandandroiddeveloper.common.ui.screen.qualify1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.component.AppIconComponent
import com.github.thailandandroiddeveloper.common.ui.component.AppImageComponent
import com.github.thailandandroiddeveloper.common.ui.component.ButtonIconComponent
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
fun Qualify1UserImageComponent(modifier: Modifier = Modifier) {
    AppImageComponent(
        res = R.drawable.img_qualify_1_profile,
        contentScale = ContentScale.FillBounds,
        modifier = modifier,
    )
}

@Composable
fun Qualify1UserInfoComponent(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier,
    ) {
        Text(
            text = stringResource(R.string.john_doe),
            color = MaterialTheme.colorScheme.onPrimary,
            style = MaterialTheme.typography.headlineMedium,
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            AppIconComponent(
                res = R.drawable.ic_qualify_1_gender_male,
                tint = MaterialTheme.colorScheme.onPrimary,
            )
            Text(
                text = stringResource(R.string.male),
                color = MaterialTheme.colorScheme.onPrimary,
                style = MaterialTheme.typography.bodyMedium,
            )
        }
        Text(
            text = stringResource(R.string.lorem),
            color = MaterialTheme.colorScheme.onPrimary,
            style = MaterialTheme.typography.bodyMedium,
        )
    }
}

@Composable
fun Qualify1ThumbButtonComponent(
    modifier: Modifier = Modifier,
    onThumbDownClick: () -> Unit,
    onThumbUpClick: () -> Unit,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(43.dp),
        modifier = modifier,
    ) {
        ButtonIconComponent(
            res = R.drawable.ic_qualify_1_thumb_down,
            tint = MaterialTheme.colorScheme.onErrorContainer,
            containerColor = MaterialTheme.colorScheme.errorContainer,
            onClick = onThumbDownClick,
            modifier =
                Modifier
                    .width(120.dp)
                    .height(48.dp),
        )
        ButtonIconComponent(
            res = R.drawable.ic_qualify_1_thumb_up,
            tint = MaterialTheme.colorScheme.onPrimaryContainer,
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            onClick = onThumbUpClick,
            modifier =
                Modifier
                    .width(120.dp)
                    .height(48.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
internal fun Qualify1UserImageComponentPreview() {
    AppTheme {
        Qualify1UserImageComponent()
    }
}

@Preview(showBackground = true)
@Composable
internal fun Qualify1UserInfoComponentPreview() {
    AppTheme {
        Qualify1UserInfoComponent(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .height(192.dp)
                    .alpha(0.75f)
                    .background(MaterialTheme.colorScheme.primary),
        )
    }
}

@Preview(showBackground = true)
@Composable
internal fun Qualify1ThumbButtonComponentPreview() {
    AppTheme {
        Qualify1ThumbButtonComponent(
            onThumbUpClick = {},
            onThumbDownClick = {},
        )
    }
}
