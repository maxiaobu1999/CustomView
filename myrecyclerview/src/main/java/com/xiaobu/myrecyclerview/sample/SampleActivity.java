package com.xiaobu.myrecyclerview.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xiaobu.myrecyclerview.R;
import com.xiaobu.myrecyclerview.widget.DefaultItemAnimator;
import com.xiaobu.myrecyclerview.widget.LinearLayoutManager;
import com.xiaobu.myrecyclerview.widget.OrientationHelper;
import com.xiaobu.myrecyclerview.widget.RecyclerView;

public class SampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //设置布局管理器
        recyclerView.setLayoutManager(layoutManager);
        //设置为垂直布局，这也是默认的
        layoutManager.setOrientation(OrientationHelper.VERTICAL);
        //设置Adapter
//        recyclerView.setAdapter(recycleAdapter);
        //设置分隔线
//        recyclerView.addItemDecoration(new DividerGridItemDecoration(this));
        //设置增加或删除条目的动画
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
