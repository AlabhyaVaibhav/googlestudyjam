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

public class getFood extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_perk);
        popList();
        clickCallback();


    }
    private void popList(){
        String[] food = {"Eco-Meal (starters + small coke)","Only Medium Coke","Dinner","Nothing"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,R.layout.list,food);
        ListView listview1 = (ListView) findViewById(R.id.foodPref);
        listview1.setAdapter(adapter1);

    }

    private void clickCallback() {
        ListView listview1 = (ListView) findViewById(R.id.foodPref);
               if (listview1 != null) {
            listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
                    TextView textview = (TextView) viewClicked;
                    final String Foodvalue = textview.getText().toString();
                    Toast.makeText(getFood.this, "Food & Seating Preferences Saved", Toast.LENGTH_SHORT).show();
                    final Button NextBtn = (Button) findViewById(R.id.Next);
                    NextBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent NextScreen = new Intent(getFood.this, getSeat.class);
                            Intent intent = getIntent();
                            String size = intent.getStringExtra("Size");
                            NextScreen.putExtra("Food",Foodvalue);
                            NextScreen.putExtra("Size",size);
                            startActivity(NextScreen);
                        }
                    });
                    }

            });
        }

    }
}
