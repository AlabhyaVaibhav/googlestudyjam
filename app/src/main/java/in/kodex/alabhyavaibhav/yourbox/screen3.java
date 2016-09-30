package in.kodex.alabhyavaibhav.yourbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        Button FinishBtn = (Button)findViewById(R.id.finish);
        FinishBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent NextScreen = new Intent(screen3.this,LoginActivity.class);
                startActivity(NextScreen);
            }
        });
    }
}
