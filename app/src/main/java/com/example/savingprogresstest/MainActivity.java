package com.example.savingprogresstest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main_activity);

            button = (Button) findViewById(R.id.btn_survey);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Survey();

                }
            });
        }

    public void Survey() {
        Intent intent = new Intent(this, Survey.class);
        startActivity(intent);
    }
}