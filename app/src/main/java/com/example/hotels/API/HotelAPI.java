package com.example.hotels.API;

import com.example.hotels.ResponseMainHotel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface HotelAPI {
    public static String url="https://hermes.goibibo.com/hotels/v12/search/data/";


//    https://hermes.goibibo.com/hotels/v12/search/data/v3/2820046943342890302/20200706/20200707/1-2-0?s=popularity&cur=INR&tmz=-330
    @GET("v3/{city}/{checkin}/{checkout}/1-2-0?s=popularity&cur=INR&tmz=-330")
    Call<ResponseMainHotel> getHotels(@Path("city") String cityId, @Path("checkin") String checkIn, @Path("checkout") String checkOut);


    @Headers("x-rapidapi-key:ERChGHynKsmsh91pj1WqJy2D1dEGp1IrwMsjsnOGdOFXijuDK6")
    @GET("get-details")
    Call<ResponseMainHotel> getDetail(@Query("location_id") String location_id, @Query("currency") String currency);

}
