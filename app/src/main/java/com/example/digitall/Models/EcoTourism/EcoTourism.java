package com.example.digitall.Models.EcoTourism;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EcoTourism {

    @SerializedName("loc")
    @Expose
    private List<EcoTourismLocList> ecoTourismLocList = null;
    @SerializedName("state")
    @Expose
    private List<EcoTourismStateList> ecoTourismStateList = null;

    public EcoTourism(List<EcoTourismLocList> ecoTourismLocList, List<EcoTourismStateList> ecoTourismStateList) {
        this.ecoTourismLocList = ecoTourismLocList;
        this.ecoTourismStateList = ecoTourismStateList;
    }

    public List<EcoTourismLocList> getEcoTourismLocList() {
        return ecoTourismLocList;
    }

    public List<EcoTourismStateList> getEcoTourismStateList() {
        return ecoTourismStateList;
    }
}
