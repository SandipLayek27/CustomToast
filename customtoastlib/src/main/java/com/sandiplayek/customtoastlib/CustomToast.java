package com.sandiplayek.customtoastlib;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToast extends Toast {

    public static TextView mToastMsg;
    public static View viewLayout;

    public CustomToast(Context context) {
        super(context);
    }

    public static void getSuccessToast(Context context, String message){
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        viewLayout=layoutInflater.inflate(R.layout.success_toast,null);
        mToastMsg=(TextView)viewLayout.findViewById(R.id.tv);
        mToastMsg.setText(message);
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.BOTTOM, 0, 50);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(viewLayout);
        toast.show();
    }

    public static void getErrorToast(Context context, String message){
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        viewLayout=layoutInflater.inflate(R.layout.error_toast,null);
        mToastMsg=(TextView)viewLayout.findViewById(R.id.tv);
        mToastMsg.setText(message);
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.BOTTOM, 0, 50);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(viewLayout);
        toast.show();
    }

    public static void getInfoToast(Context context, String message){
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        viewLayout=layoutInflater.inflate(R.layout.info_toast,null);
        mToastMsg=(TextView)viewLayout.findViewById(R.id.tv);
        mToastMsg.setText(message);
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.BOTTOM, 0, 50);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(viewLayout);
        toast.show();
    }

    public static void getQuestionToast(Context context, String message){
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        viewLayout=layoutInflater.inflate(R.layout.question_toast,null);
        mToastMsg=(TextView)viewLayout.findViewById(R.id.tv);
        mToastMsg.setText(message);
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.BOTTOM, 0, 50);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(viewLayout);
        toast.show();
    }

    public static void getWarningToast(Context context, String message){
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        viewLayout=layoutInflater.inflate(R.layout.warning_toast,null);
        mToastMsg=(TextView)viewLayout.findViewById(R.id.tv);
        mToastMsg.setText(message);
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.BOTTOM, 0, 50);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(viewLayout);
        toast.show();
    }
}
