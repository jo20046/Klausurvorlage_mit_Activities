package de.jo20046.klausurvorlage_mit_activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnActivity1 = (Button) findViewById(R.id.btn_activity1);
        Button btnActivity2 = (Button) findViewById(R.id.btn_activity2);
        Button btnActivity3 = (Button) findViewById(R.id.btn_activity3);
        Button btnActivity4 = (Button) findViewById(R.id.btn_activity4);
        Button btnActivity5 = (Button) findViewById(R.id.btn_activity5);

        btnActivity1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Activity1.class);
            startActivity(intent);
        });
        btnActivity2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            startActivity(intent);
        });
        btnActivity3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Activity3.class);
            startActivity(intent);
        });
        btnActivity4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Activity4.class);
            startActivity(intent);
        });
        btnActivity5.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Activity5.class);
            startActivity(intent);
        });
    }
}