package com.example.saloonbooking.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArtistsList {
    @SerializedName("data")
    private List<SalonArtist> artistList=null;

    public ArtistsList(List<SalonArtist> artistList) {
        this.artistList = artistList;
    }

    public List<SalonArtist> getArtistList() {
        return artistList;
    }

    public void setArtistList(List<SalonArtist> artistList) {
        this.artistList = artistList;
    }
}
