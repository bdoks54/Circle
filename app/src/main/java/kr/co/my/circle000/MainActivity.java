package kr.co.my.circle000;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        EarthquakeView circle = new EarthquakeView(getBaseContext());
        setContentView(circle);
        circle.setMagnitude(7);
    }
}