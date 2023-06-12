package com.icemobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.america.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewBaseURL.text = "Package Name is: ${applicationContext.packageName} \n" +
                "Application Id is: ${BuildConfig.APPLICATION_ID} \n" +
                "Version Name is: ${BuildConfig.VERSION_NAME} \n" +
                "Base URL is: ${BuildConfig.BASE_URL} \n" +
                "Image file path is: ${getString(R.string.images_file_path)}"


    }

}