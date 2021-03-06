package com.sand_corporation.www.dragger2basicpart1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.sand_corporation.www.dragger2basicpart1.MyApplication.MyApplication;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject MyString myString;
    private TextView txtMyName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMyName = findViewById(R.id.txtMyName);

        ((MyApplication)getApplication()).getMyComponent().inject(MainActivity.this);

        txtMyName.setText(myString.myName());
    }
}
