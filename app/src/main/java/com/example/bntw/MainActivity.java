package com.example.bntw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.imageView);
    }
    public void showFacebook(View view){
        imageView.setImageResource(R.drawable.facebook);
    }
    public void showTwitter(View view){
        imageView.setImageResource(R.drawable.twitter);
    }
    public void showInstagram(View view){
        imageView.setImageResource(R.drawable.instagram);
    }
    public void showPinterest(View view){
        imageView.setImageResource(R.drawable.pinterest);
    }
}