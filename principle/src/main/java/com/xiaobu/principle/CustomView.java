package com.xiaobu.principle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.xiaobu.principle.utils.Utils;

public class CustomView extends View {
    public static final String TAG = "CustomView+";

    public CustomView(Context context) {
        super(context);
        Log.d(TAG, "onLayout: "+this+hashCode());
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Log.d(TAG, "onLayout: "+this+hashCode());
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.d(TAG, "onLayout: "+this+hashCode());
    }

//    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }
public static int resolveWrapContentSize(int size, int measureSpec) {
    final int specMode = MeasureSpec.getMode(measureSpec);
    final int specSize = MeasureSpec.getSize(measureSpec);
    final int result;
    switch (specMode) {
        case MeasureSpec.AT_MOST:
            if (specSize < size) {
                result = specSize | MEASURED_STATE_TOO_SMALL;
            } else {
                result = size;
            }
            break;
        case MeasureSpec.EXACTLY:
            result = specSize;
            break;
        case MeasureSpec.UNSPECIFIED:
        default:
            result = size;
    }
    return result ;
}
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthMeasureSpecMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthMeasureSpecSize = MeasureSpec.getSize(widthMeasureSpec);
//        Log.d(TAG, MeasureSpec.AT_MOST+"onMeasure: widthMeasureSpecMode="+widthMeasureSpecMode
//        +"&widthMeasureSpecSize="+widthMeasureSpecSize);

//        ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
//        Log.d(TAG, "layoutParams.width:" + layoutParams.width);
//        resolveSize(200,MeasureSpec.AT_MOST);
//        super.onMeasure(resolveSize(layoutParams.width,widthMeasureSpec),
//                resolveSize(layoutParams.height,heightMeasureSpec));
        setMeasuredDimension(widthMeasureSpec,heightMeasureSpec);
        Log.d(TAG, "this.getWidth():" + this.getWidth());

    }



    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
//        Log.d(TAG, "onLayout:changed= " + changed + "&left=" + left + "&top=" + top + "&right+" + right + "&bottom+" + bottom);
        super.onLayout(changed, left, top, right, bottom);
        Log.d(TAG, "onLayout: "+this.getWidth());
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.GREEN);
    }
}
