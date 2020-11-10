package ir.behnoudsh.kotlin_coroutines_retrofit_livedata_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.lifecycle.ViewModelProviders
import coil.api.load


class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    var btn: Button? = null
    var iv: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btn_get_image);
        iv = findViewById(R.id.iv_dog_image);
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        registerObservers()

        btn?.setOnClickListener {

            mainViewModel.getNewPic()


        }

    }

    fun registerObservers() {


        mainViewModel.randomImageSuccessLiveData.observe(this, {


            iv?.load(it.message)

        })
    }

}