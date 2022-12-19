package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 * */

public class Word {

    /* Default translation and Miwok translation for the word */
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    // Create the constructors - looks like a method declaration
    // Name of constructor has to match the class name exactly
    // The constructor does not have a return type
    public Word (String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /* Get the Miwok translation of the word */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /* Get the default translation of the word */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
}
