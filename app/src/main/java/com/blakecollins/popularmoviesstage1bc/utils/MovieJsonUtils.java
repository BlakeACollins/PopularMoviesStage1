package com.blakecollins.popularmoviesstage1bc.utils;


import android.graphics.Movie;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MovieJsonUtils {


    private static final String MOVIE_RESULTS = "results";
    private static final String MOVIE_TITLE = "title";
    private static final String MOVIE_POSTER = "poster_path";
    private static final String MOVIE_PLOT = "overview";
    private static final String MOVIE_RATING = "vote_average";
    private static final String MOVIE_RELEASE_DATE = "release_date";


    public static Movie[] parseJsonMoview(String jsonMoviesData) throws JSONException {

        JSONObject jsonRoot = new JSONObject(jsonMoviesData);

        JSONArray jsonArrayResult = jsonRoot.getJSONArray(MOVIE_RESULTS);
        Movie[] result = new Movie[jsonArrayResult.length()];


        for (int i = 0; i < jsonArrayResult.length(); i++) {
            Movie movie = new Movie();
            movie.setmTitle(jsonArrayResult.getJSONObject(i).optString(MOVIE_TITLE));


            movie.setmMoviePoster(jsonArrayResult.getJSONObject(i).optString(MOVIE_POSTER));

            movie.setmPlot(jsonArrayResult.getJSONObject(i).optString(MOVIE_PLOT));

            movie.setmRating(jsonArrayResult.getJSONObject(i).optString(MOVIE_RATING));

            movie.setmReleaseDate(jsonArrayResult.getJSONObject(i).optString(MOVIE_RELEASE_DATE));
            result[i] = movie;
        }
        return result;
    }

}

