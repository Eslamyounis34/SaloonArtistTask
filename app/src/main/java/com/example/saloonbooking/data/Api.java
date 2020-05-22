package com.example.saloonbooking.data;

import com.example.saloonbooking.model.ArtistsList;
import com.example.saloonbooking.model.SalonArtist;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api {
    String BASE_URL = "http://81.10.36.145/vt/show_web/api/";

    @POST("salonArtists")
    Call<ArtistsList> getArtists(@Query("salon_id") int salon_id);
}
