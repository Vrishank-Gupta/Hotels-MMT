package com.example.hotels.API;

import com.example.hotels.util.ResponseMainHotel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HotelAPI {


    @GET("")
    Call<ResponseMainHotel> getHotel();

}
