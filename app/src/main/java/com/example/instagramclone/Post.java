package com.example.instagramclone;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

//create models that represent our data and that subclass ParseObject to allow for Parse persistence.

@ParseClassName("Post")
public class Post extends ParseObject {

    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";

    //get method for description

    public String getDescription() {
        return  getString(KEY_DESCRIPTION);
    }

    //set method for the description
    public void setDescription(String description) {
        put(KEY_DESCRIPTION, description);
    }

    // get method for the image
    public ParseFile getImage(){
        return getParseFile(KEY_IMAGE);
    }

    //set image
    public void setImage(ParseFile parseFile) {
        put(KEY_IMAGE, parseFile);
    }

    // get the image
    public ParseUser getUser(){
        return getParseUser(KEY_USER);
    }

    public void setUser(ParseUser user){
        put(KEY_USER, user);
    }

}
