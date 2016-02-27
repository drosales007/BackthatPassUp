package com.example.johnnycash.backthatpassup;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.File;

public class PlayDisplay extends AppCompatActivity {

    public static String EXTRA_MESSAGE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_display);
        getWindow().setStatusBarColor(Color.BLACK);
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        // Get the string representation of the image
        String message = getIntent().getStringExtra("message");
        EXTRA_MESSAGE = message;

        // Load the image
        ImageView img = (ImageView) findViewById(R.id.imageView);
        Context context = img.getContext();
        int id = context.getResources().getIdentifier(
                genImgString(EXTRA_MESSAGE), "drawable",
                context.getPackageName());
        img.setBackgroundResource(id);

        // Rotate the image to maximize screen usage
        //int angle = 90;
        //img.setRotation(angle);
    }

    public String genImgString(String message){
        // Method for generating the proper string to retrieve an image
        return message + "_virt";
    }
}
