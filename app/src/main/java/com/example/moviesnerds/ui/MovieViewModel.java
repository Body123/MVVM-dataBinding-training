package com.example.moviesnerds.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.moviesnerds.pojo.movieModel;

public class MovieViewModel extends ViewModel {
    MutableLiveData <String> movieNameMutableLifeData=new MutableLiveData<>();

    public void getMovieName(){
        String movieName=getMoveFromDataBase().getName();
        movieNameMutableLifeData.setValue(movieName);
    }

    private movieModel getMoveFromDataBase() {
        return new movieModel(1,"religious","20-10-2010","okey");
    }
}
