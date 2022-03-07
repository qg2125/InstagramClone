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
                .applicationId("4hftuvJycSib7mSX7r8xj1MXouTMLhVeKNIUS3et")
                .clientKey("xof8PkELsJr4YIi9QTldV31ZGQDukGg70pU2DEYN")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
