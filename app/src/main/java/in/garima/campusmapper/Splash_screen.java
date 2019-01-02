package in.garima.campusmapper;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.speech.tts.TextToSpeech;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

import java.util.Locale;


public class Splash_screen extends AppCompatActivity implements View.OnClickListener,TextToSpeech.OnInitListener {
    private static int SPLASH_TIME_OUT = 4500;
    private TextToSpeech tts;
    TextView teSpeech;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        tts = new TextToSpeech(getApplicationContext(), this);

        teSpeech=(TextView)findViewById(R.id.ts);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {


                Intent i = new Intent(Splash_screen.this, Main_Page.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);

    }

    @Override
    public void onClick(View view) {

        speakOut();
    }

    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {

            int result = tts.setLanguage(Locale.US);

            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
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
    @Override
    protected void onDestroy()
    {
        if(tts!=null)
        {
            tts.stop();
            tts.shutdown();
         //   Toast.makeText(Splash_screen.this,"Service Un-Binded",Toast.LENGTH_LONG).show();

        }
        super.onDestroy();
    }
}



