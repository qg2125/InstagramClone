package com.codepath.qing.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("JFpfmgPjBkyrQtyDhbnw5cTgSEKoF3kyBrGbJeVR")
                .clientKey("m2j2vw6VJ29spy3ybDXA3LEqneB7d3qDgl6aAuSM")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
