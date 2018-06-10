package com.example.colton.magic8ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class Magic8Ball extends AppCompatActivity {

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magic8_ball);
    }
    public void onClickAlert(View view) {
        int min = 1;
        int max = 6;

        Random r = new Random();

        int clickCount = r.nextInt(max - min + 1) + min;
        TextView counter = (TextView) findViewById(R.id.clickCount);
        if (clickCount == 1){
            counter.setText("Go jump off the cliff");
        }
        if (clickCount == 2){
            counter.setText("Ask never again");
        }
        if (clickCount == 3){
            counter.setText("Quit your whinning");
        }
        if (clickCount == 4){
            counter.setText("I tell the truth sometimes");
        }
        if (clickCount == 5){
            counter.setText("Just put me down and let me collect dust again");
        }
        if (clickCount == 6){
            counter.setText("Like before, it will never happen");
        }
    }
}


