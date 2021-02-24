package ru.startandroid.p0161dynamiclayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams layoutParams =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        setContentView(linearLayout, layoutParams);

        ViewGroup.LayoutParams lpParams =
                new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        LinearLayout.LayoutParams btn1Params =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        btn1Params.leftMargin = 50;

        LinearLayout.LayoutParams btn2Params =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        btn2Params.gravity = Gravity.RIGHT;

        TextView tv = new TextView(this);
        tv.setText("Text View");
        tv.setLayoutParams(lpParams);
        linearLayout.addView(tv);

        Button btn = new Button(this);
        btn.setText("Button");
        linearLayout.addView(btn, lpParams);

        Button btn1 = new Button(this);
        btn.setText("Button1");
        linearLayout.addView(btn1, btn1Params);

        Button btn2 = new Button(this);
        btn.setText("Button2");
        linearLayout.addView(btn2, btn2Params);


    }
}