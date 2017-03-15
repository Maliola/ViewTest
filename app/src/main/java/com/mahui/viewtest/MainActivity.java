package com.mahui.viewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {
    Button btn = null;
    int x=0;
    int y=0;
    int rawx=0;
    int rawy=0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
        btn.setOnTouchListener(this);
    }

    public boolean onTouch(View view, MotionEvent event) {
        int eventaction = event.getAction();
        switch (eventaction) {
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                x=(int)event.getX();
                y=(int)event.getY();
                rawx=(int)event.getRawX();
                rawy=(int)event.getRawY();
                Log.d("-----------","getX="+x+"    getY="+y+"       "+"getRawX="+rawx+"   getRawY="+rawy);
                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        return false;
    }
}