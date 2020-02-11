package com.weather.mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.view.animation.Animation
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.weather.mvvm.viewmodel.WeatherViewModel
import kotlinx.android.synthetic.main.activity_main.*
import android.view.animation.AnimationUtils
import android.view.animation.RotateAnimation
import com.weather.R
import kotlinx.android.synthetic.main.layout_weather_forecast.view.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)

        rotateProgressBar()

        val viewModelProvider = ViewModelProvider.AndroidViewModelFactory.getInstance(application)
        val viewModel = viewModelProvider.create(WeatherViewModel::class.java)
        fetchWeatherForecast(viewModel)
    }

    private fun rotateProgressBar() {
        val rotateAnimation = RotateAnimation(0f,360f,Animation.RELATIVE_TO_SELF,0.5f,
            Animation.RELATIVE_TO_SELF,0.5f)
        rotateAnimation.duration = 1200
        rotateAnimation.repeatCount = Animation.INFINITE
        iv_loader.startAnimation(rotateAnimation)
    }

    private fun fetchWeatherForecast(viewModel: WeatherViewModel) {
        val result = viewModel.getMutableLiveData()

        result.observe(this, Observer { response ->
            if (response.isStatus) {
                ll_progress_bar.visibility = View.GONE
            } else {
                ll_progress_bar.visibility = View.GONE
                ll_forecast.visibility = View.VISIBLE

                showSlideUpAnimation()

                tv_current_temp.text = "${response.current?.temperature}\u00B0"
                tv_city_name.text = response.location?.name?:""

                layout_2.tv_day.text = getString(R.string.tomorrow)
                layout_2.iv_day.setImageDrawable(getDrawable(R.drawable.clouds))
                layout_2.tv_climate.text = getString(R.string.clouds)
                layout_2.tv_temperature.text = getString(R.string.cloud_temp)

                layout_3.tv_day.text = getString(R.string.tomorrow)
                layout_3.iv_day.setImageDrawable(getDrawable(R.drawable.rain))
                layout_3.tv_climate.text = getString(R.string.rainy)
                layout_3.tv_temperature.text = getString(R.string.cloud_temp)

                layout_4.tv_day.text = getString(R.string.tomorrow)
                layout_4.iv_day.setImageDrawable(getDrawable(R.drawable.storm))
                layout_4.tv_climate.text = getString(R.string.storms)
                layout_4.tv_temperature.text = getString(R.string.cloud_temp)
            }
        })
    }

    private fun showSlideUpAnimation() {
        val slideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up)
        ll_forecast_days.startAnimation(slideUp)
    }

}
