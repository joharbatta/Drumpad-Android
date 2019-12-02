package com.example.android.drumpad_jb;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int[] colors={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button one = findViewById(R.id.one);
//        Button eight = findViewById(R.id.eight);
//        Button seven = findViewById(R.id.seven);
//        Button six = findViewById(R.id.six);
//        Button five = findViewById(R.id.five);
//        Button four = findViewById(R.id.four);
//        Button three = findViewById(R.id.three);




    }
            public void onClick(View v) {
                int ran=(int)Math.round(Math.random()*(colors.length-1));
            int id=v.getId();
                YoYo.with(Techniques.Shake)
                        .duration(700)
                        .repeat(5)
                        .playOn(v);
                switch(id)
                {
                    case R.id.one:
//                        YoYo.with(Techniques.BounceIn)
//                                .duration(700)
//                                .repeat(5)
//                                .playOn(R.id.);
                                    MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.one);
                                      ring.start();
                                      findViewById(v.getId()).setBackgroundResource(colors[ran]);
                        YoYo.with(Techniques.BounceIn)
                                .duration(400)
                                .repeat(5)
                                .playOn(v);
                  break;
                    case R.id.two:
                                        MediaPlayer ring1= MediaPlayer.create(MainActivity.this,R.raw.two);
                                        ring1.start();
                        findViewById(v.getId()).setBackgroundResource(colors[ran]);
                        YoYo.with(Techniques.RubberBand)
                                .duration(400)
                                .repeat(5)
                                .playOn(v);
                  break;
                    case R.id.three:

                        MediaPlayer ring2= MediaPlayer.create(MainActivity.this,R.raw.three);
                        ring2.start();
                        findViewById(v.getId()).setBackgroundResource(colors[ran]);
                        break;
                    case R.id.four:

                        MediaPlayer ring3= MediaPlayer.create(MainActivity.this,R.raw.four);
                        ring3.start();
                        findViewById(v.getId()).setBackgroundResource(colors[ran]);
                        break;
                    case R.id.five:

                        MediaPlayer ring4= MediaPlayer.create(MainActivity.this,R.raw.fv);
                        ring4.start();
                        findViewById(v.getId()).setBackgroundResource(colors[ran]);
                        break;
                    case R.id.six:

                        MediaPlayer ring5= MediaPlayer.create(MainActivity.this,R.raw.sixth);
                        ring5.start();
                        findViewById(v.getId()).setBackgroundResource(colors[ran]);
                        break;
                    case R.id.seven:

                        MediaPlayer ring6= MediaPlayer.create(MainActivity.this,R.raw.seventh);
                        ring6.start();
                        findViewById(v.getId()).setBackgroundResource(colors[ran]);
                        break;
                    case R.id.eight:

                        MediaPlayer ring7= MediaPlayer.create(MainActivity.this,R.raw.eighth);
                        ring7.start();
                        findViewById(v.getId()).setBackgroundResource(colors[ran]);
                        break;
                }
    }





//
}
