package com.shafie.lab09

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shafie.lab09.data.PlaceListAdapter
import com.shafie.lab09.databinding.ActivityMainBinding
import com.shafie.lab09.model.Place

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)

        val countryList = ArrayList<Place>()

        val kualaLumpur = Place("Malaysia", "Kuala Lumpur")
        countryList.add(kualaLumpur)

        val bangkok = Place("Thailand", "Bangkok")
        countryList.add(bangkok)

        val jakarta = Place("Indonesia", "Jakarta")
        countryList.add(jakarta)

        val adapter = PlaceListAdapter(list = countryList, context = this)
        binding.recyclerView.adapter = adapter
    }
}
