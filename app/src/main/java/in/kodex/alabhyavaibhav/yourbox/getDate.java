package in.kodex.alabhyavaibhav.yourbox;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class getDate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_date);
        Button NextBtn = (Button)findViewById(R.id.Next);
        NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePicker datePicker = (DatePicker) findViewById(R.id.DatePicker);
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth() + 1;
                int year = datePicker.getYear();
                String date = String.valueOf(day) + String.valueOf(month) + String.valueOf(year);
                Toast.makeText(getDate.this, "Almost Done", Toast.LENGTH_SHORT).show();
                Intent NextScreen = new Intent(getDate.this, finishBook.class);
                Intent intent = getIntent();
                String size = intent.getStringExtra("Size");
                String food = intent.getStringExtra("Food");
                String seat = intent.getStringExtra("Size");
                String time = intent.getStringExtra("Time");
                NextScreen.putExtra("Food", food);
                NextScreen.putExtra("Size", size);
                NextScreen.putExtra("Seat", seat);
                NextScreen.putExtra("Time", time);
                NextScreen.putExtra("Date", date);
                startActivity(NextScreen);
            }
        });
    }
}
