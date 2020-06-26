package com.example.covid_19survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import javax.xml.transform.Result;

public class SurveyActivity extends AppCompatActivity {
    private TextView mScoreView,mQuestion;

    private ImageView mImageView;
    private Button mYesButton,mNoButton;
    private boolean mAnswer;
    private int mScore=0;
    private int mQuestionNumber=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        mScoreView=(TextView)findViewById(R.id.points);
        mImageView=(ImageView)findViewById(R.id.imageView);
        mQuestion=(TextView)findViewById(R.id.question);
        mYesButton=(Button)findViewById(R.id.yesButton);
        mNoButton=(Button)findViewById(R.id.noButton);

        updateQuestion();

                //Logic for True Button
        mYesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mAnswer==true) {
                    mScore++; //this update the score int variable
                    updateScore(mScore); //coverts the int variable to string

                    if (mQuestionNumber == SurveyBook.questions.length) {

                        Intent i = new Intent(SurveyActivity.this, ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        SurveyActivity.this.finish();
                        startActivity(i);
                    }

                    else
                        {
                        updateQuestion();
                    }
                }

                else
                    {
                        if (mQuestionNumber == SurveyBook.questions.length) {

                            Intent i = new Intent(SurveyActivity.this, ResultsActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putInt("finalScore", mScore);
                            i.putExtras(bundle);
                            SurveyActivity.this.finish();
                            startActivity(i);
                        }

                        else
                        {
                            updateQuestion();
                        }

            }

            }
        });
        mNoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mAnswer==false) {
                     //this update the score int variable
                    updateScore(mScore); //coverts the int variable to string

                    if (mQuestionNumber == SurveyBook.questions.length) {

                        Intent i = new Intent(SurveyActivity.this, ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        SurveyActivity.this.finish();
                        startActivity(i);
                    }

                    else
                    {
                        updateQuestion();
                    }
                }

                else
                {
                    if (mQuestionNumber == SurveyBook.questions.length) {

                        Intent i = new Intent(SurveyActivity.this, ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        SurveyActivity.this.finish();
                        startActivity(i);
                    }

                    else
                    {
                        updateQuestion();
                    }

                }

            }
        });

    }

    private void updateQuestion()
    {

        mImageView.setImageResource(SurveyBook.images[mQuestionNumber]);
        mQuestion.setText(SurveyBook.questions[mQuestionNumber]);
        mAnswer=SurveyBook.answers[mQuestionNumber];
        mQuestionNumber++;

    }
    public void updateScore(int point){
        mScoreView.setText(""+ mScore);

    }
}