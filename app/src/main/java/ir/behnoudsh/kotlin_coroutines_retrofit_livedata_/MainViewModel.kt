package ir.behnoudsh.kotlin_coroutines_retrofit_livedata_

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


class MainViewModel : ViewModel() {

    val mainRepository: MainRepository = MainRepository()

    val randomImageSuccessLiveData = mainRepository.randomImageSuccessLiveData

    fun getNewPic() {

        //this is coroutine viewmodel scope to call suspend fun of repo
        viewModelScope.launch { mainRepository.getNewPic() }

    }


}