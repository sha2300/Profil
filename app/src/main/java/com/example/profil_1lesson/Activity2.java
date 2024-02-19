package com.example.profil_1lesson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    Button button;
    TextView surnames;
    TextView names;
    TextView patronymics;
    TextView agess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        button = findViewById(R.id.button);
        surnames = findViewById(R.id.surnameT);
        names = findViewById(R.id.nameT);
        patronymics = findViewById(R.id.patrT);
        agess = findViewById(R.id.ageT);
        Intent inte = getIntent();
        String surname = inte.getStringExtra("s");
        String name = inte.getStringExtra("n");
        String patr = inte.getStringExtra("p");
        String age = inte.getStringExtra("a");
        surnames.setText(surname);
        names.setText(name);
        patronymics.setText(patr);
        agess.setText(age);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Activity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}