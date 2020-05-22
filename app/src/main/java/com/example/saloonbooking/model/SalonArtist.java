package com.example.saloonbooking.model;

import com.google.gson.annotations.SerializedName;

public class SalonArtist {

    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String artistName;
    @SerializedName("email")
    private String email;
    @SerializedName("type")
    private String type;
    @SerializedName("mobile")
    private int mobile;
    @SerializedName("image")
    private String image;
    @SerializedName("rate")
    private String rate;
    @SerializedName("address")
    private String address;
    @SerializedName("bio")
    private String bio;

    public SalonArtist(int id, String artistName, String email, String type, int mobile, String image, String rate, String address, String bio) {
        this.id = id;
        this.artistName = artistName;
        this.email = email;
        this.type = type;
        this.mobile = mobile;
        this.image = image;
        this.rate = rate;
        this.address = address;
        this.bio = bio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
