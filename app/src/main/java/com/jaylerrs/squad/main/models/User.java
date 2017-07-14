package com.jaylerrs.squad.main.models;

import com.google.firebase.database.IgnoreExtraProperties;

// [START blog_user_class]
@IgnoreExtraProperties
public class User {

    public String email;
    public String username;
    public String birthDate;
    public String weight;
    public String height;
    public Boolean privacy;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String email, String username, String birthDate, String weight, String height, Boolean privacy) {
        this.email = email;
        this.username = username;
        this.birthDate = birthDate;
        this.weight = weight;
        this.height = height;
        this.privacy = privacy;
    }
}
// [END blog_user_class]
