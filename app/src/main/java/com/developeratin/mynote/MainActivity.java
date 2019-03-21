package com.developeratin.mynote;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.wang.avi.AVLoadingIndicatorView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout lv_loading;
    private AVLoadingIndicatorView avi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //untuk memangil loding
        lv_loading = findViewById(R.id.lv_loading);

        avi= findViewById(R.id.avi);
        avi.setIndicator("BallClipRotateMultipleIndicator");

        //proses splascreen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(MainActivity.this,home.class);
                startActivity(i);

                //finish berguna untuk mengakhiri activity
                finish();
            }

        }, 3000);
    }


}
