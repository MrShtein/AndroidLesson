package ru.startandroid.p0102activitylistenenr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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

        okButton.setOnClickListener(this);
        cancelButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOk:
                textView.setText("Нажата кнопка OK");
                break;
            case R.id.btnCancel:
                textView.setText("Нажата кнопка Cancel");
        }
    }
}