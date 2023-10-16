package com.example.firstcompose.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.example.firstcompose.R
import com.example.firstcompose.composable.DefaultButton
import com.example.firstcompose.composable.Header
import com.example.firstcompose.composable.InformationCard
import com.example.firstcompose.composable.ProfileAvatar
import com.example.firstcompose.composable.SpacerHorizontal16
import com.example.firstcompose.composable.SpacerVertical24
import com.example.firstcompose.composable.SpacerVertical32
import com.example.firstcompose.composable.TextButton
import com.example.firstcompose.models.ProfileState
import com.example.firstcompose.viewmodel.ProfileViewModel


@Composable
fun profileScreen(
    viewModel:ProfileViewModel = hiltViewModel()
){
    val state by viewModel.state.collectAsState()
    profile(
        state = state,
        onChangeFirstName = viewModel::onChangeFirstName,
        onChangeLastName = viewModel::onChangeLastName,
        onChangeLocation = viewModel::onChangeLocation,
        onChangeEmail = viewModel::onChangeEmail,
        onChangePhone = viewModel::onChangePhone,
        onSaveUserInfo = viewModel::saveUserInfo
    )
}

@Composable
private fun profile(
    state:ProfileState,
    onChangeFirstName:(String) -> Unit,
    onChangeLastName:(String) -> Unit,
    onChangeLocation:(String) -> Unit,
    onChangeEmail:(String) -> Unit,
    onChangePhone:(String) -> Unit,
    onSaveUserInfo:() -> Unit,
){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 32.dp)
            .verticalScroll(state = rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Header(title = stringResource(R.string.account),subTitle = stringResource(R.string.account_subtitle))
        SpacerVertical32()
        ProfileAvatar(painter = rememberAsyncImagePainter(model = state.profilePicLink))
        SpacerVertical24()
        TextButton(text = stringResource(R.string.change_profile_picture)){}
        SpacerVertical32()
        Row(
            modifier = Modifier.fillMaxWidth()
        ){
            Box(
                modifier = Modifier.weight(1f)
            ){
                InformationCard(stringResource(R.string.first_name),state.firstName,onChangeFirstName)
            }
            SpacerHorizontal16()
            Box(
                modifier = Modifier.weight(1f)
            ){
                InformationCard(stringResource(R.string.last_name),state.lastName,onChangeLastName)
            }
        }
        InformationCard(stringResource(R.string.location),state.location,onChangeLocation)
        InformationCard(stringResource(R.string.email),state.email,onChangeEmail)
        InformationCard(stringResource(R.string.phone),state.phone,onChangePhone)
        Spacer(modifier = Modifier.weight(1f))
        DefaultButton(stringResource(R.string.save),onSaveUserInfo)

    }
}


@Preview(showBackground = true)
@Composable
fun previewProfile(){
    profileScreen()
}