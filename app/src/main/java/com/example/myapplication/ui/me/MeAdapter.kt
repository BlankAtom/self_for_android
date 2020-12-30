package com.example.myapplication.ui.me

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import org.w3c.dom.Text

class MeAdapter(
    var context: Context?,
    var list: ArrayList<MeThingItem>,

) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.me_item, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemHolder = holder as ViewHolder
        itemHolder.title.setTextColor(R.color.content_bold)
        itemHolder.body.setTextColor(R.color.content_gray)
        itemHolder.date.setTextColor(R.color.content_gray)
        itemHolder.bindHolder(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    private class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val title: TextView = itemView.findViewById(R.id.me_thing_title)
        val body: TextView = itemView.findViewById(R.id.me_thing_body)
        val date: TextView = itemView.findViewById(R.id.me_thing_date)

        fun bindHolder(item: MeThingItem){
            title.text = item.title
            body.text = item.body
            date.text = item.date
        }
    }

}