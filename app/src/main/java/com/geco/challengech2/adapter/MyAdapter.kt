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
import com.geco.challengech2.data.MyData

class MyAdapter(private val context: Context, private val dataList: ArrayList<MyData>) :
    BaseAdapter() {

    private lateinit var image: ImageView
    private lateinit var judul: TextView
    private lateinit var jumlah: TextView

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
        var convertView = LayoutInflater.from(context).inflate(R.layout.list_in1_gojek, parent, false)
        image = convertView.findViewById(R.id.ivgo1)
        judul = convertView.findViewById(R.id.tvgo1)
        jumlah = convertView.findViewById(R.id.tvgo1jumlah)
        var data: MyData = dataList[position]
        image.setImageResource(data.photoId)
        judul.text = data.title
        jumlah.text = data.jumlah
        return convertView
    }

}