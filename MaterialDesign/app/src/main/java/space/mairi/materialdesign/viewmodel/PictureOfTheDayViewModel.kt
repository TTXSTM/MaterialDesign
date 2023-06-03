package space.mairi.materialdesign.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import space.mairi.materialdesign.BuildConfig
import space.mairi.materialdesign.model.PictureOfTheDayResponseData
import space.mairi.materialdesign.model.RepositoryImpl

private const val SERVER_ERROR = "Ошибка сервера"
private const val REQUEST_ERROR = "Ошибка запроса на сервер"
private const val CORRUPTED_DATA = "Неполные данные"

class PictureOfTheDayViewModel(private val liveData: MutableLiveData<AppState> = MutableLiveData(),
                               val repositoryImpl: RepositoryImpl = RepositoryImpl()
) : ViewModel() {

    fun getLiveData() : MutableLiveData<AppState> {

        return liveData
    }

    fun sendRequest() {
        liveData.postValue(AppState.Loading)
        repositoryImpl.getPictureOfTheDayApi().getPictureOfTheDay(BuildConfig.NASA_API_KEY)
            .enqueue(callback)

    }

    val callback = object : Callback<PictureOfTheDayResponseData> {
        override fun onResponse(
            call: Call<PictureOfTheDayResponseData>,
            response: Response<PictureOfTheDayResponseData>
        ) {
            val serverResponse : PictureOfTheDayResponseData? = response.body()

            liveData.postValue(
                if (response.isSuccessful){
                    checkResponse(serverResponse!!)
                } else {
                    AppState.Error(Throwable(SERVER_ERROR))
                }
            )
        }

        override fun onFailure(call: Call<PictureOfTheDayResponseData>, t: Throwable) {
            liveData.postValue(AppState.Error(Throwable(t.message ?: REQUEST_ERROR)))
        }

        private fun checkResponse(serverResponse: PictureOfTheDayResponseData) : AppState {
            val fact = serverResponse

            return AppState.Success(serverResponse)
        }
    }
}