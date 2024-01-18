package com.github.thailandandroiddeveloper.common.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
fun AppIconComponent(
    @DrawableRes res: Int,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
    tint: Color = LocalContentColor.current,
) {
    Icon(
        painter = painterResource(id = res),
        contentDescription = contentDescription,
        tint = tint,
        modifier = modifier,
    )
}

@Preview
@Composable
internal fun AppIconComponentPreview() {
    AppTheme {
        AppIconComponent(
            res = R.drawable.ic_qualify_1_gender_male,
            tint = MaterialTheme.colorScheme.onPrimary,
        )
    }
}
