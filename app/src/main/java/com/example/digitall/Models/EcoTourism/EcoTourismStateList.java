package com.example.digitall.Models.EcoTourism;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EcoTourismStateList {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("capital")
    @Expose
    private String capital;
    @SerializedName("about")
    @Expose
    private String about;
    @SerializedName("climate")
    @Expose
    private String climate;
    @SerializedName("history")
    @Expose
    private String history;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("food")
    @Expose
    private String food;
    @SerializedName("img")
    @Expose
    private String[] img;
    @SerializedName("products")
    @Expose
    private List<StateProducts> stateProductsList = null;
    @SerializedName("tourist")
    @Expose
    private List<StateTouristPlaces> stateTouristPlacesList = null ;

    public EcoTourismStateList(String id, String name, String capital, String about, String climate, String history, String time, String food, String[] img, List<StateProducts> stateProductsList, List<StateTouristPlaces> stateTouristPlacesList) {
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.about = about;
        this.climate = climate;
        this.history = history;
        this.time = time;
        this.food = food;
        this.img = img;
        this.stateProductsList = stateProductsList;
        this.stateTouristPlacesList = stateTouristPlacesList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String[] getImg() {
        return img;
    }

    public void setImg(String[] img) {
        this.img = img;
    }

    public List<StateProducts> getStateProductsList() {
        return stateProductsList;
    }

    public void setStateProductsList(List<StateProducts> stateProductsList) {
        this.stateProductsList = stateProductsList;
    }

    public List<StateTouristPlaces> getStateTouristPlacesList() {
        return stateTouristPlacesList;
    }

    public void setStateTouristPlacesList(List<StateTouristPlaces> stateTouristPlacesList) {
        this.stateTouristPlacesList = stateTouristPlacesList;
    }
}
