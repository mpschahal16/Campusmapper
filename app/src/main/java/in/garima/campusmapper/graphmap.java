package in.garima.campusmapper;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.R.attr.startX;
import static android.R.attr.startY;

public class graphmap extends AppCompatActivity {
   /* private Paint paint = new Paint();
    int startX, startY, stopX, stopY;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphmap);
    }
}
  /*  private void init() {
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(1f);
    }
    public void onDraw(Canvas canvas) {
        onDraw(canvas);

        startX = 20;
        startY = 100;
        stopX = 140;
        stopY = 30;

        canvas.drawLine(startX, startY, stopX, stopY, paint);
    }
}*/
