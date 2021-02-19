package ru.start.android.p0121logsandmessages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button okBtn;
    Button cancelBtn;

    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Найдем View элементы");
        textView = findViewById(R.id.tvOut);
        okBtn = findViewById(R.id.btnOk);
        cancelBtn = findViewById(R.id.btnCancel);

        Log.d(TAG, "Устанавливаем обработчик нажатия кнопкам");
        okBtn.setOnClickListener(this);
        cancelBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOk:
                Log.d(TAG,"Нажата кнопка OK");
                textView.setText(R.string.tvOutOk);
                Toast.makeText(this, "Нажата кнопка Ок", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnCancel:
                Log.d(TAG,"Нажата кнопка Cancel");
                Toast.makeText(this, "Нажата кнопка Cancel", Toast.LENGTH_LONG).show();
                textView.setText(R.string.tvOutCan);
                break;
        }
    }
}