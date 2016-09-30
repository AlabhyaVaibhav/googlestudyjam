package in.kodex.alabhyavaibhav.yourbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

public class getPeople extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_people);
        Button nextBtn = (Button)findViewById(R.id.Next);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText humnan = (EditText) findViewById(R.id.people);
                String numb = humnan.getText().toString();
                Intent i = new Intent(getPeople.this,getFood.class);
                i.putExtra("People",numb);
                startActivity(i);
            }
        });
    }
}
