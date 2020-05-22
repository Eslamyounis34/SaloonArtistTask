package com.example.saloonbooking.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.saloonbooking.data.Api;
import com.example.saloonbooking.model.ArtistsList;
import com.example.saloonbooking.model.SalonArtist;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SaloonRepo {

    private static SaloonRepo instance;
    private List<SalonArtist> moviesList=new ArrayList<>();
    MutableLiveData<List<SalonArtist>> data =new MutableLiveData<>();

    //Singleton Pattern
    public static SaloonRepo getInstance(){
        if(instance == null){
            instance = new SaloonRepo();
        }
        return instance;
    }

    public MutableLiveData<List<SalonArtist>> getArtists() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);
        Call<ArtistsList> call = api.getArtists(35);
        call.enqueue(new Callback<ArtistsList>() {
            @Override
            public void onResponse(Call<ArtistsList> call, Response<ArtistsList> response) {
                List<SalonArtist>artists=response.body().getArtistList();
                for (int i=0;i<artists.size();i++)
                {

                    SalonArtist artist=new SalonArtist(response.body().getArtistList().get(i).getId(),response.body().getArtistList().get(i).getArtistName(),
                            response.body().getArtistList().get(i).getEmail(),response.body().getArtistList().get(i).getType(),
                            response.body().getArtistList().get(i).getMobile(),response.body().getArtistList().get(i).getImage()
                    ,response.body().getArtistList().get(i).getRate(),response.body().getArtistList().get(i).getAddress(),
                            response.body().getArtistList().get(i).getBio());
                    moviesList.add(artist);
                }

                data.setValue(moviesList);

            }

            @Override
            public void onFailure(Call<ArtistsList> call, Throwable t) {
                Log.e("TestError",t.getMessage());

            }
        });



          return data;

    }
}
