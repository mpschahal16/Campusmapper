package in.garima.campusmapper;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class Maps1Activity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps1);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        Intent i = getIntent();
        mMap = googleMap;
        Bundle bundle = i.getExtras();
        String source = bundle.getString("U");
        String destination = bundle.getString("V");

        //b-110starts
        if (source.equals("B-110")) {
            if (destination.equals("B-110")) {
                Toast.makeText(Maps1Activity.this, "Source and Destination cant be same", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-101")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86974, 78.75725), new LatLng(28.86991, 78.75715))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:19.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-102")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86974, 78.75725), new LatLng(28.86988, 78.75717))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:17m,Time:15sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-103")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86974, 78.75725), new LatLng(28.86982, 78.75721))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:13m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-104")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86974, 78.75725), new LatLng(28.86982, 78.75721))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:18m,Time:18sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("b-105")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:16.4m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-106")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.86976, 78.7573))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:11.5m,Time:15sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-107")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.8698, 78.75736))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:15.7m,Time:25sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-109")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.86983, 78.75742))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:10.7m,Time:25sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("DL")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.86993, 78.75761))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:11m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-113")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86991, 78.75776))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:22.7m,Time:22sec", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-114")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86991, 78.75776))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:24.3m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-115")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:27.6m,Time:25sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-116")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.87003, 78.75769))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:30.8m,Time:36sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-117")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.87003, 78.75769))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:38.8m,Time:40sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-118")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.87008, 78.75765))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:40m,Time:30sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-119")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.87008, 78.75765))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:43.7m,Time:40sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-120")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87017, 78.75755))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:35.4m,Time:40sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("b-121")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.86982, 78.75739))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86982, 78.75739), new LatLng(28.87, 78.7572))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.7572), new LatLng(28.87009, 78.75737))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:22.6m,Time:35sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-122")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.86982, 78.75739))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86982, 78.75739), new LatLng(28.87, 78.7572))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.7572), new LatLng(28.87006, 78.7573))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:34.8m,Time:25sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-123")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.8699, 78.75755), new LatLng(28.86982, 78.75739))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86982, 78.75739), new LatLng(28.87, 78.7572))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:36m,Time:20sec ", Toast.LENGTH_SHORT).show();}
        }
        //b123starts
        else if (source.equals("B-123")) {
            if (destination.equals("b-123")) {
                Toast.makeText(Maps1Activity.this, "Source and Destination cant be same", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-101")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.86995, 78.75709))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75709), new LatLng(28.86991, 78.7575715))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:11.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-102")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.86995, 78.75709))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75709), new LatLng(28.86988, 78.75717))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:11.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-103")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.86995, 78.75709))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75709), new LatLng(28.86982, 78.75721))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:13.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-104")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.86995, 78.75709))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75709), new LatLng(28.86982, 78.75721))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:15.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-105")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.86995, 78.75709))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75709), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:15.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-106")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.86995, 78.75709))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75709), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line18 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86974, 78.75725), new LatLng(28.86976, 78.7573))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:18.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-107")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.86982, 78.75739))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86982, 78.7575739), new LatLng(28.8698, 78.75736))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:21.5m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-109")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.86982, 78.75739))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86982, 78.7575739), new LatLng(28.86982, 78.75739))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:22.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-110")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.86982, 78.75739))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86982, 78.7575739), new LatLng(28.8699, 78.75755))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:19.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-111")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.86982, 78.75739))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86982, 78.7575739), new LatLng(28.86993, 78.75761))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:23.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-113")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.86982, 78.75739))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86982, 78.7575739), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86991, 78.75776))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:31.5m,Time:15sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-114")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.86982, 78.75739))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86982, 78.7575739), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86991, 78.75776))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:33.5m,Time:30sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-115")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.86982, 78.75739))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86982, 78.7575739), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));

                Toast.makeText(Maps1Activity.this, "Distance:31.5m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-116")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87003, 78.75769))
                        .width(22)
                        .color(Color.YELLOW));

                Toast.makeText(Maps1Activity.this, "Distance:41.5m,Time:30sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-117")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87003, 78.75769))
                        .width(22)
                        .color(Color.YELLOW));

                Toast.makeText(Maps1Activity.this, "Distance:41.5m,Time:30sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-118")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87008, 78.75765))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:31.5m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-119")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87008, 78.75765))
                        .width(22)
                        .color(Color.YELLOW));

                Toast.makeText(Maps1Activity.this, "Distance:31.5m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-120")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87017, 78.75775))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:1.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-121")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87009, 78.75737))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:14.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-122")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.75709), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87006, 78.7573))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:11.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            }}
//b122starts
        else if (source.equals("B-122")) {
            if (destination.equals("B-122")) {
                Toast.makeText(Maps1Activity.this, "Source and Destination cant be same", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-101")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.86995, 78.75709))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75709), new LatLng(28.86991, 78.7575715))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:11.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-102")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.86995, 78.75709))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75709), new LatLng(28.86988, 78.75717))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:11.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-103")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.86995, 78.75709))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75709), new LatLng(28.86982, 78.75721))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:13.5m,Time:12sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-104")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.86995, 78.75709))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75709), new LatLng(28.86982, 78.75721))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:15.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-105")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.86995, 78.75709))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75709), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:15.5m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-106")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.86995, 78.75709))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75709), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line18 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86974, 78.75725), new LatLng(28.86976, 78.7573))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:18.5m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-107")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.87, 78.7572))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.7572), new LatLng(28.86892, 78.75739))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86892, 78.75739), new LatLng(28.8698, 78.75736))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:19.5m,Time:24sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-109")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.87, 78.7572))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.7572), new LatLng(28.86892, 78.75739))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86892, 78.75739), new LatLng(28.86983, 78.75742))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:21.5m,Time:15sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-110")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.87, 78.7572))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.7572), new LatLng(28.86892, 78.75739))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86892, 78.75739), new LatLng(28.8699, 78.75755))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:21.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("DL")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.87, 78.7572))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.7572), new LatLng(28.86892, 78.75739))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86892, 78.75739), new LatLng(28.86993, 78.75761))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:22.5m,Time:15sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-113")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.87013, 78.75747))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87013, 78.75747), new LatLng(28.86993, 78.75761))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86993, 78.75761), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line1 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(8.86999, 78.75772), new LatLng(28.86991, 78.75776))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:31.5m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-114")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.87013, 78.75747))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87013, 78.75747), new LatLng(28.86993, 78.75761))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86993, 78.75761), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line1 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(8.86999, 78.75772), new LatLng(28.86991, 78.75776))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:31.5m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-115")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.87013, 78.75747))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87013, 78.75747), new LatLng(28.86993, 78.75761))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86993, 78.75761), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:31.5m,Time:30sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-116")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.87013, 78.75747))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87013, 78.75747), new LatLng(28.86993, 78.75761))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86993, 78.75761), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line9 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.87003, 78.75769))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:31.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-117")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.87013, 78.75747))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87013, 78.75747), new LatLng(28.86993, 78.75761))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86993, 78.75761), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line9 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.87003, 78.75769))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:31.5m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-118")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line9 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87013, 78.75762))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:31.5m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-119")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line9 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87013, 78.75762))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:41.5m,Time:30sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-120")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.75759), new LatLng(28.87017, 78.75775))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:11.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-121")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.75759), new LatLng(28.87009, 78.75737))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:11.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-123")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.75759), new LatLng(28.87, 78.7572))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:10.5m,Time:10sec ", Toast.LENGTH_SHORT).show();}}
//b121starts
        else if (source.equals("B-121")) {
            if (destination.equals("B-121")) {
                Toast.makeText(Maps1Activity.this, "Source and Destination cant be same", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-101")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87009, 78.75737), new LatLng(28.86998, 78.75712))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75712), new LatLng(28.86991, 78.7575715))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:11.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-102")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87009, 78.75737), new LatLng(28.86998, 78.75712))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75712), new LatLng(28.86988, 78.75717))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:11.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-103")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87009, 78.75737), new LatLng(28.86998, 78.75712))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75712), new LatLng(28.86982, 78.75721))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:13.5m,Time:12sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-104")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87009, 78.75737), new LatLng(28.86998, 78.75712))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75712), new LatLng(28.86982, 78.75721))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:15.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-105")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87009, 78.75737), new LatLng(28.86998, 78.75712))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75712), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:15.5m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-106")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87009, 78.75737), new LatLng(28.87, 78.7572))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.7572), new LatLng(28.86982, 78.75739))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line18 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86982, 78.75739), new LatLng(28.86976, 78.7573))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:18.5m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-107")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87009, 78.75737), new LatLng(28.87, 78.7572))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.7572), new LatLng(28.86982, 78.75739))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line18 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86982, 78.75739), new LatLng(28.8698, 78.75736))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:19.5m,Time:24sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-109")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87009, 78.75737), new LatLng(28.87, 78.7572))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.7572), new LatLng(28.86982, 78.75739))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line9 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86892, 78.75739), new LatLng(28.86983, 78.75742))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:21.5m,Time:15sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-110")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87009, 78.75737), new LatLng(28.87, 78.7572))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87, 78.7572), new LatLng(28.86982, 78.75739))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line1 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86892, 78.75739), new LatLng(28.8699, 78.75755))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:21.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("DL")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87009, 78.75737), new LatLng(28.87013, 78.75747))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87013, 78.75747), new LatLng(28.86993, 78.75761))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:22.5m,Time:15sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-113")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87009, 78.75737), new LatLng(28.87013, 78.75747))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87013, 78.75747), new LatLng(28.86993, 78.75761))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86993, 78.75761), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line1 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(8.86999, 78.75772), new LatLng(28.86991, 78.75776))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:31.5m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-114")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87009, 78.75737), new LatLng(28.87013, 78.75747))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87013, 78.75747), new LatLng(28.86993, 78.75761))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86993, 78.75761), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line1 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(8.86999, 78.75772), new LatLng(28.86991, 78.75776))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:31.5m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-115")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.87013, 78.75747))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87013, 78.75747), new LatLng(28.86993, 78.75761))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86993, 78.75761), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:31.5m,Time:30sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-116")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87003, 78.75769))
                        .width(22)
                        .color(Color.YELLOW));

                Toast.makeText(Maps1Activity.this, "Distance:31.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-117")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87003, 78.75769))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:31.5m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-118")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line9 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87008, 78.75765))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:31.5m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-119")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87006, 78.7573), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line1 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87008, 78.75765))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:41.5m,Time:30sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-120")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87009, 78.75737), new LatLng(28.87017, 78.75775))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:11.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-122")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87009, 78.75737), new LatLng(28.87006, 78.7573))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:7.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-123")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87009, 78.75737), new LatLng(28.87, 78.7572))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:10.5m,Time:20sec ", Toast.LENGTH_SHORT).show();}}
        //B-120starts
        else if (source.equals("B-120")) {
            if (destination.equals("B-120")) {
                Toast.makeText(Maps1Activity.this, "Source and Destination cant be same", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-119")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87008, 78.75765))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:2m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-118")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87008, 78.75765))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:3m,Time:25sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-117")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87003, 78.75769))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:7.5m,Time:30sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-116")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87003, 78.75769))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:9.5m,Time:45sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-115")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87002, 78.75777))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:12.5m,Time:50sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-114")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.86991, 78.75776))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:16.5m,Time:55sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-113")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.86991, 78.75776))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:20.5m,Time:60sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("DL")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line10 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86993, 78.75761))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:21m,Time:40sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-110")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line10 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86986, 78.75757))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:31.5m,Time:45sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-109")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line10 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.8698, 78.75745))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:37.5m,Time:55sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-107")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line10 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.8698, 78.75736))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:38m,Time:60sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-106")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line12 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86976, 78.7573))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:40m,Time:60sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-105")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line9 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:42m,Time:1min ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-121")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.87009, 78.75737))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:5.5m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-122")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.87006, 78.7573))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:18.5m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-123")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.87, 78.7572))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:10.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-101")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.86995, 78.75709))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75709), new LatLng(28.86991, 78.75715))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:17.5m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-102")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.86995, 78.75709))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75709), new LatLng(28.86988, 78.75717))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:17.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-103")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.86995, 78.75709))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75709), new LatLng(28.86982, 78.75721))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:19.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-104")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87017, 78.75755), new LatLng(28.86995, 78.75709))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86995, 78.75709), new LatLng(28.86982, 78.75721))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:21.5m,Time:25sec ", Toast.LENGTH_SHORT).show();}}

        //b119starts
        else if (source.equals("B-119")) {
            if (destination.equals("B-119")) {
                Toast.makeText(Maps1Activity.this, "Source and Destination cant be same", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-101")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.87019, 78.75759)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75759), new LatLng(28.86998, 78.75712)).width(22).color(Color.YELLOW));
                Polyline line22 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86998, 78.75712), new LatLng(28.86991, 78.75715)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:1.5m,Time:10sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-102")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.87019, 78.75759)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75759), new LatLng(28.86998, 78.75712)).width(22).color(Color.YELLOW));
                Polyline line22 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86998, 78.75712), new LatLng(28.86988, 78.75717)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:1m,Time:5sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-103")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.87019, 78.75759)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75759), new LatLng(28.86998, 78.75712)).width(22).color(Color.YELLOW));
                Polyline line22 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86998, 78.75712), new LatLng(28.86982, 78.75721)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:0.3m,Time:2sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-104")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86974, 78.75725), new LatLng(28.86982, 78.75721)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:2m,Time:8sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-105")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:16.4m,Time:20sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-106")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86976, 78.7573)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:21.5m,Time:25sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-107")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.8698, 78.75736)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:25.7m,Time:35sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-109")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86983, 78.75742)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:25.7m,Time:35sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-110")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.8699, 78.75755)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:41m,Time:50sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("DL")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86993, 78.75761)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:50.7m,Time:1min ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-113")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.86991, 78.75776)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:0.3m,Time:5sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-114")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.86991, 78.75776)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:57.6m,Time:1min 5sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-115")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:50.8m,Time:1min 46sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-116")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.87003, 78.75769)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:48.8m,Time:1min 40sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-117")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.87003, 78.75769)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:44m,Time:1min 30sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-118")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.87008, 78.75765)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:43.7m,Time:1min 20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-120")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.87019, 78.75759)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75759), new LatLng(28.87017, 78.75755)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:35.4m,Time:50sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-121")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.87019, 78.75759)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75759), new LatLng(28.87009, 78.75737)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:22.6m,Time:35sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-122")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.87019, 78.75759)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75759), new LatLng(28.87006, 78.7573)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:14.8m,Time:25sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-123")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.87019, 78.75759)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75759), new LatLng(28.87, 78.7572)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:6m,Time:10sec ", Toast.LENGTH_SHORT).show();}}

        //b-118starts
        else if (source.equals("B-118")) {
            if (destination.equals("B-118")) {
                Toast.makeText(Maps1Activity.this, "Source and Destination cant be same", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-101")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87008, 78.75765), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.86998, 78.75712))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line22 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86998, 78.75712), new LatLng(28.86991, 78.75715))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:1.5m,Time:10sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-102")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87008, 78.75765), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.86998, 78.75712))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line22 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86998, 78.75712), new LatLng(28.86988, 78.75717))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:1m,Time:5sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-103")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87008, 78.75765), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.86998, 78.75712))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line22 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86998, 78.75712), new LatLng(28.86982, 78.75721))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:0.3m,Time:2sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-104")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87008, 78.75765), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86974, 78.75725), new LatLng(28.86982, 78.75721))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:2m,Time:8sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-105")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87008, 78.75765), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:16.4m,Time:20sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-106")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87008, 78.75765), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86976, 78.7573))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:21.5m,Time:25sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-107")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87008, 78.75765), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.8698, 78.75736))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:25.7m,Time:35sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-109")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87008, 78.75765), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86983, 78.75742)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:25.7m,Time:35sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-110")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.8699, 78.75755)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:41m,Time:50sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("DL")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86993, 78.75761)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:50.7m,Time:1min ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-113")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.86991, 78.75776)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:0.3m,Time:5sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-114")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.86991, 78.75776)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:57.6m,Time:1min 5sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-115")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:50.8m,Time:1min 46sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-116")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.87003, 78.75769)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:48.8m,Time:1min 40sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-117")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.87003, 78.75769)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:44m,Time:1min 30sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-119")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.87008, 78.75765)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:43.7m,Time:1min 20sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-120")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.87019, 78.75759)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75759), new LatLng(28.87017, 78.75755)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:35.4m,Time:50sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-121")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.87019, 78.75759)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75759), new LatLng(28.87009, 78.75737)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:22.6m,Time:35sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-122")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.87019, 78.75759)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75759), new LatLng(28.87006, 78.7573)).width(22).color(Color.YELLOW));

                Toast.makeText(Maps1Activity.this, "Distance:14.8m,Time:25sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-123")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75765), new LatLng(28.87019, 78.75759)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75759), new LatLng(28.87, 78.7572)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:6m,Time:10sec ", Toast.LENGTH_SHORT).show();

            }
        }
        //b-113 starts
        else if (source.equals("B-113")) {
            if (destination.equals("B-113")) {
                Toast.makeText(Maps1Activity.this, "Source and Destination cant be same", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-101")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86974, 78.75725), new LatLng(28.86991, 78.75715))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:1.5m,Time:10sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-102")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86974, 78.75725), new LatLng(28.86988, 78.75717))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:1m,Time:5sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-103")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86974, 78.75725), new LatLng(28.86982, 78.75721))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:0.3m,Time:2sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-104")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86974, 78.75725), new LatLng(28.86982, 78.75721))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:2m,Time:8sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-105")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));

                Toast.makeText(Maps1Activity.this, "Distance:16.4m,Time:20sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-106")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86976, 78.7573))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:21.5m,Time:25sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-107")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.8698, 78.75736))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:25.7m,Time:35sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-109")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86983, 78.75742)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:25.7m,Time:35sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-110")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.8699, 78.75755)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:41m,Time:50sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("DL")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86993, 78.75761)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:50.7m,Time:1min ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-114")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.86991, 78.75776)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:0.3m,Time:5sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-115")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:57.6m,Time:1min 5sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-116")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.87003, 78.75769)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:50.8m,Time:1min 46sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-117")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.87003, 78.75769)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:48.8m,Time:1min 40sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-118")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.87008, 78.75765)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:44m,Time:1min 30sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-119")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.87008, 78.75765)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:43.7m,Time:1min 20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-120")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.87019, 78.75759)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75759), new LatLng(28.87017, 78.75755)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:35.4m,Time:50sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-121")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.87019, 78.75759)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75759), new LatLng(28.87009, 78.75737)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:22.6m,Time:35sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-122")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.87019, 78.75759)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75759), new LatLng(28.87006, 78.7573)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:14.8m,Time:25sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-123")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.87019, 78.75759)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75759), new LatLng(28.87, 78.7572)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:6m,Time:10sec ", Toast.LENGTH_SHORT).show();
            }}
        //b-114 starts
        else if (source.equals("B-114")) {
            if (destination.equals("B-114")) {
                Toast.makeText(Maps1Activity.this, "Source and Destination cant be same", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-101")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86974, 78.75725), new LatLng(28.86991, 78.75715)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:1.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-102")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86974, 78.75725), new LatLng(28.86988, 78.75717)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:1m,Time:5sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-103")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86974, 78.75725), new LatLng(28.86982, 78.75721)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:0.3m,Time:2sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-104")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86974, 78.75725), new LatLng(28.86982, 78.75721)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:2m,Time:8sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-105")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:16.4m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-106")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86976, 78.7573)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:21.5m,Time:25sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-107")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.8698, 78.75736)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:25.7m,Time:35sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-109")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86983, 78.75742)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:25.7m,Time:35sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-110")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.8699, 78.75755)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:41m,Time:50sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("DL")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86993, 78.75761)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:50.7m,Time:1min ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-113")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.86991, 78.75776)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:0.3m,Time:5sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-115")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.86999, 78.75772)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:57.6m,Time:1min 5sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-116")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.87003, 78.75769)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:50.8m,Time:1min 46sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-117")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.87003, 78.75769)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:48.8m,Time:1min 40sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-118")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.87008, 78.75765)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:44m,Time:1min 30sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-119")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.87008, 78.75765)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:43.7m,Time:1min 20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-120")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.87019, 78.75759)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75759), new LatLng(28.87017, 78.75755)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:35.4m,Time:50sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-121")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.87019, 78.75759)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75759), new LatLng(28.87009, 78.75737)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:22.6m,Time:35sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-122")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.87019, 78.75759)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75759), new LatLng(28.87006, 78.7573)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:14.8m,Time:25sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-123")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86991, 78.75776), new LatLng(28.87019, 78.75759)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75759), new LatLng(28.87, 78.7572)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:6m,Time:10sec ", Toast.LENGTH_SHORT).show();
            }}
        //b-115starts
        else if (source.equals("B-115")) {
            if (destination.equals("B-115")) {
                Toast.makeText(Maps1Activity.this, "Source and Destination cant be same", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-101")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86974, 78.75725), new LatLng(28.86991, 78.75715)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:1.5m,Time:10sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-102")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86974, 78.75725), new LatLng(28.86988, 78.75717)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:1m,Time:5sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-103")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86974, 78.75725), new LatLng(28.86982, 78.75721)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:0.3m,Time:2sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-104")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725)).width(22).color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86974, 78.75725), new LatLng(28.86982, 78.75721)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:2m,Time:8sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-105")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:16.4m,Time:20sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-106")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86976, 78.7573)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:21.5m,Time:25sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-107")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.8698, 78.75736)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:25.7m,Time:35sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-109")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86983, 78.75742)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:25.7m,Time:35sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-110")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.8699, 78.75755)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:41m,Time:50sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("DL")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86993, 78.75761)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:50.7m,Time:1min ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-113")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86991, 78.75776)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:0.3m,Time:5sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-114")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.86991, 78.75776)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:57.6m,Time:1min 5sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-116")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86999, 78.75772), new LatLng(28.87003, 78.75769)).width(22).color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:50.8m,Time:1min 46sec ", Toast.LENGTH_SHORT).show();
            } else if (destination.equals("B-117")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.87003, 78.75769))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:48.8m,Time:1min 40sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-118")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.87008, 78.75765))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:44m,Time:1min 30sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-119")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.87008, 78.75765))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:43.7m,Time:1min 20sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-120")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87017, 78.75755))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:35.4m,Time:50sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-121")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87009, 78.75737))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:22.6m,Time:35sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-122")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87006, 78.7573))
                        .width(22)
                        .color(Color.YELLOW));

                Toast.makeText(Maps1Activity.this, "Distance:14.8m,Time:25sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-123")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87, 78.7572))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:6m,Time:10sec ", Toast.LENGTH_SHORT).show();

            }
        }
        //b-116starts
        else if (source.equals("B-116")) {
            if (destination.equals("B-116")) {
                Toast.makeText(Maps1Activity.this, "Source and Destination cant be same", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-101")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.86998, 78.75712))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line22 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86998, 78.75712), new LatLng(28.86991, 78.75715))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:1.5m,Time:10sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-102")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.86998, 78.75712))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line22 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86998, 78.75712), new LatLng(28.86988, 78.75717))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:1m,Time:5sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-103")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.86998, 78.75712))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line22 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86998, 78.75712), new LatLng(28.86982, 78.75721))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:0.3m,Time:2sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-104")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86974, 78.75725), new LatLng(28.86982, 78.75721))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:2m,Time:8sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-105")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:16.4m,Time:20sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-106")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86976, 78.7573))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:21.5m,Time:25sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-107")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.8698, 78.75736))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:25.7m,Time:35sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-109")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86983, 78.75742))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:25.7m,Time:35sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-110")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.8699, 78.75755))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:41m,Time:50sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("DL")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86993, 78.75761))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:50.7m,Time:1min ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-113")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86991, 78.75776))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:0.3m,Time:5sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-114")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86991, 78.75776))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:57.6m,Time:1min 5sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-115")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:50.8m,Time:1min 46sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-117")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87003, 78.75769))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:48.8m,Time:1min 40sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-118")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87008, 78.75765))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:44m,Time:1min 30sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-119")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87008, 78.75765))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:43.7m,Time:1min 20sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-120")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87017, 78.75755))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:35.4m,Time:50sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-121")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87009, 78.75737))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:22.6m,Time:35sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-122")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87006, 78.7573))
                        .width(22)
                        .color(Color.YELLOW));

                Toast.makeText(Maps1Activity.this, "Distance:14.8m,Time:25sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-123")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87, 78.7572))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:6m,Time:10sec ", Toast.LENGTH_SHORT).show();

            }
        }
        //b-117starts
        else if (source.equals("B-117")) {
            if (destination.equals("B-117")) {
                Toast.makeText(Maps1Activity.this, "Source and Destination cant be same", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-101")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.86998, 78.75712))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line22 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86998, 78.75712), new LatLng(28.86991, 78.75715))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:1.5m,Time:10sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-102")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.86998, 78.75712))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line22 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86998, 78.75712), new LatLng(28.86988, 78.75717))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:1m,Time:5sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-103")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.86998, 78.75712))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line22 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86998, 78.75712), new LatLng(28.86982, 78.75721))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:0.3m,Time:2sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-104")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86974, 78.75725), new LatLng(28.86982, 78.75721))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:2m,Time:8sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-105")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86974, 78.75725))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:16.4m,Time:20sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-106")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86976, 78.7573))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:21.5m,Time:25sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-107")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.8698, 78.75736))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:25.7m,Time:35sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-109")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86983, 78.75742))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:25.7m,Time:35sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-110")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.8699, 78.75755))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:41m,Time:50sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("DL")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.86999, 78.75772), new LatLng(28.86993, 78.75761))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:50.7m,Time:1min ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-113")) {
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86991, 78.75776))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:0.3m,Time:5sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-114")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86991, 78.75776))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:57.6m,Time:1min 5sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-115")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.86999, 78.75772))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:50.8m,Time:1min 46sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-116")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87003, 78.75769))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:48.8m,Time:1min 40sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-118")) {
                Polyline line19 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87008, 78.75765))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:44m,Time:1min 30sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-119")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87008, 78.75765))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:43.7m,Time:1min 20sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-120")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87017, 78.75755))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:35.4m,Time:50sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-121")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87009, 78.75737))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:22.6m,Time:35sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-122")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87006, 78.7573))
                        .width(22)
                        .color(Color.YELLOW));

                Toast.makeText(Maps1Activity.this, "Distance:14.8m,Time:25sec ", Toast.LENGTH_SHORT).show();

            } else if (destination.equals("B-123")) {
                Polyline line20 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87003, 78.75769), new LatLng(28.87019, 78.75759))
                        .width(22)
                        .color(Color.YELLOW));
                Polyline line21 = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(28.87019, 78.75759), new LatLng(28.87, 78.7572))
                        .width(22)
                        .color(Color.YELLOW));
                Toast.makeText(Maps1Activity.this, "Distance:6m,Time:10sec ", Toast.LENGTH_SHORT).show();

            }
        }



        Polyline line = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86969, 78.75723), new LatLng(28.8698, 78.75745)).width(4).color(Color.BLACK));
        Polyline line1 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86969, 78.75723), new LatLng(28.86994, 78.75708)).width(4).color(Color.BLACK));
        Polyline line2 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86986, 78.75757), new LatLng(28.86993, 78.75769)).width(4).color(Color.BLACK));
        Polyline line3 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86993, 78.75769), new LatLng(28.86987, 78.75773)).width(4).color(Color.BLACK));
        Polyline line4 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86987, 78.75773), new LatLng(28.86992, 78.75784)).width(4).color(Color.BLACK));
        Polyline line5 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86992, 78.75784), new LatLng(28.87014, 78.7577)).width(4).color(Color.BLACK));
        Polyline line6 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87014, 78.7577), new LatLng(28.87019, 78.7578)).width(4).color(Color.BLACK));
        Polyline line7 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87018, 78.75767), new LatLng(28.87024, 78.75778)).width(4).color(Color.BLACK));
        Polyline line8 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87001, 78.75763), new LatLng(28.87011, 78.75756)).width(4).color(Color.BLACK));
        Polyline line9 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87032, 78.75773), new LatLng(28.87019, 78.75746)).width(4).color(Color.BLACK));
        Polyline line10 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87019, 78.75746), new LatLng(28.87025, 78.75742)).width(4).color(Color.BLACK));
        Polyline line11 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87016, 78.75741), new LatLng(28.87023, 78.75736)).width(4).color(Color.BLACK));
        Polyline line12 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87016, 78.75741), new LatLng(28.87, 78.75706)).width(4).color(Color.BLACK));
        Polyline line13 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86996, 78.75717), new LatLng(28.8698, 78.75727)).width(4).color(Color.BLACK));
        Polyline line14 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.8698, 78.75727), new LatLng(28.86984, 78.75734)).width(4).color(Color.BLACK));
        Polyline line15 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86987, 78.75739), new LatLng(28.86995, 78.75755)).width(6).color(Color.GREEN));
        Polyline line16 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.86995, 78.75755), new LatLng(28.87008, 78.75745)).width(6).color(Color.GREEN));
        Polyline line17 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87008, 78.75745), new LatLng(28.87, 78.75729)).width(6).color(Color.GREEN));
        Polyline line18 = mMap.addPolyline(new PolylineOptions().add(new LatLng(28.87, 78.75729), new LatLng(28.86987, 78.75739)).width(6).color(Color.GREEN));
        LatLng B101 = new LatLng(28.8699, 78.75711);
        mMap.addMarker(new MarkerOptions().position(B101).title("B-101").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B101));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(B101, 20));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(20));
        LatLng B102 = new LatLng(28.86991, 78.75721);
        mMap.addMarker(new MarkerOptions().position(B102).title("B-102").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B102));
        LatLng B103 = new LatLng(28.86984, 78.75725);
        mMap.addMarker(new MarkerOptions().position(B103).title("B-103").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B103));
        LatLng B104 = new LatLng(28.86981, 78.75716);
        mMap.addMarker(new MarkerOptions().position(B104).title("B-104").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B104));
        LatLng B105 = new LatLng(28.86973, 78.75722);
        mMap.addMarker(new MarkerOptions().position(B105).title("B-105").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B105));
        LatLng B106 = new LatLng(28.86974, 78.75732);
        mMap.addMarker(new MarkerOptions().position(B106).title("B-106").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B106));
        LatLng B107 = new LatLng(28.86984, 78.75733);
        mMap.addMarker(new MarkerOptions().position(B107).title("B-107").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B107));
        LatLng B109 = new LatLng(28.8698, 78.75745);
        mMap.addMarker(new MarkerOptions().position(B109).title("B-109").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B109));
        LatLng B110 = new LatLng(28.86986, 78.75757);
        mMap.addMarker(new MarkerOptions().position(B110).title("B-110").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B110));
        LatLng lib = new LatLng(28.8699, 78.75763);
        mMap.addMarker(new MarkerOptions().position(lib).title("DL").icon(BitmapDescriptorFactory.fromResource(R.drawable.lib1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lib));
        LatLng B113 = new LatLng(28.8699, 78.75771);
        mMap.addMarker(new MarkerOptions().position(B113).title("B-113").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B102));
        LatLng B114 = new LatLng(28.86995, 78.75782);
        mMap.addMarker(new MarkerOptions().position(B114).title("B-114").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B114));
        LatLng B115 = new LatLng(28.87002, 78.75777);
        mMap.addMarker(new MarkerOptions().position(B115).title("B-115").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B115));
        LatLng B116 = new LatLng(28.87007, 78.75774);
        mMap.addMarker(new MarkerOptions().position(B116).title("B-116").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B116));
        LatLng B117 = new LatLng(28.87003, 78.75762);
        mMap.addMarker(new MarkerOptions().position(B117).title("B-117").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B117));
        LatLng B118 = new LatLng(28.87008, 78.75759);
        mMap.addMarker(new MarkerOptions().position(B118).title("B-118").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B118));
        LatLng B119 = new LatLng(28.87012, 78.7577);
        mMap.addMarker(new MarkerOptions().position(B119).title("B-119").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B119));
        LatLng B121 = new LatLng(28.87014, 78.75735);
        mMap.addMarker(new MarkerOptions().position(B121).title("B-121").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B121));
        LatLng B120 = new LatLng(28.87022, 78.75752);
        mMap.addMarker(new MarkerOptions().position(B120).title("B-120").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B120));
        LatLng B122 = new LatLng(28.8701, 78.75727);
        mMap.addMarker(new MarkerOptions().position(B122).title("B-122").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B122));
        LatLng B123 = new LatLng(28.87006, 78.75717);
        mMap.addMarker(new MarkerOptions().position(B123).title("B-123").icon(BitmapDescriptorFactory.fromResource(R.drawable.c2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B123));
        LatLng entry1 = new LatLng(28.86998, 78.75706);
        mMap.addMarker(new MarkerOptions().position(entry1).title("Main Entrance").icon(BitmapDescriptorFactory.fromResource(R.drawable.gate)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(entry1));
        LatLng entry2 = new LatLng(28.87026, 78.75773);
        mMap.addMarker(new MarkerOptions().position(entry2).title("Entrance").icon(BitmapDescriptorFactory.fromResource(R.drawable.gate)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(entry2));
        LatLng entry3 = new LatLng(28.87018, 78.75744);
        mMap.addMarker(new MarkerOptions().position(entry3).title("EXIT").icon(BitmapDescriptorFactory.fromResource(R.drawable.gate)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(entry3));
        LatLng stairs1 = new LatLng(28.87017, 78.7577);
        mMap.addMarker(new MarkerOptions().position(stairs1).title("STAIRS").icon(BitmapDescriptorFactory.fromResource(R.drawable.stairs1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stairs1));
        LatLng st2 = new LatLng(28.86977, 78.75753);
        mMap.addMarker(new MarkerOptions().position(st2).title("STAIRS").icon(BitmapDescriptorFactory.fromResource(R.drawable.stairs1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(st2));
        LatLng court = new LatLng(28.86996, 78.75742);
        mMap.addMarker(new MarkerOptions().position(court).title("Court").icon(BitmapDescriptorFactory.fromResource(R.drawable.bad)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(court));
        Polyline a1 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87038, 78.75679), new LatLng(28.87065, 78.7573))
                .width(4)
                .color(Color.BLACK));
        Polyline a2 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87065, 78.7573), new LatLng(28.87034, 78.75752))
                .width(4)
                .color(Color.BLACK));

        Polyline a3 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87034, 78.75752), new LatLng(28.87008, 78.75701))
                .width(4)
                .color(Color.BLACK));
        Polyline a4 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87008, 78.75701), new LatLng(28.87038, 78.75679))
                .width(4)
                //.color(Color.RED));
                .color(Color.BLACK));
        Polyline d1 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87065, 78.75762), new LatLng(28.87041, 78.75781))
                .width(4)
                .color(Color.BLACK));
        Polyline d2 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87041, 78.75781), new LatLng(28.87049, 78.75797))
                .width(4)
                .color(Color.BLACK));
        Polyline d3 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87049, 78.75797), new LatLng(28.87077, 78.75782))
                .width(4)
                .color(Color.BLACK));
        Polyline d4 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87077, 78.75782), new LatLng(28.87065, 78.75762))
                .width(4)
                .color(Color.BLACK));
        Polyline c1 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87027, 78.75777), new LatLng(28.86999, 78.75798))
                .width(4)
                .color(Color.BLACK));
        Polyline c2 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.86999, 78.75798), new LatLng(28.87013, 78.75826))
                .width(4)
                .color(Color.BLACK));
        Polyline c3 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87013, 78.75826), new LatLng(28.87043, 78.75808))
                .width(4)
                .color(Color.BLACK));
        Polyline c4 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87027, 78.75777), new LatLng(28.87043, 78.75808))
                .width(4)
                .color(Color.BLACK));

        Polyline ph1 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87076, 78.75796), new LatLng(28.8702, 78.75834))
                .width(4)
                .color(Color.BLACK));

        Polyline ph2 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.8702, 78.75834), new LatLng(28.87029, 78.75853))
                .width(4)
                .color(Color.BLACK));

        Polyline ph3 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87029, 78.75853), new LatLng(28.87085, 78.75816))
                .width(4)
                .color(Color.BLACK));

        Polyline ph4 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87085, 78.75816), new LatLng(28.87076, 78.75796))
                .width(4)
                .color(Color.BLACK));


        Polyline arch1 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87131, 78.75792), new LatLng(28.87109, 78.75819))
                .width(4)
                .color(Color.BLACK));

        Polyline arch2 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87109, 78.75819), new LatLng(28.87148, 78.75866))
                .width(4)
                .color(Color.BLACK));

        Polyline arch3 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87148, 78.75866), new LatLng(28.87172, 78.75843))
                .width(4)
                .color(Color.BLACK));

        Polyline arch4 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87172, 78.75843), new LatLng(28.87131, 78.75792))
                .width(4)
                .color(Color.BLACK));
        Polyline ch1 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87173, 78.75852), new LatLng(28.87152, 78.75878))
                .width(4)
                .color(Color.BLACK));

        Polyline ch2 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87152, 78.75878), new LatLng(28.87168, 78.75904))
                .width(4)
                .color(Color.BLACK));

        Polyline ch3 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87168, 78.75904), new LatLng(28.87194, 78.75878))
                .width(4)
                .color(Color.BLACK));

        Polyline ch4 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87194, 78.75878), new LatLng(28.87173, 78.75852))
                .width(4)
                .color(Color.BLACK));
        Polyline m1 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87219, 78.75801), new LatLng(28.87184, 78.75838))
                .width(4)
                .color(Color.BLACK));

        Polyline m2 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87184, 78.75838), new LatLng(28.87212, 78.75876))
                .width(4)
                .color(Color.BLACK));

        Polyline m3 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87212, 78.75876), new LatLng(28.87249, 78.75836))
                .width(4)
                .color(Color.BLACK));

        Polyline m4 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(28.87249, 78.75836), new LatLng(28.87219, 78.75801))
                .width(4)
                .color(Color.BLACK));

/*
        LatLng A = new LatLng(28.87038, 78.75721);
        mMap.addMarker(new MarkerOptions().position(A).title("A-Block").icon(BitmapDescriptorFactory.fromResource(R.drawable.a)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));

        LatLng D = new LatLng(28.87041, 78.75781);
        mMap.addMarker(new MarkerOptions().position(D).title("D-Block").icon(BitmapDescriptorFactory.fromResource(R.drawable.d)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(D));

        LatLng ch = new LatLng(28.87172, 78.7588);
        mMap.addMarker(new MarkerOptions().position(ch).title("G-Block").icon(BitmapDescriptorFactory.fromResource(R.drawable.chem)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ch));

        LatLng h = new LatLng(28.8722, 78.75841);
        mMap.addMarker(new MarkerOptions().position(h).title("H-Block").icon(BitmapDescriptorFactory.fromResource(R.drawable.me)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(h));

        LatLng ar = new LatLng(28.87144, 78.75832);
        mMap.addMarker(new MarkerOptions().position(ar).title("ARCHITECHTURE").icon(BitmapDescriptorFactory.fromResource(R.drawable.arch)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ar));*/
    }
}
