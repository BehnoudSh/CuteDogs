package ir.behnoudsh.kotlin_coroutines_retrofit_livedata_

import androidx.lifecycle.LiveData
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("/api/breeds/image/random")
    suspend fun getRandomDogImage(): Response<DogImageModel>

}