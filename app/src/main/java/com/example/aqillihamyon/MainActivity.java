package com.example.aqillihamyon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomnavigationview);

      getSupportFragmentManager().beginTransaction().replace(R.id.linearlay,new Hamyon()).commit();

        // FIXME: 02.12.2020 uxaxaxaxaxa




        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){


                    case R.id.item1:
                        Toast.makeText(MainActivity.this, "Hamyon", Toast.LENGTH_SHORT).show();

                        getSupportFragmentManager().beginTransaction().replace(R.id.linearlay,new Hamyon()).commit();

                        break;
                    case R.id.item2:
                        Toast.makeText(MainActivity.this, "Haftalik", Toast.LENGTH_SHORT).show();
                        getSupportFragmentManager().beginTransaction().replace(R.id.linearlay,new Haftalik()).commit();
                        break;
                    case R.id.item3:
                        Toast.makeText(MainActivity.this, "Oy", Toast.LENGTH_SHORT).show();
                        getSupportFragmentManager().beginTransaction().replace(R.id.linearlay,new Oylik()).commit();
                        break;

                }




                return true;
            }
        });

    }
}