package com.example.retrofitsimplegetrequest.Interface;

import com.example.retrofitsimplegetrequest.Model.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("posts")
    Call<List<Model>> getAllData();
}
