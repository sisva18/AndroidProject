package com.example.a5x5prototype;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((Button) findViewById(R.id.workouts)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WorkoutIntent();
            }
        });
        ((Button) findViewById(R.id.maxes)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MaxesIntent();
            }
        });

    }

    private void WorkoutIntent(){
        Intent intent=new Intent(this, WorkoutsActivity.class);
        startActivity(intent);
    }
    private void MaxesIntent(){
        Intent intent=new Intent(this, MaxesActivity.class);
        startActivity(intent);
    }

    private void finishActivity(){
        finish();
    }
}
