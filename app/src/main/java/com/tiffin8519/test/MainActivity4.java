package com.tiffin8519.test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void li(View view){
        AlertDialog.Builder myalert= new AlertDialog.Builder(this);
        myalert.setTitle("Exit");
        myalert.setMessage("Are you sure?");
        myalert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                 finish();
            }
        });
        myalert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                 dialogInterface.dismiss();
            }
        });

        myalert.setCancelable(false);
        myalert.show();

    }
    public  void lit(View view){


            Intent i1 = new Intent(this, MainActivity5.class);
            startActivity(i1);





    }
}