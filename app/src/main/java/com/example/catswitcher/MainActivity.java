package com.example.catswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void switchCat(View view) {

        Log.i("info", "Button Pressed");

        ImageView imageView = (ImageView) findViewById(R.id.catImageView);
        imageView.setImageResource(R.drawable.cat2);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
