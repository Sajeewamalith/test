package com.tiffin8519.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView t2;
    Button b21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t2=(TextView)findViewById(R.id.a2t2);
        b21=(Button)findViewById(R.id.a2b1);



        Bundle b1=getIntent().getExtras();
        String s1=b1.getString("user");
        t2.setText(s1);

        Toast.makeText(this,"onStart Finished",Toast.LENGTH_SHORT).show();

        Log.i("Mainactivity","oncreate");

     }
     public void malith(View view){
         Intent i1= new Intent(this,MainActivity3.class);
         startActivity(i1);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart Finished",Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume Finished",Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause Finished",Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity","onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop Finished",Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart Finished",Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestory Finished",Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity","onDestory");
    }
}