package com.example.sakshi.mocktest;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.support.v4.app.NotificationCompat;

/**
 * Created by sakshi on 8/12/2017.
 */

public class LowBattery extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
       
        //building notification
            NotificationCompat.Builder builder=new NotificationCompat.Builder(context);
        //setting icon to notification
            builder.setSmallIcon(R.mipmap.lowbattery);
        //setting title and content
            builder.setContentTitle("Low Battery ");
            builder.setContentText("Connect Your Device to a Charger");
            // NOTIFICATION
            NotificationManager notificationManager=(NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        //notify
            notificationManager.notify(0,builder.build());


    }
}
