package com.tejas.exam.dominika;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.tejas.exam.R;

public class HomeActivity extends AppCompatActivity {

    private ImageView imageSyllabus,imageTelegram,imageInstagram,imageBooks;
    private TextView textSyllabus,textTelegram,textInstagram,textExamPattern;
    private CardView card1,card2,card3,card4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prototype);
        getSupportActionBar().hide();

        card1=findViewById(R.id.card1ExamPattern);
        card2=findViewById(R.id.card2Questions);
        card3=findViewById(R.id.card3Instagram);
        card4=findViewById(R.id.card4Telegram);


        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,Syllabus.class);
                startActivity(intent);
            }
        });

      card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent instagramIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/mseb.exams?utm_medium=copy_link"));
                startActivity(instagramIntent);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.telegram.me/TEA_MSEB"));
                startActivity(intent);
            }
        });

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });


    }
}
