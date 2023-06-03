package space.mairi.materialdesign.viewmodel

import space.mairi.materialdesign.model.PictureOfTheDayResponseData

sealed class AppState {
    data class Success(val pictureOfTheDayResponseData : PictureOfTheDayResponseData) : AppState()
    data class Error(val error : Throwable) : AppState()
    object Loading : AppState()
}