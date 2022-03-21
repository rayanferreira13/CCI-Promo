package com.example.ecole2.vue;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.ecole2.R;

public class Formation2Activity extends RacineActivity {
    private static String TAG = "Formation2Activity";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formation2);
        Button btnVideo=(Button)findViewById(R.id.boutonVideoId);
        btnVideo.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {
                Log.i(TAG,"Bouton video");
                Intent intent = new Intent(Formation2Activity.this, VideoActivity.class);
                intent.putExtra("urlVideo", " ");
                startActivity(intent);
            }
        });
    }
}


