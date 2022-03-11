package com.geco.challengech2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.geco.challengech2.R
import com.geco.challengech2.data.MenuData


class Adapter (private val context: Context, private val dataList: ArrayList<MenuData>) : BaseAdapter()  {
    private lateinit var image: ImageView
    private lateinit var judul: TextView

    override fun getCount(): Int {
        return dataList.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var convertView = LayoutInflater.from(context).inflate(R.layout.list_in2_gojek, parent, false)
        image = convertView.findViewById(R.id.menuikon)
        judul = convertView.findViewById(R.id.judulikon)

        var data: MenuData = dataList[position]
        image.setImageResource(data.ikon)
        judul.text = data.nama

        return convertView
    }

}
