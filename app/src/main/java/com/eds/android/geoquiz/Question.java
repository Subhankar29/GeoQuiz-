package com.eds.android.geoquiz;

import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Subhankar29 on 31/05/16.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question (int texttResid, boolean answertrue){
        mTextResId = texttResid;
        mAnswerTrue= answertrue;

    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    //public int getTextResId(){
        //return mTextResId;
    //}
    //public void setTextResId(int textResId){
        //mTextResId = textResId;
 //   }

   // public boolean isAnswerTrue(){
//        return mAnswerTrue;
  //  }

//    public void setAnswerTrue(boolean answerTrue){
  //      mAnswerTrue =answerTrue;
    //}




}
