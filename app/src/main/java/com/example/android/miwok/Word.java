package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Florin on 10.03.2018.
 */

public class Word extends AppCompatActivity {

    private static final int NO_IMAGE_PROVIDED = -1;
    //Default translation for the word.
    private String mDefaultTranslation;
    //Miwok translation for the word.
    private String mMiwokTranslation;
    //Image resource ID for the word.
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    //Audio file resource Id for the word.
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    //Get the sound for the word.
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}