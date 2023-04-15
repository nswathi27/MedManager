<<<<<<< HEAD
package com.example.medmanager;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class App extends Application {
  public static final String CHANNEL_ID = "channel";

  @Override
  public void onCreate() {
    super.onCreate();

    //createNotificationChannels();
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
      NotificationChannel channel = new NotificationChannel(
              CHANNEL_ID,
              "MedManager notifications",
              NotificationManager.IMPORTANCE_HIGH
      );
      channel.setDescription("Medicine Reminder Channel");
      NotificationManager manager = getSystemService(NotificationManager.class);
      manager.createNotificationChannel(channel);
    }
  }

//  private void createNotificationChannels() {
//    if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
//      NotificationChannel channel = new NotificationChannel(CHANNEL_ID,"MedManager notifications", NotificationManager.IMPORTANCE_HIGH);
//      channel.setDescription("Medmanager notifications appear here");
//
//      NotificationManager manager = getSystemService(NotificationManager.class);
//      manager.createNotificationChannel(channel);
//    }
//  }
}
=======
package com.example.medmanager;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class App extends Application {
  public static final String CHANNEL_ID = "channel";

  @Override
  public void onCreate() {
    super.onCreate();

    createNotificationChannels();
  }

  private void createNotificationChannels() {
    if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
      NotificationChannel channel = new NotificationChannel(CHANNEL_ID,"MedManager notifications", NotificationManager.IMPORTANCE_HIGH);
      channel.setDescription("Medmanager notifications appear here");

      NotificationManager manager = getSystemService(NotificationManager.class);
      manager.createNotificationChannel(channel);
    }
  }
}
>>>>>>> e1554933036cee1d61654db8f1740e6932a7dbd1
