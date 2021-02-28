package ru.startandroid.p0191simplecalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final int MENU_RESET_ID = 1;
    final int MENU_QUIT_ID = 2;

    EditText num1;
    EditText num2;

    Button addBtn;
    Button subBtn;
    Button divBtn;
    Button mulBtn;

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.etNum1);
        num2 = findViewById(R.id.etNum2);

        addBtn = findViewById(R.id.btnAdd);
        addBtn.setOnClickListener(this);

        subBtn = findViewById(R.id.btnSub);
        subBtn.setOnClickListener(this);

        divBtn = findViewById(R.id.btnDiv);
        divBtn.setOnClickListener(this);

        mulBtn = findViewById(R.id.btnMult);
        mulBtn.setOnClickListener(this);

        result = findViewById(R.id.tvResult);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, MENU_RESET_ID, 0, "Reset");
        menu.add(0, MENU_QUIT_ID, 0, "Quit");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case MENU_RESET_ID:
                result.setText("");
                num1.setText("");
                num2.setText("");
                break;
            case MENU_QUIT_ID:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        float firstDigit = Float.parseFloat(num1.getText().toString());
        float secondDigit = Float.parseFloat(num2.getText().toString());
        float res = 0;

        switch (v.getId()) {
            case R.id.btnAdd:
                res = firstDigit + secondDigit;
                break;
            case R.id.btnSub:
                res = firstDigit - secondDigit;
                break;
            case R.id.btnMult:
                res = firstDigit * secondDigit;
                break;
            case R.id.btnDiv:
                if (secondDigit == 0) {
                    Toast.makeText(this, "На ноль делить нельзя", Toast.LENGTH_LONG).show();
                    break;
                }
                res = firstDigit / secondDigit;
                break;
            default:
                break;
        }
        result.setText("Ответ: " + res);
    }
}