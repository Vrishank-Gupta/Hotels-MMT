package com.example.hotels;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface HotelAPI {
    public static String url="https://tripadvisor1.p.rapidapi.com/hotels/";

    @Headers("x-rapidapi-key:ERChGHynKsmsh91pj1WqJy2D1dEGp1IrwMsjsnOGdOFXijuDK6")
    @GET("list-by-latlng")
    Call<ResponseHotel> getHotels(@Query("latitude") String lat, @Query("longitude") String longitude);

}
