package com.tiffin8519.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  TextView t2;
  Button b1,b2;
  EditText et1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      t2=(TextView)findViewById(R.id.t2);
      b1=(Button)findViewById(R.id.b1);
      et1=(EditText)findViewById(R.id.edit1);
      b1.setOnClickListener(this);
    }
    public void onClick(View view) {t2.setText("click button 1");}

    public void doSomething(View v){
        t2.setText("click button 2");
    }
    public void doSome(View view){
        Intent i1= new Intent(this,MainActivity2.class);
        i1.putExtra("user",et1.getText().toString());
        startActivity(i1);
    }
}