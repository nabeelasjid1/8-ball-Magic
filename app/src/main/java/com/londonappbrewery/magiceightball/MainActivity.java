package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askbtn;
        askbtn = findViewById(R.id.btnAsk);

        final ImageView ansImg = findViewById(R.id.AnsImage);

        askbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Magic8Ball", "Button Clicked");
                int[] array = {R.drawable.ball1,
                        R.drawable.ball2,
                        R.drawable.ball3,
                        R.drawable.ball4,
                        R.drawable.ball5};
                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(5);

                ansImg.setImageResource(array[number]);
            }
        });
    }
}
