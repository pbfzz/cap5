package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {
    // TODO-C1 (1) Implement your Cat Bean here according to the response json
    @SerializedName("breeds") private List<String> breeds;
    @SerializedName("id") private String id;
    @SerializedName("url") private String url;
    @SerializedName("width") private int width;
    @SerializedName("height") private int height;
    public List<String> getBreeds() {return breeds;}
    public String getId(){return id;}
    public String getUrl() {return url;}
    public int getWidth() {return width;}
    public int getHeight() {return height;}
    private  class categories{
        public int id;
        public String kittens;
    }
    @Override public String toString() {
        return "Value{" +
                "breeds : " + breeds +
                ", id=" + id +
                ", url='" + url + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}


