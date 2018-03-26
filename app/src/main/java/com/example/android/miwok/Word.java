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
    //Image resource ID for the word.
    private int mImageResourceId;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    //Get the default translation.
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //Get the Miwok translation.
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //Get the image for the word.
    public int getImageResourceId() {
        return mImageResourceId;
    }
}