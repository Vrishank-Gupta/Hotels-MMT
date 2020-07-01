package com.example.hotels;

import com.example.hotels.hoteldata.CoordinateResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CoordinateAPI {

    public static String url="https://us1.locationiq.com/v1/";


    @GET("search.php")
    Call<List<CoordinateResponse>> getCoordinates(@Query("key") String key, @Query("q") String place, @Query("format") String format );
}
