package com.github.thailandandroiddeveloper.common.ui.component

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
fun ButtonTextComponent(
    @StringRes res: Int,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(100.dp),
    containerColor: Color = MaterialTheme.colorScheme.primary,
    colors: ButtonColors = ButtonDefaults.buttonColors(containerColor),
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        shape = shape,
        colors = colors,
        modifier = modifier,
    ) {
        Text(
            text = stringResource(id = res),
            color = MaterialTheme.colorScheme.onPrimary,
            style = MaterialTheme.typography.labelLarge,
            textAlign = TextAlign.Center,
        )
    }
}

@Preview(showBackground = true)
@Composable
internal fun ButtonTextComponentPreview() {
    AppTheme {
        ButtonTextComponent(
            res = R.string.next,
            onClick = {},
            modifier = Modifier.size(251.dp, 40.dp),
        )
    }
}
