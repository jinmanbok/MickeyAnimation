package com.httpman_bok.mickeyanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade (View view) {
        ImageView mickey = (ImageView) findViewById(R.id.mickey);
        mickey.animate()
                .translationXBy(1100f)
                .translationYBy(1100f)
                .rotationBy(3600)
                .setDuration(2000);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView mickey = (ImageView) findViewById(R.id.mickey);


        mickey.setTranslationX(-1100f);
        mickey.setTranslationY(-1100f);







    }
}
