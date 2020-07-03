package com.example.hotels.API;

import com.example.hotels.HotelHermes.DataItem;
import com.example.hotels.util.ResponseFav;
import com.example.hotels.util.ResponseUserAdd;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface FavouritesAPI {
    public static String url="https://hotelscrap.herokuapp.com/api/users/";


//    @POST

//    https://hotelscrap.herokuapp.com/api/users/addFavorite

    @POST("addUser")
    Call<ResponseUserAdd> addUser(@Body String user);


    @POST("addFavorite")
    Call<ResponseFav> addFavourite(@Body String body);



}
