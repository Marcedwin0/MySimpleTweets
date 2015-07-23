package com.codepath.apps.mysimpletweets.models;

import org.json.JSONException;
import org.json.JSONObject;

/*
        "user": {
                "id": 26813101, "following": true,
                "favorite_count":14, "verified": true,
                "description": "...", "name": "Some Name",
                "created_at": "Thu Mar 26 18:31:32 +0000 2009",
                "followers_count": 1435, "screen name": "somename",
                "profile_image_url": "http://.....jpg"
                }
*/

public class User {
    // list attributes
    private String name;
    private long uid;
    private String screenName;
    private String profileImageUrl;

    public String getName() {
        return name;
    }
    public long getUid() {
        return uid;
    }
    public String getScreenName() {
        return screenName;
    }
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    // deserialize the user json ==> User
    public static User fromJSON(JSONObject json) {
        User u = new User();
        // Extract and fill the values
        try {
            u.name = json.getString("name");
            u.uid  = json.getLong("id");
            u.screenName = json.getString("screen_name");
            u.profileImageUrl = json.getString("profile_image_url");

        } catch (JSONException e) {
            e.printStackTrace();
        }
        // Return a user
        return u;
    }
}
