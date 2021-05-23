package com.yugal.habittrainer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_card.view.*

class  HabitsAdapter(private val habits: List<Habit>) : RecyclerView.Adapter<HabitsAdapter.HabitViewHolder>(){

    class  HabitViewHolder(val card: View): RecyclerView.ViewHolder(card)

    // Create a new viewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_card, parent, false)

        return  HabitViewHolder(view)
    }

    // Specifies the contents for the shown habit
    override fun onBindViewHolder(holder: HabitViewHolder, position: Int) {

            holder.card.tv_title.text = habits[position].title
            holder.card.tv_description.text = habits[position].description
            holder.card.iv_icon.setImageResource(habits[position].image)

    }

    override fun getItemCount() = habits.size

}