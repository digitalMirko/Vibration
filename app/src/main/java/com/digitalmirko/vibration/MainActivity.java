package com.digitalmirko.vibration;

import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_short, btn_long;

    Vibrator vibrator;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_short = (Button) findViewById(R.id.btn_short);
        btn_long = (Button) findViewById(R.id.btn_long);

        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        btn_short.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            // vibrate in ms
                vibrator.vibrate(50);
            }
        });

        btn_long.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            // vibrate in ms
               vibrator.vibrate(500);
            }
        });
    }
}
