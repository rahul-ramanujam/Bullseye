package com.rahulrv.bullseye.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.rahulrv.bullseye.R

/**
 * Created by  rahulramanujam On 12/24/24
 *
 */
@Composable
fun ResultDialog(
    hideDialog: () -> Unit,
    onRoundIncrement: () -> Unit,
    sliderValue:Int,
    points:Int,
    modifier: Modifier = Modifier
) {
    AlertDialog(
        onDismissRequest = {
            hideDialog()
            onRoundIncrement.invoke()
        },
        confirmButton = {
            TextButton(
                onClick = {
                    hideDialog()
                    onRoundIncrement.invoke()
                }
            ) {
                Text(stringResource(id = R.string.result_dialog_button_text))
            }
        },
        title = { Text(stringResource(id = R.string.result_dialog_title)) },
        text = { Text(stringResource(id = R.string.result_dialog_message, sliderValue, points)) }
    )
}
