package com.blakecollins.popularmoviesstage1bc.model;


public class Movie {

    private int mId;
    private String mTitle;
    private String mMoviePoster;
    private String mPlot;
    private String mRating;
    private String mReleaseDate;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmMoviePoster() {
        return mMoviePoster;
    }

    public void setmMoviePoster(String mMoviePoster) {
        this.mMoviePoster = mMoviePoster;
    }

    public String getmPlot() {
        return mPlot;
    }

    public void setmPlot(String mPlot) {
        this.mPlot = mPlot;
    }

    public String getmRating() {
        return mRating;
    }

    public void setmRating(String mRating) {
        this.mRating = mRating;
    }

    public String getmReleaseDate() {
        return mReleaseDate;
    }

    public void setmReleaseDate(String mReleaseDate) {
        this.mReleaseDate = mReleaseDate;
    }
}
