package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 * */

public class Word {

    /* Default translation and Miwok translation for the word */
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImgResourceId = NO_IMAGE_PROVIDED;

    // -1 because its out of the range of all the possible valid resource ID
    private static final int NO_IMAGE_PROVIDED = -1;

    // Audio resource id for the word
    private int mAudioResourceId;

    // Create the constructors - looks like a method declaration
    // Name of constructor has to match the class name exactly
    // The constructor does not have a return type
    public Word (String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImgResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /* Get the
    Miwok translation of the word */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /* Get the default translation of the word */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImgResourceId() { return mImgResourceId; }

    /**
     * Returns whether or not there is an image for this word
     *
     */
    public boolean hasImage() {
        return mImgResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
