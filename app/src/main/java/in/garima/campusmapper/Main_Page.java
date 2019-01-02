package in.garima.campusmapper;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.speech.RecognizerIntent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.MotionEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.data;
import static android.R.attr.id;

/*public class Main_Page extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener*/

public class Main_Page extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,OnClickListener {
    private NavigationView navigationView;
    private DrawerLayout drawer;
    private View navHeader;
    private FloatingActionButton fab;

    private static final String TAG_Home = "Home";
    private static final String TAG_Admin = "Admin";
    private static final String TAG_PanicAlert = "PanicAlert";
    private static final String TAG_About_us = "About_Us";
    private static final String TAG_Contact_us = "Contact_Us";
    public static String CURRENT_TAG = TAG_Home;

    ConnectivityManager connectivityManager;
    TextView tv, textView10, textView11, textView12, textView13;
    Button button9;
    ImageView button10, button11, button12, button13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__page);

        tv = (TextView) this.findViewById(R.id.tv);

        textView10 = (TextView) this.findViewById(R.id.textView10);
        textView10.setOnClickListener(this);

        textView11 = (TextView) this.findViewById(R.id.textView11);
        textView11.setOnClickListener(this);

        textView12 = (TextView) this.findViewById(R.id.textView12);
        textView12.setOnClickListener(this);

        textView13 = (TextView) this.findViewById(R.id.textView13);
        textView13.setOnClickListener(this);

        button9 = (Button) this.findViewById(R.id.button9);
        button9.setOnClickListener(this);

        button10 = (ImageView) this.findViewById(R.id.button10);
        button10.setOnClickListener(this);

        button11 = (ImageView) this.findViewById(R.id.button11);
        button11.setOnClickListener(this);

        button12 = (ImageView) this.findViewById(R.id.button12);
        button12.setOnClickListener(this);

        button13 = (ImageView) this.findViewById(R.id.button13);
        button13.setOnClickListener(this);

        connectivityManager = (ConnectivityManager) this.getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null)
            Toast.makeText(this, "Internet Connected", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Something went wrong..", Toast.LENGTH_SHORT).show();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main__page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // CURRENT_TAG = TAG_Home;
            startActivity(new Intent(Main_Page.this, HomeActivity.class));
            drawer.closeDrawers();


        } else if (id == R.id.nav_admin) {

            startActivity(new Intent(Main_Page.this, Latlong1Activity.class));
            drawer.closeDrawers();

        } else if (id == R.id.nav_panic) {

            startActivity(new Intent(Main_Page.this, PanicAlertActivity.class));
            drawer.closeDrawers();

        } else if (id == R.id.nav_about_us) {

            startActivity(new Intent(Main_Page.this, AboutUsActivity.class));
            drawer.closeDrawers();

        }/*else if (id == R.id.nav_contact) {

            startActivity(new Intent(Main_Page.this, Contact.class));
            drawer.closeDrawers();
        }*/


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1234 && resultCode == RESULT_OK) {
            ArrayList<String> arrayList = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            tv.setText(arrayList.get(0));
            {
                String str = tv.getText().toString();

                if (str.equals("panic alert") || (id == R.id.nav_panic)) {
                    startActivity(new Intent(Main_Page.this, PanicAlertActivity.class));
                    drawer.closeDrawers();
                }
                else if (str.equals("home")) {
                    startActivity(new Intent(Main_Page.this, HomeActivity.class));
                }
                else if (str.equals("coordinates")) {
                    startActivity(new Intent(Main_Page.this, Latlong1Activity.class));
                }
                else if (str.equals("about us")) {
                    startActivity(new Intent(Main_Page.this, AboutUsActivity.class));
                }
                else if (str.equals("contact")) {
                    startActivity(new Intent(Main_Page.this, Contact.class));
                }
            }
        }
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.button9) {
            Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
            intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Say Something...");
            startActivityForResult(intent, 1234);
        }
        else if (view.getId() == R.id.textView10) {
            Intent intent = new Intent(Main_Page.this, HomeActivity.class);
            startActivity(intent);
            finish();
        }
        else if (view.getId() == R.id.textView11) {
            Intent intent = new Intent(Main_Page.this, PanicAlertActivity.class);
            startActivity(intent);
            finish();
        }
        else if (view.getId() == R.id.textView12) {
            Intent intent = new Intent(Main_Page.this, AboutUsActivity.class);
            startActivity(intent);
            finish();
        }
        else if (view.getId() == R.id.textView13) {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Do you want to exit the application?");
            alertDialogBuilder.setTitle("Exit");
            alertDialogBuilder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface arg0, int arg1) {
                    Toast.makeText(Main_Page.this, "You clicked yes button", Toast.LENGTH_LONG).show();
                    finish();
                }
            });

            alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(Main_Page.this, "You clicked No button", Toast.LENGTH_LONG).show();

                }
            });
            AlertDialog dialog = alertDialogBuilder.create();
            dialog.show();
        }

        else if (view.getId() == R.id.button13) {
            Intent intent = new Intent(Main_Page.this, PanicAlertActivity.class);
            startActivity(intent);
            finish();
        }
        else if (view.getId() == R.id.button12) {
            Intent intent = new Intent(Main_Page.this, AboutUsActivity.class);
            startActivity(intent);
            finish();
        }
        else if (view.getId() == R.id.button11) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Do you want to exit the application?");
            alertDialogBuilder.setTitle("Exit");
            alertDialogBuilder.setPositiveButton("Yes",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {
                            Toast.makeText(Main_Page.this, "You clicked yes button", Toast.LENGTH_LONG).show();
                            finish();
                        }
                    });

            alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(Main_Page.this, "You clicked No button", Toast.LENGTH_LONG).show();

                }
            });
            AlertDialog dialog = alertDialogBuilder.create();
            dialog.show();
        }
        else if (view.getId() == R.id.button10) {
            Intent intent = new Intent(Main_Page.this, HomeActivity.class);
            startActivity(intent);
            finish();
        }
    }
}