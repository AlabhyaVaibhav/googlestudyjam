package in.kodex.alabhyavaibhav.yourbox;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class complete extends AppCompatActivity {
    static int nid = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete);
        new Handler().postDelayed(new Runnable() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void run() {
                Notification.Builder b = new Notification.Builder(complete.this);
                b.setSmallIcon(R.drawable.pick);
                b.setContentTitle("Booking Confirmed");
                b.setContentText("All the items requested are accepted and your estimated cost will be 500");
                b.setAutoCancel(true);
                Notification m = b.build();
                String sname = Context.NOTIFICATION_SERVICE;
                NotificationManager nm= (NotificationManager)getSystemService(sname);
                m.defaults= Notification.DEFAULT_SOUND;
                nm.notify(++nid,m);
            }
        }, 5000);

    }
}
