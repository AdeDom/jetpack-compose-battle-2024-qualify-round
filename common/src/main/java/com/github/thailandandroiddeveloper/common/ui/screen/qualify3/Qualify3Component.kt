package com.github.thailandandroiddeveloper.common.ui.screen.qualify3

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.component.AppImageComponent
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
fun Qualify3ImageProfileComponent(
    @DrawableRes res: Int,
    isSelect: Boolean,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier) {
        AppImageComponent(
            res = res,
            modifier =
                Modifier
                    .size(width = 160.dp, height = 320.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .border(
                        width = 2.dp,
                        color =
                            if (isSelect) {
                                MaterialTheme.colorScheme.primary
                            } else {
                                MaterialTheme.colorScheme.primaryContainer
                            },
                        shape = RoundedCornerShape(16.dp),
                    ),
        )
    }
}

@Composable
fun Qualify3TagComponent(
    @StringRes res: Int,
    isSelect: Boolean,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier) {
        Box(
            modifier =
                Modifier
                    .height(32.dp)
                    .border(
                        width = 1.dp,
                        color =
                            if (isSelect) {
                                MaterialTheme.colorScheme.primary
                            } else {
                                MaterialTheme.colorScheme.outline
                            },
                        shape = RoundedCornerShape(8.dp),
                    ),
        ) {
            Text(
                text = stringResource(id = res),
                color =
                    if (isSelect) {
                        MaterialTheme.colorScheme.primary
                    } else {
                        MaterialTheme.colorScheme.outline
                    },
                style = MaterialTheme.typography.labelLarge,
                modifier =
                    Modifier
                        .padding(horizontal = 16.dp)
                        .align(Alignment.Center),
            )
        }
    }
}

@Composable
fun Qualify3SenderComponent(
    @DrawableRes imageProfile: Int,
    @StringRes title: Int,
    @StringRes subTitle: Int,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier =
                Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .border(
                        width = 1.dp,
                        color = MaterialTheme.colorScheme.surfaceVariant,
                        shape = RoundedCornerShape(16.dp),
                    )
                    .background(MaterialTheme.colorScheme.surface)
                    .padding(16.dp),
        ) {
            AppImageComponent(
                imageProfile,
                contentDescription = null,
                modifier =
                    Modifier
                        .size(48.dp)
                        .clip(RoundedCornerShape(24.dp)),
            )
            Column {
                Text(
                    text = stringResource(title),
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.titleMedium,
                )
                Text(
                    text = stringResource(subTitle),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
internal fun Qualify3ImageProfileComponent1Preview() {
    AppTheme {
        Qualify3ImageProfileComponent(
            res = R.drawable.img_qualify_3_photo_1,
            isSelect = true,
        )
    }
}

@Preview(showBackground = true)
@Composable
internal fun Qualify3ImageProfileComponent2Preview() {
    AppTheme {
        Qualify3ImageProfileComponent(
            res = R.drawable.img_qualify_3_photo_2,
            isSelect = false,
        )
    }
}

@Preview(showBackground = true)
@Composable
internal fun Qualify3TagComponent1Preview() {
    AppTheme {
        Qualify3TagComponent(
            res = R.string.tag_1,
            isSelect = true,
        )
    }
}

@Preview(showBackground = true)
@Composable
internal fun Qualify3TagComponent2Preview() {
    AppTheme {
        Qualify3TagComponent(
            res = R.string.tag_2,
            isSelect = false,
        )
    }
}

@Preview(showBackground = true)
@Composable
internal fun Qualify3SenderComponentPreview() {
    AppTheme {
        Qualify3SenderComponent(
            imageProfile = R.drawable.img_qualify_3_sender,
            title = R.string.sender_title1,
            subTitle = R.string.sender_sub_title1,
        )
    }
}
