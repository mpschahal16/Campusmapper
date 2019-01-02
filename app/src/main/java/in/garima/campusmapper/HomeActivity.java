package in.garima.campusmapper;

import android.content.DialogInterface;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class HomeActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener,View.OnClickListener,TextToSpeech.OnInitListener {

    Spinner source;
    Spinner destination;
    ArrayAdapter<CharSequence> adapter, adapter1;
    private TextToSpeech tts;
    TextView teSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tts = new TextToSpeech(HomeActivity.this, HomeActivity.this);

        teSpeech=(TextView)findViewById(R.id.ts);

        source = (Spinner) findViewById(R.id.spinner);
        //source.setOnItemSelectedListener(this);

        destination = (Spinner) findViewById(R.id.spinner2);
        // destination.setOnItemSelectedListener(this);
        adapter1 = ArrayAdapter.createFromResource(this, R.array.destination_arrays, R.layout.support_simple_spinner_dropdown_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        source.setAdapter(adapter1);

        adapter = ArrayAdapter.createFromResource(this, R.array.source_arrays, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        destination.setAdapter(adapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        // Toast.makeText(getApplicationContext(),source.getSelectedItemPosition(),Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(),destination.getSelectedItemPosition(),Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void back(View v) {
        Intent box = new Intent(HomeActivity.this, Main_Page.class);
        startActivity(box);
        finish();

    }

    public void exit(View v) {
        finish();

    }

    public void map(View v) {

        String Name = source.getSelectedItem().toString();
        String Name1 = destination.getSelectedItem().toString();
        if (Name == null && Name1 == null) {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Select Source And Destination");
            alertDialogBuilder.setIcon(R.mipmap.alert);
            alertDialogBuilder.setTitle("Incomplete Data");
            alertDialogBuilder.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {
                            Toast.makeText(HomeActivity.this, "You clicked Ok button", Toast.LENGTH_LONG).show();
                        }
                    });
            AlertDialog dialog = alertDialogBuilder.create();
            dialog.show();

        } else {
            String number = stripNonDigits(Name);
            if (number.length() == 0) {
                Intent i = new Intent(HomeActivity.this, Maps2Activity.class);
                i.putExtra("U", Name);
                i.putExtra("V", Name1);
                startActivity(i);
            } else {
                Integer num = Integer.parseInt(number);
                if (num <= 109 && num >= 101) {
                    Intent i = new Intent(HomeActivity.this, MapActivity.class);
                    i.putExtra("U", Name);
                    i.putExtra("V", Name1);
                    startActivity(i);
                } else if (num > 109 && num <= 123) {
                    Intent i = new Intent(HomeActivity.this, Maps1Activity.class);
                    i.putExtra("U", Name);
                    i.putExtra("V", Name1);
                    startActivity(i);
                }
            }
        }
    }
    public static String stripNonDigits(
            final CharSequence input ){
        final StringBuilder sb = new StringBuilder(
                input.length());
        for(int i = 0; i < input.length(); i++){
            final char c = input.charAt(i);
            if(c > 47 && c < 58){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    @Override
    public void onClick(View v) {

        String Name = source.getSelectedItem().toString();
        String Name1 = destination.getSelectedItem().toString();
        if (Name == null && Name1 == null) {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Select Source And Destination");
            alertDialogBuilder.setIcon(R.mipmap.alert);
            alertDialogBuilder.setTitle("Incomplete Data");
            alertDialogBuilder.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {
                            Toast.makeText(HomeActivity.this, "You clicked Ok button", Toast.LENGTH_LONG).show();
                        }
                    });


            AlertDialog dialog = alertDialogBuilder.create();
            dialog.show();

        }
    }

    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {

            int result = tts.setLanguage(Locale.US);

            if (result == TextToSpeech.LANG_MISSING_DATA
                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "This Language is not supported");
            } else {
                speakOut();
            }

        } else {
            Log.e("TTS", "Initilization Failed!");
        }

    }
    private void speakOut() {

        CharSequence text = teSpeech.getText();

        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null,"id1");
    }

}
