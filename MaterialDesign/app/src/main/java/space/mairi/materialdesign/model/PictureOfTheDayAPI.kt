package space.mairi.materialdesign.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

const val END_POINT = "planetary/apod"

interface PictureOfTheDayAPI {
    @GET(END_POINT)
    fun getPictureOfTheDay(@Query("api_key") apiKey : String): Call<PictureOfTheDayResponseData>

    @GET(END_POINT)
    fun getPictureOfTheDayByDate(@Query("api_key") apiKey : String, @Query("date") date : String): Call<PictureOfTheDayResponseData>
}