package com.example.myapplication.ui.plan

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R


class PlanAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private lateinit var inflater: LayoutInflater
    private val TYPE_TOP = 0x0000
    private val TYPE_NORMAL = 0x0001
    private lateinit var traceList: ArrayList<PlanItem>
    private lateinit var context: Context

    constructor(context: Context?, list: List<PlanItem>?) : this() {
        if (context != null) {
            this.context = context
            inflater = LayoutInflater.from(context)
        }
        traceList = list as ArrayList<PlanItem>
    }


    fun setList(list:List<PlanItem>){
        this.traceList = list as ArrayList<PlanItem>
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.timeline_item, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemHolder = holder as ViewHolder
        if (getItemViewType(position) == TYPE_TOP) {
            // 第一行头的竖线不显示
            itemHolder.tvTopLine.visibility = View.INVISIBLE
            // 字体颜色加深
            itemHolder.tvAcceptStation.setTextColor(-0xaaaaab)
            itemHolder.tvDot.setBackgroundResource(R.drawable.timeline_dot_first)
        } else if (getItemViewType(position) == TYPE_NORMAL) {
            itemHolder.tvTopLine.visibility = View.VISIBLE
            itemHolder.tvAcceptStation.setTextColor(-0x666667)
            itemHolder.tvDot.setBackgroundResource(R.drawable.timeline_dot_normal)
        }
        itemHolder.bindHolder(traceList[position])
    }

    override fun getItemCount(): Int {
        return traceList.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) {
            TYPE_TOP
        } else TYPE_NORMAL
    }

    private class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvAcceptStation: TextView = itemView.findViewById<View>(R.id.tvAcceptStation) as TextView
        val tvTopLine: TextView = itemView.findViewById<View>(R.id.tvTopLine) as TextView
        val tvDot: TextView = itemView.findViewById<View>(R.id.tvDot) as TextView

        fun bindHolder(trace: PlanItem) {
            tvAcceptStation.text = trace.getAcceptStation()
        }

    }


}