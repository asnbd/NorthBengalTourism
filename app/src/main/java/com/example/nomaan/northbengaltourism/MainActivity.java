package com.example.nomaan.northbengaltourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        long Delay = 3000;
        Timer runsTimer = new Timer();

        TimerTask shotTimerTask = new TimerTask() {
            @Override
            public void run() {
                finish();
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        };
        runsTimer.schedule(shotTimerTask, Delay);
    }
}
