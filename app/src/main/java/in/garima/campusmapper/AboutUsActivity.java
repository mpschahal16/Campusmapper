package in.garima.campusmapper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class AboutUsActivity extends AppCompatActivity {

    TextView t1, t2, t3, t4;
    TextView tv_long;
    //  private TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        TextView tv = (TextView) findViewById(R.id.tv_long);
        tv.setMovementMethod(new ScrollingMovementMethod());

        // tts = new TextToSpeech(AboutUsActivity.this,AboutUsActivity.this);
        TextView t1 = (TextView) findViewById(R.id.t1);
        TextView t2 = (TextView) findViewById(R.id.t2);
        TextView t3 = (TextView) findViewById(R.id.t3);
        TextView t4 = (TextView) findViewById(R.id.t4);

    }

    public void back(View v) {
        Intent box = new Intent(AboutUsActivity.this, Main_Page.class);
        startActivity(box);
        finish();

    }

    public void exit(View v) {
        finish();

    }
}

 /*   @Override
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

        CharSequence text = t1.getText();
        CharSequence text1 = tv_long.getText();
        CharSequence text2 = t2.getText();
        CharSequence text3 = t3.getText();
        CharSequence text4 = t4.getText();

        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, "id1");
        tts.speak(text1, TextToSpeech.QUEUE_FLUSH, null, "id1");
        tts.speak(text2, TextToSpeech.QUEUE_FLUSH, null, "id1");
        tts.speak(text3, TextToSpeech.QUEUE_FLUSH, null, "id1");
        tts.speak(text4, TextToSpeech.QUEUE_FLUSH, null, "id1");

    }
}


*/