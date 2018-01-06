package com.example.acer.drugeliminator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Bundle extras = getIntent().getExtras();

        String actosScore = extras.getString("actosScore");
        String actosSentiment = extras.getString("actosSentiment");
        String byettaScore = extras.getString("byettaScore");
        String byettaSentiment = extras.getString("byettaSentiment");
        String glucophageScore = extras.getString("glucophageScore");
        String glucophageSentiment = extras.getString("glucophageSentiment");
        String januviaScore = extras.getString("januviaScore");
        String januviaSentiment = extras.getString("januviaSentiment");


        TextView actos = (TextView) findViewById(R.id.textView2);
        TextView byetta = (TextView) findViewById(R.id.textView3);
        TextView glucophage = (TextView) findViewById(R.id.textView4);
        TextView januvia = (TextView) findViewById(R.id.textView5);

        actos.setText("Actos: Score = "+ actosScore + " Sentiment = " +actosSentiment);
        byetta.setText("Byetta: Score = "+byettaScore+ " Sentiment = "+byettaSentiment);
        glucophage.setText("Glucophage: Score = "+glucophageScore+ " Sentiment = "+glucophageSentiment);
        januvia.setText("Januvia: Score = "+januviaScore+" Sentiment = "+januviaSentiment);

    }
}
