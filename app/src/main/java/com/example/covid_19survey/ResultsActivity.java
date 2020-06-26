package com.example.covid_19survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
    TextView mGrade,mFinalScore;
    Button mRetryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        mGrade = (TextView) findViewById(R.id.grade);
        mFinalScore = (TextView) findViewById(R.id.outOf);
        mRetryButton = (Button) findViewById(R.id.retry);
        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");
        mFinalScore.setText(" You scored " + score + " out of " + SurveyBook.questions.length);
        if(score >= 3) {
            mGrade.setText(" HIGH RISK ");
        }else if(score == 2){
            mGrade.setText(" MINIMAL RISK");
        }else if(score == 1 ) {
            mGrade.setText(" LOW RISK ");
        }else{
            mGrade.setText(" YOU ARE SAFE :) ");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultsActivity.this,SurveyBook.class));
            }
        });

    }

}


