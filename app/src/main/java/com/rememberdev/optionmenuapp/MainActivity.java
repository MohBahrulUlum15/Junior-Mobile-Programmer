package com.rememberdev.optionmenuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem){
        if (menuItem.getItemId()==R.id.menu1){
            startActivity(new Intent(this, Menu1Activity.class));
        } else if (menuItem.getItemId()==R.id.menu2){
            startActivity(new Intent(this, Menu2Activity.class));
        } else if (menuItem.getItemId()==R.id.menu3){
            startActivity(new Intent(this, Menu3Activity.class));
        }
        return true;
    }
}