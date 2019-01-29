package com.sandiplayek.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sandiplayek.customtoastlib.CustomToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String message = "Hello World";
        //CustomToast.getSuccessToast(MainActivity.this,message);
        //CustomToast.getErrorToast(MainActivity.this,message);
        //CustomToast.getInfoToast(MainActivity.this,message);
        //CustomToast.getQuestionToast(MainActivity.this,message);
        CustomToast.getWarningToast(MainActivity.this,message);
    }
}
