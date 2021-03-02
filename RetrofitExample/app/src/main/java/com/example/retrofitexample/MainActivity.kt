package com.example.retrofitexample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            Retrofit().getUserAPI().user().enqueue(object : Callback<List<userResponse>>{

                override fun onResponse(
                    call: Call<List<userResponse>>,
                    response: Response<List<userResponse>>
                ) {
                    if (response.isSuccessful){
                        textView.text = response.body()?.get(0)?.username
                    } else {
                        println(response.code())
                    }
                }

                override fun onFailure(call: Call<List<userResponse>>, t: Throwable) {
                    println("통신 실패")
                }

            })

        }



    }
}