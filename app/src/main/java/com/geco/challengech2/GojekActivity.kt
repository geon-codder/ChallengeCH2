package com.geco.challengech2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geco.challengech2.adapter.MyAdapter
import com.geco.challengech2.data.MyData
import com.geco.challengech2.adapter.Adapter
import com.geco.challengech2.data.MenuData


class GojekActivity : AppCompatActivity()  {
//
//    private lateinit var binding: ActivityGojekBinding
    var arrayList: ArrayList<MyData> = ArrayList()
    var arrayMenuDataList: ArrayList<MenuData> = ArrayList()
    var adapter: MyAdapter? = null
    var adapters: Adapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(binding.root)
        setContentView(R.layout.activity_gojek)
        arrayList.add(MyData(R.drawable.go_gopay_logo, "gopay", "Rp 150000"))
        arrayList.add(MyData(R.drawable.go_gopaylater_icon, "gopaylater", "Pesan sekarang, bayar akhir bulan"))
        arrayList.add(MyData(R.drawable.go_gocoins_icon, "gopay coins", "8"))

        arrayMenuDataList.add(MenuData(R.drawable.go_goride_icon, "GoRide"))
        arrayMenuDataList.add(MenuData(R.drawable.go_gocar_icon, "GoCar"))
        arrayMenuDataList.add(MenuData(R.drawable.go_gofood_icon, "GoFood"))
        arrayMenuDataList.add(MenuData(R.drawable.go_gosend_icon, "GoSend"))
        arrayMenuDataList.add(MenuData(R.drawable.go_gomart_icon, "GoMart"))
        arrayMenuDataList.add(MenuData(R.drawable.go_gopulsa_icon, "GoPulsa"))
        arrayMenuDataList.add(MenuData(R.drawable.go_checkin_icon, "Check in"))
        arrayMenuDataList.add(MenuData(R.drawable.go_lainnya_icon, "Lainnya"))



        adapter = MyAdapter(this, arrayList)
//        binding.lv_gojek.adapter = adapter
        adapters = Adapter(this, arrayMenuDataList)
//        binding.gvData.adapter = adapter

    }
}