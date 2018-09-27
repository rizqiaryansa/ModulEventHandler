package com.mobile.asprak.moduleventhandler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnClear;
    EditText edtResult;
    private String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initId();

        setListener();
    }

    private void initId() {
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnClear = findViewById(R.id.btnClear);
        edtResult = findViewById(R.id.edtResult);
    }

    private void setListener() {
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = "";
                setResult(result);
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn0:
                result += btn0.getText();
                setResult(result);
                break;
            case R.id.btn1:
                result += btn1.getText();
                setResult(result);
                break;
            case R.id.btn2:
                result += btn2.getText();
                setResult(result);
                break;
            case R.id.btn3:
                result += btn3.getText();
                setResult(result);
                break;
            case R.id.btn4:
                result += btn4.getText();
                setResult(result);
                break;
            case R.id.btn5:
                result += btn5.getText();
                setResult(result);
                break;
            case R.id.btn6:
                result += btn6.getText();
                setResult(result);
                break;
            case R.id.btn7:
                result += btn7.getText();
                setResult(result);
                break;
            case R.id.btn8:
                result += btn8.getText();
                setResult(result);
                break;
            case R.id.btn9:
                result += btn9.getText();
                setResult(result);
                break;
        }
    }

    private void setResult(String result) {
        if(!TextUtils.isEmpty(result)) {
            edtResult.setText(result);
        } else {
            edtResult.setText(result);
        }
    }
}
