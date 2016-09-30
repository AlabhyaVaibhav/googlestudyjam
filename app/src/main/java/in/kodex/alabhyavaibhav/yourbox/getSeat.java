package in.kodex.alabhyavaibhav.yourbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class getSeat extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_seat);
        popList();
        clickCallback();

    }
    private void popList(){
        String[] seat= {"2 Couches", "4 Bean Bags","Sofa","chairs"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,R.layout.list,seat);
        ListView listview2 = (ListView) findViewById(R.id.SeatingPref);
        listview2.setAdapter(adapter2);
    }

    private void clickCallback() {

        ListView listview2 = (ListView) findViewById(R.id.SeatingPref);
        if (listview2 != null) {
            listview2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
                    TextView textview = (TextView) viewClicked;
                    final String SeatValue= textview.getText().toString();
                    Toast.makeText(getSeat.this, "Seating Preferences Saved", Toast.LENGTH_SHORT).show();
                    Button NextBtn = (Button) findViewById(R.id.Next);
                    NextBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent NextScreen = new Intent(getSeat.this, getTime.class);
                            Intent intent = getIntent();
                            String size = intent.getStringExtra("Size");
                            String food = intent.getStringExtra("Food");
                            NextScreen.putExtra("Food",food);
                            NextScreen.putExtra("Size",size);
                            NextScreen.putExtra("Seat",SeatValue);
                            startActivity(NextScreen);
                        }

                    });
                }

            });
        }

    }
}
