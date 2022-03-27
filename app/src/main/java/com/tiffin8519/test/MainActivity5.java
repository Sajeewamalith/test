package com.tiffin8519.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        e1=(EditText)findViewById(R.id.et1);
        e2=(EditText)findViewById(R.id.et2);

        registerForContextMenu(e1);
        registerForContextMenu(e2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.m1 :
                Toast.makeText(this,"Click setting",Toast.LENGTH_SHORT).show();
                break;
            case R.id.m2:
                Toast.makeText(this,"Click mic",Toast.LENGTH_SHORT).show();
                break;
            case R.id.m3:
                Toast.makeText(this,"Click status",Toast.LENGTH_SHORT).show();
                break;

        }
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()){
            case R.id.et1:
                getMenuInflater().inflate(R.menu.edit_menu1,menu);
                break;
            case R.id.et2:
                getMenuInflater().inflate(R.menu.edit_menu2,menu);
                break;


        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.i1:
                 e1.setText("Sajeewa");            break;
            case R.id.i2:
                e1.setText("Yasiru");
                break;
            case R.id.s1:
                e2.setText("Malith");
                break;
            case R.id.s2:
                e2.setText("malaka");
                break;

        }

        return super.onContextItemSelected(item);
    }
    public  void ya(View view) {


        Intent i1 = new Intent(this, MainActivity6.class);
        startActivity(i1);
    }
}