package in.garima.campusmapper;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class PanicAlertActivity extends AppCompatActivity {

    /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panic_alert);
    }
}*/
    TextView tv1;
    LocationManager lm;
    String str;
    float loc1,loc2;
    //long str1;
    // Long str2;
    //Long str3;
    //Long str4;
    //Long str5;

    //  String loc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panic_alert);
        tv1=(TextView)findViewById(R.id.textView);
        lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, new PanicAlertActivity.MyLocationListener());

    }

    class MyLocationListener implements LocationListener {

        @Override
        public void onLocationChanged(Location location) {

            loc1= (float) location.getLatitude();
            loc2= (float) location.getLongitude();


            str = "My Current Location:\n LATITUDE=" +loc1
                    + "\n LONGITUDE="+loc2;




            // distance[0] is now the distance between these lat/lons in meters
            /*else if ((distance[0] < 20.0)) {

                str = "My Current Location:\n LATITUDE=" + location.getLatitude()
                        + "\n LONGITUDE=" + location.getLongitude();
                // tv1.setText(str1);}
            }

            tv1.setText(str);*/


            //  else  if (distance(lat,lon,currentLat,currentLon)<2.0){
            //do wh


            //startActivityForResult(box,REQUEST_CODE)

        }


        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {
            //    Toast.makeText(LocationActivity.this, "STATUS" +status, Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onProviderEnabled(String provider) {
            Toast.makeText(PanicAlertActivity.this, "GPS Enabled by:PANIC ALERT", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onProviderDisabled(String provider) {
            Toast.makeText(PanicAlertActivity.this, "GPS Disabled by:PANIC ALERT", Toast.LENGTH_SHORT).show();

        }


    }







//  Intent box = getIntent();
    //Bundle bundle = box.getExtras();

    //  loc =  bundle.getString("location");

    public void alert(View v) {

        String contact1 =  "9997869683";
        String contact2 =  "8006902994";
        String contact3 = "7037272222";
        String contact4 = "8266919730";
        String contact5 = "7351906128";


        if (str==null)
        {
            str="My Current Location:\n LATITUDE=28.87159587"
                    + "\n LONGITUDE=78.75685694";
        }
        tv1.setText(str);

        String smsBody = "I AM IN DANGER PLEASE HELP \t"+str;
        Intent smsIntent= new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:"+contact1+";"+contact2+";"+contact3+";"+contact4+";"+contact5));


        smsIntent.putExtra("sms_body", smsBody);
        startActivity(smsIntent);



    }
    public void back(View v)
    {
        Intent box = new Intent(PanicAlertActivity.this, Main_Page.class);
        startActivity(box);
        finish();

    }
    public void exit(View v)
    {
        finish();

    }


}









































  /*  TextView tv1,tv2;
    LocationManager lm;
    String str;
    float loc1,loc2;

    //  String loc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        tv1=(TextView)findViewById(R.id.textView);
        tv2=(TextView)findViewById(R.id.textView2);
        lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, new MessageActivity.MyLocationListener());

    }

    class MyLocationListener implements LocationListener {

        @Override
        public void onLocationChanged(Location location) {
            // double currentLat = location.getLatitude();
            //double currentLon = location.getLongitude();
            //double newlat = location.getLatitude();
            //double newlon = location.getLongitude();
            //float[] distance = new float[0];
            //Location.distanceBetween(newlat, newlon, currentLat, currentLon, distance);


          // ga if (str == null)

           // ga{
            loc1= (float) location.getLatitude();
            loc2= (float) location.getLongitude();


            //ga str = "My Current Location:\n LATITUDE=" + location.getLatitude()
                      //ga  + "\n LONGITUDE=" + location.getLongitude();
            str = "My Current Location:\n LATITUDE=" +loc1
             + "\n LONGITUDE="+loc2;

          /*  if (str==null)
            {
                str="My Current Location:\n LATITUDE=28.87035154"
                        + "\n LONGITUDE=78.75754559";
            }
            tv1.setText(str);*/
//ga}


//Intent box =new Intent(LocationActivity.this,MessageActivity.class);
// box.putExtra("loaction",str);
// startActivity(box);


// distance[0] is now the distance between these lat/lons in meters
            /*else if ((distance[0] < 20.0)) {

                str = "My Current Location:\n LATITUDE=" + location.getLatitude()
                        + "\n LONGITUDE=" + location.getLongitude();
                // tv1.setText(str1);}
            }

            tv1.setText(str);*/


//  else  if (distance(lat,lon,currentLat,currentLon)<2.0){
//do wh


//startActivityForResult(box,REQUEST_CODE)

//}
/*

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {
            //    Toast.makeText(LocationActivity.this, "STATUS" +status, Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onProviderEnabled(String provider) {
            Toast.makeText(MessageActivity.this, "GPS Enabled by:PANIC ALERT", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onProviderDisabled(String provider) {
            Toast.makeText(MessageActivity.this, "GPS Disabled by:PANIC ALERT", Toast.LENGTH_SHORT).show();

        }


    }







//  Intent box = getIntent();
    //Bundle bundle = box.getExtras();

    //  loc =  bundle.getString("location");

    public void alert(View v) {
        Intent box = getIntent();
        Bundle bundle = box.getExtras();
        String contact1 =  bundle.getString("A");
        String contact2 =  bundle.getString("B");
        String contact3 = bundle.getString("C");
        String contact4 = bundle.getString("D");
        String contact5 = bundle.getString("E");

        if (str==null)
        {
            str="My Current Location:\n LATITUDE=28.87159587"
                    + "\n LONGITUDE=78.75685694";
        }
        tv1.setText(str);



        // String contact[] = {contact1, contact2, contact3, contact4, contact5};

        String smsBody = "I AM IN DANGER PLEASE HELP \t"+str;

        //  Intent smsIntent = new Intent(Intent.ACTION_VIEW);
        Intent smsIntent= new Intent(Intent.ACTION_SENDTO,Uri.parse("smsto:"+contact1+";"+contact2+";"+contact3+";"+contact4+";"+contact5));

        // smsIntent.setType("vnd.android-dir/mms-sms");


        //smsIntent.putExtra("address", contact1);
        //smsIntent.putExtra("address", contact2);
        //  smsIntent.putExtra("address", contact3);
        // smsIntent.putExtra("address", contact4);
        // smsIntent.putExtra("address", contact5);

        smsIntent.putExtra("sms_body", smsBody);
       startActivity(smsIntent);





       /* Intent i = new Intent(Intent.ACTION_SEND, Uri.parse("sms:contact1"));
        i.putExtra("sms_body", "hello this is deveoped by Garima");
        startActivity(i);*/
//}
//}

