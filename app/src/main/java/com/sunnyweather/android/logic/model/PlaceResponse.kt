package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

// https://api.caiyunapp.com/v2/place?query=%E5%8C%97%E4%BA%AC&token={ebP1l6gn2q7sjBav}&lang=zh_CN
// json 格式
data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(val name: String, val location: Location,
    @SerializedName("formatted_address") val address: String)

data class Location(val lng: String, val lat: String)