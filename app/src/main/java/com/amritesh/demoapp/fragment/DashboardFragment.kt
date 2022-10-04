package com.amritesh.demoapp.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.amritesh.demoapp.R
import com.amritesh.demoapp.adapter.DashboardRecyclerAdapter


class DashboardFragment : Fragment() {


    lateinit var recyclerDashboard: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager

    val bookList = arrayListOf(
        "P.S. I love You",
        "The Great Gatsby",
        "Anna Kereninn",
        "Madame Bovary",
        "War and Peace",
        "Lolita",
        "Middlemarch",
        "The Adventures of Huckleberry Finn",
        "Moby-Dick",
        "The Lord of the Rings"
    )
    lateinit var recyclerAdapter: DashboardRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(
            R.layout.fragment_dashboard,
            container, false
        )
        recyclerDashboard = view.findViewById(R.id.recyclerDashboard)

        layoutManager = LinearLayoutManager(activity)

        recyclerAdapter = DashboardRecyclerAdapter(activity as Context, bookList)

        recyclerDashboard.adapter = recyclerAdapter

        recyclerDashboard.layoutManager = layoutManager

        return view
    }


}