package ru.startandroid.p0091onclickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button okButton;
    Button cancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tvOut);
        okButton = findViewById(R.id.btnOk);
        cancelButton = findViewById(R.id.btnCancel);

        View.OnClickListener oclButtonOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Нажата кнопка ОК");
            }
        };

        View.OnClickListener oclButtonCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Нажата кнопка Cancel");
            }
        };

        okButton.setOnClickListener(oclButtonOk);
        cancelButton.setOnClickListener(oclButtonCancel);
    }
}