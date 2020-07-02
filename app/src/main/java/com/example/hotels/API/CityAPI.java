package com.example.hotels.API;

import com.example.hotels.CityResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface CityAPI {

    public static String url="https://friendly-inukshuk-48629.herokuapp.com/";

    @GET("getCityName")
    Call<CityResponse> getCities();

}
