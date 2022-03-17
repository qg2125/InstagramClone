package com.codepath.qing.instagramclone;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("User")
public class User extends ParseObject {

    public static final String KEY_PROFILE_IMAGE = "profilePhoto";
    public static final String KEY_PROFILE_USERNAME = "username";

    public ParseFile getImage(){
        return getParseFile(KEY_PROFILE_IMAGE);
    }
    public void setImage(ParseFile parseFile){
        put(KEY_PROFILE_IMAGE,parseFile);
    }

    public ParseUser getUser() {
        return getParseUser(KEY_PROFILE_USERNAME);
    }
    public void setUser(ParseUser user) {
        put(KEY_PROFILE_USERNAME, user);}
}
