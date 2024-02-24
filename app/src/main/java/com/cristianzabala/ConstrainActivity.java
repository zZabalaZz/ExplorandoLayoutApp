package com.cristianzabala;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.cristianzabala.MainActivity;
import com.cristianzabala.R;

public class ConstrainActivity extends AppCompatActivity {
    Button volver1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        volver1 = findViewById(R.id.back2);

        volver1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(com.cristianzabala.ConstrainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}