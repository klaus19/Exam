package com.tejas.exam.dominika;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.tejas.exam.R;

public class Syllabus extends AppCompatActivity {

    private CardView cardViewQuantitative,cardViewReasoning,cardViewTechnical,cardViewMarathi;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_syllabus);


         cardViewQuantitative=findViewById(R.id.cardViewQuantitative);
         cardViewReasoning = findViewById(R.id.cardViewReasoning);
         cardViewTechnical = findViewById(R.id.cardViewTechnical);
         cardViewMarathi = findViewById(R.id.cardViewMarathi);

        cardViewQuantitative.setOnClickListener(view -> {
            Intent aptitude = new Intent(Syllabus.this, Arithmetic.class);
            startActivity(aptitude);
        });

        cardViewReasoning.setOnClickListener(view -> {
            Intent reasoningIntent = new Intent(Syllabus.this, ReasoningLogic.class);
            startActivity(reasoningIntent);
        });

        cardViewTechnical.setOnClickListener(view -> {
            Intent technicalIntent = new Intent(Syllabus.this,Technical.class);
            startActivity(technicalIntent);
        });
        cardViewMarathi.setOnClickListener(view -> {
            Intent technicalIntent = new Intent(Syllabus.this,Marathi.class);
            startActivity(technicalIntent);
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



}
