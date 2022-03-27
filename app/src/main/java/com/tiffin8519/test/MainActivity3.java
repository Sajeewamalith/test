package com.tiffin8519.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void saj(View view){
        switch(view.getId()) {
            case R.id.a3b1:
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(i1);
                break;

            case R.id.a3b2:
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"));
                startActivity(i2);
                break;

            case R.id.a3b3:
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:"));
                startActivity(i3);

                break;
        }
    }
    public void lith(View view) {
        Intent i1 = new Intent(this, MainActivity4.class);
        startActivity(i1);
    }

}