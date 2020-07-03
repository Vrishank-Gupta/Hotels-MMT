package com.example.hotels.API;

import com.example.hotels.util.CityResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CityAPI {

    public static String url="https://friendly-inukshuk-48629.herokuapp.com/";

    @GET("getCityName")
    Call<CityResponse> getCities();

}
