package com.mpqm.practice.RecyclerView;

public class PostItem {

    boolean isUserLike;

    int postLikeCount;



    String postImgUrl;
    String userName;
    String postText;

    public PostItem(boolean isUserLike, int postLikeCount,  String postImgUrl, String userName, String postText) {
        this.postLikeCount = postLikeCount;
        this.isUserLike = isUserLike;
        this.postImgUrl = postImgUrl;
        this.userName = userName;
        this.postText = postText;
    }

    public boolean isUserLike() {
        return isUserLike;
    }

    public void setUserLike(boolean userLike) {
        isUserLike = userLike;
    }

    public int getPostLikeCount() {
        return postLikeCount;
    }

    public void setPostLikeCount(int postLikeCount) {
        this.postLikeCount = postLikeCount;
    }

    public String getPostImgUrl() {
        return postImgUrl;
    }

    public void setPostImgUrl(String postImgUrl) {
        this.postImgUrl = postImgUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }
}
