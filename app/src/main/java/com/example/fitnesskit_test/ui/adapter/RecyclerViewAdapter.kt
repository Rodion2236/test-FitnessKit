package com.example.fitnesskit_test.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fitnesskit_test.R
import com.example.fitnesskit_test.domain.lesson.InfoL
import com.example.fitnesskit_test.ui.viewholders.ViewHolder
import com.example.fitnesskit_test.util.getDateFormat

class RecyclerViewAdapter: RecyclerView.Adapter<ViewHolder>() {
    //создаем адаптер для нашего списка тренировок

    //реализуем методы адаптера
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_layout,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listInfoL.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val infoL = listInfoL[position]
        holder.date_training.text = getDateFormat(infoL.date.toString())

        holder.left_color.setBackgroundColor(infoL.color.hashCode())

        holder.name_trainer.text = infoL.full_name
        holder.name_training.text = infoL.name
        holder.place_training.text = infoL.place

        holder.time_start.text = infoL.startTime
        holder.time_stop.text = infoL.endTime
    }

    var listInfoL: List<InfoL> = mutableListOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }
    init {
        listInfoL.sortedWith(compareBy(String.CASE_INSENSITIVE_ORDER) {
            it.date.toString()
        })
    }
}