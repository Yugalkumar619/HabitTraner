package com.yugal.habittrainer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Adapter -> defined data
        // RecyclerView -> implement 3 methods

        val list: MutableList<Habit> = mutableListOf(Habit("Yoga","Yoga keeps your mind peaceful.", R.drawable.water))

        list.add(Habit("Go for a walk", "A nice walk in the sun gets you ready for the day ahead", R.drawable.walk))
        list.add(Habit("Drink a glass of water","A refreshing glass of water gets you hydrated.", R.drawable.water))

        rv.setHasFixedSize(true)

        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = HabitsAdapter(list)
    }
}