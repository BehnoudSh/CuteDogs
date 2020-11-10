package ir.behnoudsh.kotlin_coroutines_retrofit_livedata_

import androidx.lifecycle.MutableLiveData

class MainRepository {
    private val apiHandler = ApiClient.apiinterface

    val randomImageSuccessLiveData = MutableLiveData<DogImageModel>()

    suspend fun getNewPic() {

        val response = apiHandler.getRandomDogImage()
        randomImageSuccessLiveData.postValue(response.body())

    }

    companion object {
        val TAG = MainRepository::class.java.simpleName
    }
}