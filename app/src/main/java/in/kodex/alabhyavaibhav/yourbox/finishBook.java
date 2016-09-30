package in.kodex.alabhyavaibhav.yourbox;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class finishBook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_book);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent NextScreen=new Intent(finishBook.this,complete.class);
                startActivity(NextScreen);
                Intent intent = getIntent();
                String size = intent.getStringExtra("Size");
                String food = intent.getStringExtra("Food");
                String seat = intent.getStringExtra("Size");
                String time = intent.getStringExtra("Time");
                String date = intent.getStringExtra("Date");
                String data = size + food + seat + time + date;

            }
        }, 3000);
    }
}
