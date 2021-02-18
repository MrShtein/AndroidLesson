package ru.startandroid.p0101listener;

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

        View.OnClickListener buttonsHandler = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnOk:
                        textView.setText("Нажата кнопка OK");
                        break;
                    case R.id.btnCancel:
                        textView.setText("Нажата кнока Cancel");
                        break;
                }
            }
        };

        okButton.setOnClickListener(buttonsHandler);
        cancelButton.setOnClickListener(buttonsHandler);

    }
}