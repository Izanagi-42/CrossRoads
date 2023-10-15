package com.example.crossroads

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

val QuickSand = FontFamily(
    Font(R.font.quicksand_light, FontWeight.Light),
    Font(R.font.quicksand_medium, FontWeight.Medium),
    Font(R.font.quicksand_regular, FontWeight.Normal),
    Font(R.font.quicksand_semibold, FontWeight.SemiBold),
    Font(R.font.quicksand_bold, FontWeight.Bold)
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
    Box(
        modifier = with(Modifier) {
            fillMaxSize()
                .paint(
                    painterResource(id = R.drawable.black_bg),
                    contentScale = ContentScale.FillBounds
                )
        }
    ) {
        Image(
            painter = painterResource(id = R.drawable.white_logo_nobg),
            contentDescription = "Cross Roads Logo",
            modifier = Modifier.size(200.dp).offset(80.dp, 30.dp)
        )
        Card(
            modifier = Modifier
                .requiredWidth(420.dp)
                .fillMaxHeight(0.85f)
                .offset(30.dp, 250.dp),
            colors = CardDefaults.cardColors(Color.White),
            shape = RoundedCornerShape(60.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.offset(40.dp, 40.dp)
            ) {
                // Variables
                var username by remember {
                    mutableStateOf(TextFieldValue(""))
                }
                var password by remember {
                    mutableStateOf(TextFieldValue(""))
                }
                // End of Variables

                Text(
                    text = "Login",
                    fontSize = 35.sp,
                    fontFamily = QuickSand,
                    fontWeight = FontWeight.Normal
                )
                Spacer(modifier = Modifier.fillMaxHeight(0.07f))
                OutlinedTextField(
                    value = username,
                    onValueChange = {
                        username = it
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Person, contentDescription = "Person Icon")
                    },
                    placeholder = {
                        Text(text = "Username")
                    },
                    shape = RoundedCornerShape(30.dp),
                )
                Spacer(modifier = Modifier.height(25.dp))
                OutlinedTextField(value = password, onValueChange = {
                    password = it
                }, leadingIcon = {
                    Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock Icon")
                },
                    placeholder = {
                        Text(text = "Password")
                    },
                    shape = RoundedCornerShape(30.dp),
                    colors = TextFieldDefaults.textFieldColors()
                )
                Spacer(modifier = Modifier.height(15.dp))
                Button(
                    onClick = { navController.navigate(Screen.QuestionOne.route) },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black,
                        contentColor = Color.White
                    ),
                    modifier = Modifier
                        .fillMaxWidth(0.66f)
                        .fillMaxHeight(0.17f)
                        .padding(top = 10.dp),
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Text(text = "Login")
                }
                Spacer(modifier = Modifier.height(60.dp))
                Row {
                    Text(text = "Don't have an account? ", fontFamily = QuickSand)
                    Text(
                        text = "Sign Up",
                        fontFamily = QuickSand,
                        modifier = Modifier.clickable { navController.navigate(Screen.SignUp.route) },
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(navController: NavController) {
    Box(
        modifier = with(Modifier) {
            fillMaxSize()
                .paint(
                    painterResource(id = R.drawable.black_bg),
                    contentScale = ContentScale.FillBounds
                )
        },
    ) {
        Text(
            text = "Sign Up",
            color = Color.White,
            fontSize = 40.sp,
            modifier = Modifier.offset(105.dp, 40.dp),
            fontFamily = QuickSand,
            fontWeight = FontWeight.SemiBold
        )
        Card(
            modifier = Modifier
                .requiredWidth(420.dp)
                .fillMaxHeight(0.85f)
                .offset(30.dp, 135.dp),
            colors = CardDefaults.cardColors(Color.White),
            shape = RoundedCornerShape(60.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.offset(42.dp, 30.dp)
            ) {
                // Variables
                var firstName by remember {
                    mutableStateOf(TextFieldValue(""))
                }
                var lastName by remember {
                    mutableStateOf(TextFieldValue(""))
                }
                var username by remember {
                    mutableStateOf(TextFieldValue(""))
                }
                var password by remember {
                    mutableStateOf(TextFieldValue(""))
                }
                var passwordConfirm by remember {
                    mutableStateOf(TextFieldValue(""))
                }
                // End of Variables

                Spacer(modifier = Modifier.fillMaxHeight(0.03f))
                OutlinedTextField(
                    value = firstName,
                    onValueChange = {
                        firstName = it
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Person, contentDescription = "Person Icon")
                    },
                    placeholder = {
                        Text(text = "First Name")
                    },
                    shape = RoundedCornerShape(30.dp),
                )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = lastName,
                    onValueChange = {
                        lastName = it
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock Icon")
                    },
                    placeholder = {
                        Text(text = "Last Name")
                    },
                    shape = RoundedCornerShape(30.dp),

                    )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = username,
                    onValueChange = {
                        username = it
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock Icon")
                    },
                    placeholder = {
                        Text(text = "Username")
                    },
                    shape = RoundedCornerShape(30.dp),

                    )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = password,
                    onValueChange = {
                        password = it
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock Icon")
                    },
                    placeholder = {
                        Text(text = "Password")
                    },
                    shape = RoundedCornerShape(30.dp),

                    )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = passwordConfirm,
                    onValueChange = {
                        passwordConfirm = it
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock Icon")
                    },
                    placeholder = {
                        Text(text = "Confirm Password")
                    },
                    shape = RoundedCornerShape(30.dp),

                    )
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = { navController.navigate(Screen.QuestionOne.route) },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black,
                        contentColor = Color.White
                    ),
                    modifier = Modifier
                        .height(65.dp)
                        .width(270.dp)
                        .padding(top = 10.dp),
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Text(text = "Sign Up")
                }
                Spacer(modifier = Modifier.height(45.dp))
                Row {
                    Text(text = "Already have an account? ", fontFamily = QuickSand)
                    Text(
                        text = "Sign In",
                        fontFamily = QuickSand,
                        modifier = Modifier.clickable { navController.navigate(Screen.Login.route) },
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}
