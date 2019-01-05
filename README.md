This application is still being working on as of 1/5/2019. I found a bug in my xml files that was causing the app to crash. 

# PopularMoviesStage1
Popular Movie Stage 1 Project for Udacity's Android Developer Nanodegree
The purpose of this application is to demonstrate some of the fundamental skills learned in the first part of the Udacity Android Developer Nanodegree program. The application pulls data about popular movies from The Movie Database API (https://www.themoviedb.org/documentation/api) and parses the returned JSON into an Android RecyclerView. The Picasso library is used to retrieve movie poster images and load them into a GridLayout. Selecting a movie poster creates an intent that passes data to a detail activity where additional data about the movie is retrieved.

# To use this app:
This application requires an api key for The Movie Database. A new string resource file key.xml should be created in the res/values folder. The value of API_KEY should be set to your API key assigned by The Movie Database.
