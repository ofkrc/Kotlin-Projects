package com.omerkaraca.landmarkbookkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.omerkaraca.landmarkbookkotlin.databinding.ActivityDetailsBinding
import com.omerkaraca.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var racemapList: ArrayList<RaceMap>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        racemapList = ArrayList<RaceMap>()

        //Data
        val mexico = RaceMap("Mexico Grand Prix","Mexico",R.drawable.mexico)
        val monza = RaceMap("Monza Grand Prix","Italy",R.drawable.monza)
        val redbullring = RaceMap("Austrian Grand Prix", "Austria",R.drawable.redbullring)
        val spa = RaceMap("Spa Grand Prix", "Belgium", R.drawable.spa)

        racemapList.add(mexico)
        racemapList.add(monza)
        racemapList.add(redbullring)
        racemapList.add(spa)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val raceMapAdapter = RaceMapAdapter(racemapList)
        binding.recyclerView.adapter = raceMapAdapter

        //Adapter : Layout and Mapping
        /*
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, racemapList.map { raceMap -> raceMap.name })
        binding.listView.adapter = adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(MainActivity@this, DetailsActivity::class.java)
            intent.putExtra("racemap",racemapList.get(i))
            startActivity(intent)
        }
        */
        }

    }
