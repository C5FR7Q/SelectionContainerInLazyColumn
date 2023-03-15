package com.github.c5fr7q.selectioncontainerinlazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.c5fr7q.selectioncontainerinlazycolumn.ui.theme.SelectionContainerInLazyColumnTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SelectionContainerInLazyColumnTheme {
                LazyColumn {
                    item { Placeholder(alpha = 0.9f) }
                    item { Placeholder(alpha = 0.8f) }
                    item { Placeholder(alpha = 0.7f) }
                    item {
                        SelectionContainer(
                            modifier = Modifier
                                .background(Color.LightGray)
                                .fillMaxWidth()
                                .height(200.dp)
                        ) {
                            Column {
                                Text(text = "Lorem inpsum one")
                                Text(text = "Lorem inpsum two")
                            }
                        }
                    }
                    item { Placeholder(alpha = 0.6f) }
                    item { Placeholder(alpha = 0.5f) }
                    item { Placeholder(alpha = 0.4f) }
                }
            }
        }
    }
}

@Composable
private fun Placeholder(alpha: Float) {
    Box(
        modifier = Modifier
            .background(Color.Black.copy(alpha = alpha))
            .fillMaxWidth()
            .height(400.dp)
    )
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SelectionContainerInLazyColumnTheme {
        Greeting("Android")
    }
}