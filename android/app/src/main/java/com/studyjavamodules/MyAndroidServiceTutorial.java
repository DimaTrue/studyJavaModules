package com.studyjavamodules;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

public class MyAndroidServiceTutorial extends Service {
    private MediaPlayer player;
    private static final String CHANNEL_ID = "HEARTBEAT";
    private static final int SERVICE_NOTIFICATION_ID = 12345;

//    private Handler handler = new Handler();
//
//    private Runnable runnableCode = new Runnable() {
//        @Override
//        public void run() {
//            Context context = getApplicationContext();
//            Intent myIntent = new Intent(context, MyAndroidServiceTutorial.class);
//            context.startService(myIntent);
//            player = MediaPlayer.create(context, R.raw.zapsplat_vehicles_submarine_sonar_ping_single_28800);
//            // player.setLooping(true);
//            player.start();
//            handler.postDelayed(this::run, 2000);
//        }
//    };

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        player = MediaPlayer.create(this, R.raw.zapsplat_vehicles_submarine_sonar_ping_single_28800);
        player.setLooping(true);
        player.start();

//
//        this.handler.post(this.runnableCode);
//        createNotificationChannel();
//        Intent notificationIntent = new Intent(this, MainActivity.class);
//        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent, PendingIntent.FLAG_CANCEL_CURRENT);
//        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID)
//                .setContentTitle("Heartbeat service")
//                .setContentText("Running...")
//                .setSmallIcon(R.mipmap.ic_launcher)
//                .setContentIntent(contentIntent)
//                .setOngoing(true)
//                .build();
//        startForeground(SERVICE_NOTIFICATION_ID, notification);
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        player.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
