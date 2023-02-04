package com.example.fitnesskit_test.ui.viewholders

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.fitnesskit_test.R

class ViewHolder(itemCardView: View) : RecyclerView.ViewHolder(itemCardView) {
    //находим по id view дату занятия
    val date_training = itemCardView.findViewById<TextView>(R.id.date_training)

    //находим по id view цвет нашего CardView
    val left_color = itemCardView.findViewById<CardView>(R.id.left_color)

    ////находим по id view время начала и окончания занятия
    val time_start = itemCardView.findViewById<TextView>(R.id.time_start)
    val time_stop = itemCardView.findViewById<TextView>(R.id.time_stop)

    //находим по id view название тренировки, фио тренера и место занятия
    val name_training = itemCardView.findViewById<TextView>(R.id.name_training)
    val name_trainer = itemCardView.findViewById<TextView>(R.id.name_trainer)
    val place_training = itemCardView.findViewById<TextView>(R.id.place_training)
}