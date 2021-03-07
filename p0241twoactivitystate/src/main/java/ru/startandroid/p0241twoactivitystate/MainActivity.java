package ru.startandroid.p0241twoactivitystate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "States";

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Main Activity: onCreate()");

        btn = findViewById(R.id.btnActTwo);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ActivityTwo.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "Main activity: onRestart()");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "Main activity: onStart()");
        super.onStart();
    }

    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Main Activity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Main Activity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Main Activity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Main Activity: onDestroy()");
    }
}