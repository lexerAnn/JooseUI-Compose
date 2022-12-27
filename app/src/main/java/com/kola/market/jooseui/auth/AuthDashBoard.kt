package com.kola.market.jooseui.auth

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kola.market.jooseui.R


@Composable
fun AuthDashBoardScreen(
    onItemClick:() -> Unit
) {

    Column {

        Box (
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ){

            Image (
                painter = painterResource(id = R.drawable.banner_image),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 16.dp),
            ){
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 20.sp,
                    color = Color.Yellow,
                    textAlign = TextAlign.Center,
                    text = "Make your shopping enjoyable with us"
                )
                Spacer(modifier = Modifier.height(14.dp))
                Button(
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Blue
                    ),
                    shape = RoundedCornerShape(50),
                    onClick = { onItemClick()}) {
                    Text(
                        color = Color.White,
                        text = "Sign In")
                }
                Spacer(modifier = Modifier.height(14.dp))

                OutlinedButton(
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color.Transparent
                    ),
                    border = BorderStroke(1.dp, Color.White),
                    shape = RoundedCornerShape(50)

                    ,onClick = { /*TODO*/ }) {

                    Text(
                        color = Color.White,
                        text = "Sign Up")
                }

            }


        }

    }

}