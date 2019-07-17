package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.18 17:53
 */
public class PostVideoResponse {

    // TODO-C2 (3) Implement your PostVideoResponse Bean here according to the response json
    @SerializedName("success") private Boolean success;
    @SerializedName("feeds") private Item feeds;
    public Boolean getSuccess(){
        return success;
    }
    public Item getFeeds(){
        return feeds;
    }

    public class Item{
        @SerializedName("student_id") private String studentId;
        @SerializedName("username") private String username;
        @SerializedName("image_url") private String  imageUrl;
        @SerializedName("video_url") private String  videoUrl;
        public String getStudentId(){
            return studentId;
        }
        public String getUsername(){
            return username;
        }
        public String getImageUrl(){
            return imageUrl;
        }
        public String getVideoUrl(){
            return videoUrl;
        }
    }
}
