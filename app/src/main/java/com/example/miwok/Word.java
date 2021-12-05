package com.example.miwok;

/**
 * This class contains default translation and miwok translation of a word.
 */
public class Word {
    /**
     * Two private variables of String type for default translation and miwok translation.
     * one other variable for image resource id.
     *
     */
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private static final int IS_IMAGE = -1;
    private int mImageResource = IS_IMAGE;
    private int msongsIds;

    /**
     *
     * @param defaultTranslation
     * @param miwokTranslation
     */
    public Word(String defaultTranslation, String miwokTranslation, int songId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.msongsIds = songId;
    }


    public Word(String defaultTranslation, String miwokTranslation, int resourceId, int songId){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResource = resourceId;
        this.msongsIds = songId;

    }
    /**
     * This method return the default translation of a word
     * @return
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * This method returns the miwok translation af a word
     * @return
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
        return this.mImageResource;
    }

    public boolean getImageId(){
        return IS_IMAGE != mImageResource;
    }

    public int getSongsIds() {
        return msongsIds;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResource=" + mImageResource +
                ", msongsIds=" + msongsIds +
                '}';
    }
}
