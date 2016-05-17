package com.zgcw.wangqiang.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mbutton;
    private EditText meditext1,meditext2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    private void initUI() {
        mbutton = (Button) findViewById(R.id.button);
        meditext1 = (EditText) findViewById(R.id.editText);
        meditext2 = (EditText) findViewById(R.id.editText2);
    }
}
