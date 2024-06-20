package com.example.digitall.Models.EcoTourism;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class StateProducts implements Serializable {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("info")
    @Expose
    private String info;
    @SerializedName("images")
    @Expose
    private String images;
    @SerializedName("location")
    @Expose
    private String location;

    public StateProducts(String name, String info, String images, String location) {
        this.name = name;
        this.info = info;
        this.images = images;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public String getImages() {
        return images;
    }

    public String getLocation() {
        return location;
    }
}
