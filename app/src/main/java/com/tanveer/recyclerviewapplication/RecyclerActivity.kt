package com.tanveer.recyclerviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.tanveer.recyclerviewapplication.databinding.ActivityMainBinding

class
RecyclerActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
   var DetailArray = arrayListOf<DetailDataClass>(DetailDataClass("Ram",1,"Computer Science"))
   private var detailClass = DetailClass(DetailArray)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        var linearLayoutManager = LinearLayoutManger(
            this,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        binding?.btnRecycler?.layoutManager = linearLayoutMnager
        binding?.btnRecycler?.adapter = DetailClass
    }
}