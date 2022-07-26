package com.omerkaraca.landmarkbookkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.omerkaraca.landmarkbookkotlin.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val selectedRaceMap = intent.getSerializableExtra("racemap") as RaceMap

        binding.nameText.text = selectedRaceMap.name
        binding.countryText.text = selectedRaceMap.country
        binding.imageView.setImageResource(selectedRaceMap.image)

    }



}