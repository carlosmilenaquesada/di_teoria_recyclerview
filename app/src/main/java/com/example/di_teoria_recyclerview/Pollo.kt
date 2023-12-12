package com.example.di_teoria_recyclerview

import androidx.annotation.DrawableRes

data class Pollo(
    var name:String,
    var ciudad: String,
    @DrawableRes var foto: Int

)
