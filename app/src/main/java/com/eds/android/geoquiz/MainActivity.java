package com.eds.android.geoquiz;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button mTrueb;
    private Button mFalseb;
    private Button mNextButton;
    private TextView mQuestionTextView;
    private Question[] mQuestionBank = new Question[]{new Question(R.string.question_oceans,true),new Question(R.string.question_mideast,false),new Question(R.string.question_africa,false),new Question(R.string.question_america,true),new Question(R.string.question_asia,true),};
    private int mCurrentIndex = 0;

    private void questionUpdate(){
        int Question = mQuestionBank[mCurrentIndex].getTextResId();
        mQuestionTextView.setText(Question);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mQuestionTextView = (TextView) findViewById(R.id.v1);
        final int question = mQuestionBank[mCurrentIndex].getTextResId();
        mQuestionTextView.setText(question);

        mTrueb = (Button) findViewById(R.id.trueb);
        mFalseb = (Button) findViewById(R.id.falseb);
        mTrueb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkAnswer(true);
            }
        });
        mFalseb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkAnswer(false);
            }
        });

            mNextButton = (Button) findViewById(R.id.nextb);
            mNextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
                    questionUpdate();


                }
            });


        }




    private void checkAnswer(boolean userPressedTrue){
        boolean answerIsTrue = mQuestionBank[mCurrentIndex].isAnswerTrue();
        int messageResId = 0;
        if (userPressedTrue == answerIsTrue){
            messageResId = R.string.correct_toast;
        } else {
            messageResId=R.string.incorrect_toast;
        }

        Toast.makeText(getApplicationContext(),messageResId,Toast.LENGTH_SHORT).show();
    }


    }

