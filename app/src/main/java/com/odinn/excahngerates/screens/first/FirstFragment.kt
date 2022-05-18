package com.odinn.excahngerates.screens.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.odinn.excahngerates.R
import com.odinn.excahngerates.data.repository.Repository
import com.odinn.excahngerates.model.Curr
import kotlinx.android.synthetic.main.fragment_first.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FirstFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: FirstAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val viewModel = ViewModelProvider(this).get(FirstViewModel::class.java)
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        recyclerView = view.rv_first
        adapter = FirstAdapter()
        recyclerView.adapter = adapter
        viewModel.getCurrency().observe(viewLifecycleOwner, Observer {
            it?.let {
                adapter.setList(it.Valute)
            }
        })

        return view
    }

}