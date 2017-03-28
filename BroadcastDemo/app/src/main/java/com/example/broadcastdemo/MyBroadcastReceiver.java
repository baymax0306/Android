package com.example.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){
        //Toast.makeText(context, "network changes", Toast.LENGTH_SHORT).show();
//            ConnectivityManager connectivityManager = (ConnectivityManager)
//                    getSystemService(Context.CONNECTIVITY_SERVICE);
//            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
//            if (networkInfo != null && networkInfo.isAvailable()){
//                 Toast.makeText(context, "network is available", Toast.LENGTH_SHORT).show();
//            } else {
//                Toast.makeText(context, "network is unavailable", Toast.LENGTH_SHORT).show();
//            }
//
//            String str = intent.toString();
//            if ("MY_BROADCAST" == intent.toString())
        Toast.makeText(context, "received in MyBroadcastReceiver", Toast.LENGTH_SHORT).show();
    }
}
