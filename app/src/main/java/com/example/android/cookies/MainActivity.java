package com.example.android.cookies;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        TextView statusText = (TextView) findViewById(R.id.status_text_view);
        statusText.setText("I'm So FULL!");

        // TODO: Find a reference to the TextView in the layout. Change the text.
        ImageView Cookie = (ImageView) findViewById(R.id.android_cookie_image_view);
        Cookie.setImageResource(R.drawable.after_cookie);
    }
}