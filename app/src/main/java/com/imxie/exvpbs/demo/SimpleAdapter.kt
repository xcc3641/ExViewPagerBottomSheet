package com.imxie.exvpbs.demo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_tab.view.*


class SimpleAdapter : RecyclerView.Adapter<SimpleViewHolder>() {

    private val data = arrayListOf<Int>()

    init {
        data.addAll(1 until 20)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder {
        return SimpleViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        holder.itemView.tvContent.text = "这是第${data[position]}个"
    }
}


class SimpleViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.list_item_tab, parent, false)
)