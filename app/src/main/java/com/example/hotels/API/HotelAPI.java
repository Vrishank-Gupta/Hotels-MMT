package com.example.hotels.API;

import com.example.hotels.ResponseMainHotel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface HotelAPI {


    @GET("")
    Call<ResponseMainHotel> getHotel();

}
