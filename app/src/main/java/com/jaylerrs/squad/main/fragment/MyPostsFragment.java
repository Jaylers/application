package com.jaylerrs.squad.main.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;
import com.jaylerrs.squad.utility.sharedstring.FirebaseTag;

public class MyPostsFragment extends PostListFragment {

    public MyPostsFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // All my posts
        return databaseReference.child(FirebaseTag.user_post)
                .child(getUid());
    }
}
