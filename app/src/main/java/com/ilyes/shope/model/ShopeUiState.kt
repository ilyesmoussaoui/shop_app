package com.ilyes.shope.model

import androidx.annotation.DrawableRes
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import com.ilyes.shope.Data.Datasource
import com.ilyes.shope.R

data class UiState(
    val revenue: Int = 0,
    val dessertsSold: Int = 0,
    val currentDessertImageId: Int = Datasource.dessertList.first().imageId,
    val currentDessertPrice : Int = Datasource.dessertList.first().price

)
