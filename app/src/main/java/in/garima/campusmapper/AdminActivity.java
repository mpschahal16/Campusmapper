package in.garima.campusmapper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminActivity extends AppCompatActivity implements View.OnClickListener  {

        Button start;
        Intent i;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        }



@Override
public void onClick(View view) {

        Intent i = new Intent(AdminActivity.this, Latlong1Activity.class);
        startActivity(i);
        finish();
        }
        public void back(View v)
        {
                Intent box = new Intent(AdminActivity.this, Main_Page.class);
                startActivity(box);
                finish();

        }



}
