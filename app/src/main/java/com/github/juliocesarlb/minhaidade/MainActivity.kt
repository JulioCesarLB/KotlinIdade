package com.github.juliocesarlb.minhaidade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.juliocesarlb.minhaidade.ui.theme.MinhaidadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MinhaidadeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

                }
            }
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun CounterScreen(){
    var idade = remember {
        mutableStateOf(43)
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Row (verticalAlignment = Alignment.CenterVertically){
            Text(text = "Pontos corinthians: ",
                fontSize= 24.sp,
                color= Color.Black,
                fontWeight = FontWeight.Bold)
            Text(text = "${idade.value}",
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold)
        }

        Text(text = "aperte os botões para calcular os pontos do coringão",
            fontSize = 12.sp)
        Row {
            Button(onClick = {idade.value++},
                modifier = Modifier.size(84.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFAD1F4E))

            ) {
                Text(text = " + ",
                    fontSize = 40.sp)
            }
            Spacer(modifier = Modifier.height(32.dp))
            Button(onClick = {},
                modifier = Modifier.size(84.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFAD1F4E))) {
                Text(text = " - ",
                    fontSize = 40.sp)
            }
        }

    }
}