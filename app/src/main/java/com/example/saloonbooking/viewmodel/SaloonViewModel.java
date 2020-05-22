package com.example.saloonbooking.viewmodel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.saloonbooking.model.SalonArtist;
import com.example.saloonbooking.repository.SaloonRepo;

import java.util.List;

public class SaloonViewModel extends ViewModel {
    public MutableLiveData<List<SalonArtist>> aArtists;
    public SaloonRepo saloonRepo;

    public void init()
    {
        if(aArtists !=null)
        {
            return;
        }
        saloonRepo=SaloonRepo.getInstance();
        aArtists=saloonRepo.getArtists();
        Log.e("viewmodelData",aArtists.toString());

    }


    public LiveData<List<SalonArtist>> getArtists()
    {
        return aArtists;
    }
}
