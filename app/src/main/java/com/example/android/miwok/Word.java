package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Florin on 10.03.2018.
 */

public class Word extends AppCompatActivity {

    //Default translation for the word.
    private String mDefaultTranslation;
    //Miwok translation for the word.
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //Get the default translation.
     public String getDefaultTranslation() {
        return mDefaultTranslation;
     }

    //Get the Miwok translation.
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
