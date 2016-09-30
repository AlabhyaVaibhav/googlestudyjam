package in.kodex.alabhyavaibhav.yourbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class screen1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);
        Button NextBtn = (Button)findViewById(R.id.Next);
        NextBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent NextScreen = new Intent(screen1.this,screen2.class);
                startActivity(NextScreen);
            }
        });

    }
}
