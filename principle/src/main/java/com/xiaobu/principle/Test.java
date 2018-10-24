package com.xiaobu.principle;

import android.content.Context;
import android.content.Intent;

public class Test {
    public void test(Context context){
        context.startActivity(new Intent(context,PrincipleActivity.class));

    }
}
