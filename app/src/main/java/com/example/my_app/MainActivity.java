package com.example.my_app;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    public Button commander;
    public Button warrior;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.open_screen);

        commander = (Button) findViewById(R.id.commandor_btn);
        warrior = (Button) findViewById(R.id.warrior_btn);


        commander.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, login_screen.class);
                startActivity(intent);
            }
        });

        warrior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_2 = new Intent(MainActivity.this, login_screen.class);
                startActivity(intent_2);
            }
        });
    }


}