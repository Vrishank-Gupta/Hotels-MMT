package com.example.hotels.util;

import com.example.hotels.HotelHermes.DataItem;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseFav {

    @SerializedName("msg")
    private String msg;

    @SerializedName("success")
    private boolean success;

    public String getMsg(){
        return msg;
    }

    public boolean isSuccess(){
        return success;
    }

    @Override
    public String toString(){
        return
                "ResponseUserAdd{" +
                        "msg = '" + msg + '\'' +
                        ",success = '" + success + '\'' +
                        "}";
    }
}
