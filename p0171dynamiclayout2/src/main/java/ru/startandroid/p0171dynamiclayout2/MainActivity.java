package ru.startandroid.p0171dynamiclayout2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText;
    Button createBtn;
    Button clearBtn;
    LinearLayout layoutForNewComponents;
    RadioGroup rgGravity;

    int wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgGravity = findViewById(R.id.rgGravity);
        editText = findViewById(R.id.etName);
        layoutForNewComponents = findViewById(R.id.llMain);

        createBtn = findViewById(R.id.btnCreate);
        createBtn.setOnClickListener(this);

        clearBtn = findViewById(R.id.btnClear);
        clearBtn.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCreate:
                LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(
                        wrapContent, wrapContent);
                int btnGravity = Gravity.LEFT;
                switch (rgGravity.getCheckedRadioButtonId()) {
                    case R.id.rbLeft:
                        btnGravity = Gravity.LEFT;
                        break;
                    case R.id.rbCenter:
                        btnGravity = Gravity.CENTER_HORIZONTAL;
                        break;
                    case R.id.rbRight:
                        btnGravity = Gravity.RIGHT;
                        break;
                }
                lParams.gravity = btnGravity;

                Button btnNew = new Button(this);
                btnNew.setText(editText.getText().toString());
                layoutForNewComponents.addView(btnNew, lParams);
                editText.setText(null);

                break;
            case R.id.btnClear:
                layoutForNewComponents.removeAllViews();
                Toast.makeText(this, "Все удалено", Toast.LENGTH_LONG).show();
                break;
        }
    }
}