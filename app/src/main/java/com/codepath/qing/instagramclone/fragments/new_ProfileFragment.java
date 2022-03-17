package com.codepath.qing.instagramclone.fragments;

import android.util.Log;

import com.codepath.qing.instagramclone.Post;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import java.util.List;

public class new_ProfileFragment extends PostsFragment{
    private static final String TAG = "new_ProfileFragment";
    @Override
    protected void queryPost() {
        ParseQuery<Post> query = ParseQuery.getQuery("Post");
        query.include(Post.KEY_USERNAME);
        query.whereEqualTo(Post.KEY_USERNAME, ParseUser.getCurrentUser());
        query.setLimit(20);
        query.addDescendingOrder(Post.KEY_CREATED_AT);
        query.findInBackground(new FindCallback<Post>() {
            @Override
            public void done(List<Post> posts, ParseException e) {
                if(e != null){
                    Log.e(TAG, "Issue with getting posts",e);
                    return;
                }else {

                    for (ParseObject post : posts) {
                        Log.i(TAG, "Post:" + post.get("description"));
                        allPosts.addAll(posts);
                        adapter.notifyDataSetChanged();
                        //Toast.makeText(MainActivity.this, post.get("description").toString(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
