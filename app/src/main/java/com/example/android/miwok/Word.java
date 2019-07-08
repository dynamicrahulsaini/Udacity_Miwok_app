package com.example.android.miwok;

import android.support.annotation.NonNull;

public class Word {

    private String mDefaultTranslation = null;

    private String mMiwokTranslation = null;

    private int mImageResourceId = 0;

    private int mAudioResourceId = 0;

    public Word(String defaultTranslation, String miwokTranslation, int imageId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageId;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    @NonNull
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
