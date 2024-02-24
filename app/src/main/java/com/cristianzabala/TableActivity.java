package com.cristianzabala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TableActivity extends AppCompatActivity {
    Button volver2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

    volver2 = findViewById(R.id.back2);

        volver2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view){
            Intent intent = new Intent(TableActivity.this, MainActivity.class);
            startActivity(intent);
        }
});
    }
}