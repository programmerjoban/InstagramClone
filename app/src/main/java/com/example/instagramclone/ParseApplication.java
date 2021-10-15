package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LecVqzJu7LfG0Eb9bwqJsS8CXttUC6bHI9f2ktr5")
                .clientKey("eSkQAlzZcDVdbXcU0KMkZf6yLs1gLvupgiXdNOGd")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
