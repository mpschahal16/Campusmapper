package in.garima.campusmapper;

import android.*;
import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Latlong1Activity extends AppCompatActivity  implements View.OnClickListener {

    Button start1;
    Button stop;
    EditText class1;
    EditText alt;
    TextView textView1, textView2,textView3;
    LocationManager lm;
    String lat,longi;
    String altitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latlong1);

        alt= (EditText)findViewById(R.id.editText1);
        alt.setOnClickListener(this);

        start1 = (Button) findViewById(R.id.start1);
        start1.setOnClickListener(this);

        stop = (Button) findViewById(R.id.stop);
        stop.setOnClickListener(this);

        class1 = (EditText) findViewById(R.id.class1);
        class1.setOnClickListener(this);

        textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setOnClickListener(this);

        textView2 = (TextView) this.findViewById(R.id.textView2);
        textView2.setOnClickListener(this);

        textView3 = (TextView) this.findViewById(R.id.textView3);
        textView3.setOnClickListener(this);
        lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, new MyLocationListener());

    }
    class MyLocationListener implements LocationListener
    {

        @Override
        public void onLocationChanged(Location location) {
            lat = String.valueOf(location.getLatitude());
            longi= String.valueOf(location.getLongitude());

        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras)
        {


        }

        @Override
        public void onProviderEnabled(String provider)
        {
            Toast.makeText(Latlong1Activity.this, "GPS Enabled by:CAMPUS MAPPER", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onProviderDisabled(String provider) {
            Toast.makeText(Latlong1Activity.this, "GPS Disabled by:CAMPUS MAPPER", Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.start1) {
            Toast.makeText(Latlong1Activity.this, "LAT IS: " + lat+ "\nLONG IS: " + longi, Toast.LENGTH_SHORT).show();
            textView3.setText("LAT IS: " +lat );
            textView2.setText("LONG IS: " + longi );
            altitude= alt.getText().toString();

        }
        else if(view.getId()== R.id.stop) {

            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference("Latlong");
            DatabaseReference childRef = myRef.push();
            childRef.child("class").setValue(class1);
            childRef.child("altitude").setValue(altitude);
            childRef.child("lattitude").setValue(lat);
            childRef.child("longitude").setValue(longi);

            Toast.makeText(this," Details Saved", Toast.LENGTH_SHORT).show();



        }
    }
    public void back(View v) {
        Intent box = new Intent(Latlong1Activity.this, Main_Page.class);
        startActivity(box);
        finish();

    }

}




