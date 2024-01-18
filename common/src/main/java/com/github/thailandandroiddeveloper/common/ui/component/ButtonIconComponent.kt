package com.github.thailandandroiddeveloper.common.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
fun ButtonIconComponent(
    @DrawableRes res: Int,
    tint: Color,
    containerColor: Color,
    modifier: Modifier = Modifier,
    colors: ButtonColors = ButtonDefaults.buttonColors(containerColor),
    shape: Shape = RoundedCornerShape(100.dp),
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        colors = colors,
        shape = shape,
        modifier = modifier,
    ) {
        AppIconComponent(
            res = res,
            tint = tint,
        )
    }
}

@Preview(showBackground = true)
@Composable
internal fun ButtonIconComponentPreview() {
    AppTheme {
        ButtonIconComponent(
            res = R.drawable.ic_qualify_1_thumb_up,
            tint = MaterialTheme.colorScheme.onPrimaryContainer,
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            onClick = {},
            modifier =
                Modifier
                    .width(120.dp)
                    .height(48.dp),
        )
    }
}
