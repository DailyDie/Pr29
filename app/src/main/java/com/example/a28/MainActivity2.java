package com.example.a28;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

public class MainActivity2 extends AppCompatActivity
{
    private final Object Bundle;

    public MainActivity2(Object bundle) {
        Bundle = bundle;
    }

    @SuppressLint({"ClickableViewAccessibility", "SetTextI18n", "MissingSuperCall"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        GestureDetectorCompat lSwipeDetector;

        RelativeLayout main_layout;
        TextView tvTxt;
        int i;

        (Bundle), savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main3);

            i = 1;
            lSwipeDetector = new GestureDetectorCompat(this, new MyGestureListener());
            main_layout = (RelativeLayout) findViewById(R.id.main_layout);
            tvTxt = (TextView) findViewById(R.id.tvTxt);
            tvTxt.setText("" + i);

            main_layout.setOnTouchListener((v, event) -> lSwipeDetector.onTouchEvent(event));
        }

    }
}




