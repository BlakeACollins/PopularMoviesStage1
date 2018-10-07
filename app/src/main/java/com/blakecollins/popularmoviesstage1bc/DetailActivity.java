package com.blakecollins.popularmoviesstage1bc;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    private static final String URL_IMAGE_PATH = "http://image.tmdb.org/t/p/w185";


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        ImageView iv_poster_detail = findViewById(R.id.iv_poster_detail);
        TextView tv_title= findViewById(R.id.tv_title);
        TextView tv_plot = findViewById(R.id.tv_plot);
        TextView tv_rating = findViewById(R.id.tv_rating);
        TextView tv_release = findViewById(R.id.tv_release);


        String title = getIntent().getStringExtra("title");
        String poster = getIntent().getStringExtra("poster");
        String plot = getIntent().getStringExtra("plot");
        String rating = getIntent().getStringExtra("rating");
        String release = getIntent().getStringExtra("releaseDate");
        String releaseFinal = release.substring(0, 4);

        Picasso.with(this)
                .load(URL_IMAGE_PATH.concat(poster))
                .into(iv_poster_detail);
        tv_title.setText(title);
        tv_plot.setText(plot);
        tv_rating.setText(rating.concat("/10"));
        tv_release.setText(releaseFinal);
        setTitle(title);

    }


}

