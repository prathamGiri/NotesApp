package com.example.notes.feature_note.presentation.notes.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.notes.R
import com.example.notes.feature_note.domain.model.Note

@Composable
fun NoteItem(
    note: Note,
    onDeleteClick: () -> Unit,
    cornerRadius: Dp = 10.dp,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clip(RoundedCornerShape(cornerRadius))
            .background(Color(note.color))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .padding(end = 32.dp)
        ) {
            Text(
                text = note.title,
                color = Color.Black,
                fontSize = 24.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = note.content,
                color = Color.Black,
                maxLines = 10,
                overflow = TextOverflow.Ellipsis
            )
        }
        Image(
            painter = painterResource(id = R.drawable.icons8_delete),
            contentDescription = null,
            modifier = Modifier
                .clickable {
                    onDeleteClick()
                }
                .size(30.dp)
                .align(Alignment.BottomEnd)
                .padding(bottom = 5.dp, end = 5.dp)
        )
    }
}