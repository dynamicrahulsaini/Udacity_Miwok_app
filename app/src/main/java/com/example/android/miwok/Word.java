package com.example.android.miwok;

import android.media.Image;
import android.support.annotation.NonNull;
import android.widget.ImageView;

public class Word {

    private String mDefaultTranslation = null;

    private String mMiwokTranslation = null;

    private int imageResourceId = 0;

    public Word(String defaultTranslation, String miwokTranslation, int imageId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        imageResourceId = imageId;
    }

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    @NonNull
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
