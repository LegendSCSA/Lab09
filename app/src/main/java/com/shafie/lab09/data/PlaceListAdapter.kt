package com.shafie.lab09.data
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.shafie.lab09.R
import com.shafie.lab09.model.Place

class PlaceListAdapter(private val list: ArrayList<Place>, private val context: Context)
    : RecyclerView.Adapter<PlaceListAdapter.ViewHolder>() {

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.custom_row,
            parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size

    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val countryTextView: TextView = holder.itemView.findViewById(R.id.titleTextView)
        val cityTextView: TextView = holder.itemView.findViewById(R.id.subtitleTextView)
        countryTextView.text = list[position].countryName
        cityTextView.text = list[position].cityName
    }
}