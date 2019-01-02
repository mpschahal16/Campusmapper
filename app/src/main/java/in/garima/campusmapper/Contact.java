package in.garima.campusmapper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }
    public void back(View v)
    {
        Intent box = new Intent(Contact.this, Main_Page.class);
        startActivity(box);
        finish();

    }
    public void exit(View v)
    {
        finish();

    }

}
