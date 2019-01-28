package com.example.gspl96.splashscreen_rotationanim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView=findViewById(R.id.imageid);

        final Animation ani= AnimationUtils.loadAnimation(getBaseContext(),R.anim.animations);
        final Animation ani2= AnimationUtils.loadAnimation(getBaseContext(),R.anim.abc_fade_out);
        imageView.setAnimation(ani);
        ani.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {



            }

            @Override
            public void onAnimationEnd(Animation animation) {

                imageView.startAnimation(ani2);

                finish();

                Intent bike=new Intent(getBaseContext(),MainActivity.class);
                startActivity(bike);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


    }
}
