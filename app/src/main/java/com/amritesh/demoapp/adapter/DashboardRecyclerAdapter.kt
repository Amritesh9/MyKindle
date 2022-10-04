package com.amritesh.demoapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.amritesh.demoapp.R

class DashboardRecyclerAdapter(val context: Context,val itemList: ArrayList<String>): RecyclerView.Adapter<DashboardRecyclerAdapter.DashboardViewHolder>() {

    class DashboardViewHolder(view: View): RecyclerView.ViewHolder(view){
        val textView:TextView = view.findViewById(R.id.txtBookName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashboardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_dashboard_single_row,parent,false)

        return DashboardViewHolder(view)
    }

    override fun onBindViewHolder(holder: DashboardViewHolder, position: Int) {
        val text= itemList[position]
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}