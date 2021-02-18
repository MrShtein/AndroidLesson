package ru.startandroid.p0081viewbyid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String text = "This the text in new View";
        TextView myTextView = findViewById(R.id.myText);
        myTextView.setText(text);

        Button myButton = findViewById(R.id.myButton);
        myButton.setText("My text in myButton");
        myButton.setEnabled(false);

        CheckBox myChB = findViewById(R.id.myChb);
        myChB.setChecked(true);

    }
}