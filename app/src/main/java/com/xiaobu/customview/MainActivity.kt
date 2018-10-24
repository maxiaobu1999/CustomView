package com.xiaobu.customview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.xiaobu.myrecyclerview.widget.RecyclerView
import com.xiaobu.principle.PrincipleActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun click_button(view:View) {
        startActivity(Intent(this,PrincipleActivity::class.java))
    }
}
