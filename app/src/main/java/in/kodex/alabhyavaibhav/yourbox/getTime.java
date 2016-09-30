package in.kodex.alabhyavaibhav.yourbox;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class getTime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_time);
        final Button NextBtn = (Button) findViewById(R.id.Next);
        NextBtn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                final Calendar c = Calendar.getInstance();
                int hour = c.get(Calendar.HOUR_OF_DAY);
                int minute = c.get(Calendar.MINUTE);
                String time = String.valueOf(hour)+ String.valueOf(minute);
                Intent NextScreen = new Intent(getTime.this, getDate.class);
                Intent intent = getIntent();
                String size = intent.getStringExtra("Size");
                String food = intent.getStringExtra("Food");
                String seat = intent.getStringExtra("Size");
                NextScreen.putExtra("Food",food);
                NextScreen.putExtra("Size",size);
                NextScreen.putExtra("Seat",seat);
                NextScreen.putExtra("Time",time);
                startActivity(NextScreen);
            }

        });
    }
}
