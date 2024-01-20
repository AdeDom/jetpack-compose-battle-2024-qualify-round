package com.github.thailandandroiddeveloper.common.ui.screen.qualify3

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

data class Qualify3ImageProfile(
    @DrawableRes val res: Int,
    val isSelect: Boolean,
)

data class Qualify3Tag(
    @StringRes val res: Int,
    val isSelect: Boolean,
)

data class Qualify3Sender(
    @DrawableRes val imageProfile: Int,
    @StringRes val title: Int,
    @StringRes val subTitle: Int,
)

@Composable
fun Qualify3Content(modifier: Modifier = Modifier) {
    val list1 =
        listOf(
            Qualify3ImageProfile(
                res = R.drawable.img_qualify_3_photo_1,
                isSelect = true,
            ),
            Qualify3ImageProfile(
                res = R.drawable.img_qualify_3_photo_2,
                isSelect = false,
            ),
            Qualify3ImageProfile(
                res = R.drawable.img_qualify_3_photo_3,
                isSelect = false,
            ),
        )

    val list2 =
        listOf(
            Qualify3Tag(
                res = R.string.tag_1,
                isSelect = true,
            ),
            Qualify3Tag(
                res = R.string.tag_2,
                isSelect = false,
            ),
            Qualify3Tag(
                res = R.string.tag_3,
                isSelect = false,
            ),
            Qualify3Tag(
                res = R.string.tag_4,
                isSelect = false,
            ),
        )

    val list3 =
        listOf(
            Qualify3Sender(
                imageProfile = R.drawable.img_qualify_3_sender,
                title = R.string.sender_title1,
                subTitle = R.string.sender_sub_title1,
            ),
            Qualify3Sender(
                imageProfile = R.drawable.img_qualify_3_sender,
                title = R.string.sender_title2,
                subTitle = R.string.sender_sub_title2,
            ),
            Qualify3Sender(
                imageProfile = R.drawable.img_qualify_3_sender,
                title = R.string.sender_title3,
                subTitle = R.string.sender_sub_title3,
            ),
            Qualify3Sender(
                imageProfile = R.drawable.img_qualify_3_sender,
                title = R.string.sender_title4,
                subTitle = R.string.sender_sub_title4,
            ),
        )

    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier,
    ) {
        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            items(list1) {
                Qualify3ImageProfileComponent(
                    res = it.res,
                    isSelect = it.isSelect,
                )
            }
        }
        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            items(list2) {
                Qualify3TagComponent(
                    res = it.res,
                    isSelect = it.isSelect,
                )
            }
        }
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            items(list3) {
                Qualify3SenderComponent(
                    imageProfile = it.imageProfile,
                    title = it.title,
                    subTitle = it.subTitle,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
internal fun Qualify3ContentPreview() {
    AppTheme {
        Qualify3Content()
    }
}
