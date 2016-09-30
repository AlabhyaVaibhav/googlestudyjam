package in.kodex.alabhyavaibhav.yourbox;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class getSizeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_size);
        popList();
        clickCallback();

    }

    private void clickCallback() {
        ListView listview = (ListView) findViewById(R.id.size);
        if (listview != null) {
            listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){

                @Override
                public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
                    TextView textview= (TextView) viewClicked;
                    String value = textview.getText().toString();
                    if (value.equals("Can not decide")){
                        Intent i = new Intent(getSizeActivity.this,getPeople.class);
                        startActivity(i);
                    }
                    else{
                        Intent i = new Intent(getSizeActivity.this,getFood.class);
                        i.putExtra("Size",value);

                        Toast.makeText(getSizeActivity.this,"Saved your preference",Toast.LENGTH_SHORT).show();
                        startActivity(i);
                    }
                }
            });
        }
    }

    private void popList() {
        String[] sizes = {"15x12", "10x8", "6x8", "12x12", "Can not decide"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list,sizes);
        ListView listview = (ListView) findViewById(R.id.size);
        listview.setAdapter(adapter);
    }
}
