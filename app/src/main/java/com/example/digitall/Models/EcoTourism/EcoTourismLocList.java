package com.example.digitall.Models.EcoTourism;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class EcoTourismLocList implements Serializable {

    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("long")
    @Expose
    private String lng;

    public String getState() {
        return state;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    public EcoTourismLocList(String state, String lat, String lng) {
        this.state = state;
        this.lat = lat;
        this.lng = lng;
    }
}
