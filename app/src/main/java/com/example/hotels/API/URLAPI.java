package com.example.hotels.API;

import com.example.hotels.util.ResponseURL;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface URLAPI {

//https://friendly-inukshuk-48629.herokuapp.com/get_url
    public static String ur="https://friendly-inukshuk-48629.herokuapp.com/";

    @GET("/get_url")
    Call<ResponseURL> getUrl(@Query("name") String name, @Query("start_date") String checkin, @Query("end_date") String checkout);
}
