package com.example.task_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class CustomView2 extends View {

    Paint black;
    Path path;

    public CustomView2(Context context) {
        super(context);
        init();
    }

    public CustomView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }


    public void init()
    {
        black= new Paint(Paint.ANTI_ALIAS_FLAG);
        black.setColor(Color.BLUE);
        black.setTextSize(85);
        black.setStrokeWidth(10);
        path=new Path();
        black.setStyle(Paint.Style.STROKE);
    }

public void dr(Path p)
{
    path=p;
    postInvalidate();
}

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE, PorterDuff.Mode.CLEAR);
        canvas.drawPath(path,black);



    }
}
