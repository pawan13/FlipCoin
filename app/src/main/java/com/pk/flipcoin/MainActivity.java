package com.pk.flipcoin;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView_coin;
    Button btn_flip;
    int flipNuber;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView_coin = findViewById(R.id.imageView_coin);
        btn_flip = findViewById(R.id.button_flip);
        r = new Random();

        flipNuber = r.nextInt(1) + 1;
        btn_flip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flipNuber == 0){
                    imageView_coin.setImageResource(R.drawable.head);
                }else if(flipNuber == 1){
                    imageView_coin.setImageResource(R.drawable.tail);
                }
            }
        });

    }
}
