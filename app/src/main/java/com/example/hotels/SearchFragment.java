package com.example.hotels;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.hotels.API.CoordinateAPI;
import com.example.hotels.API.HotelAPI;
import com.example.hotels.hotelListData.CoordinateResponse;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchFragment extends Fragment {

    private String apiToken = "f729a1e36f4533";
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    ImageView dateIcon;
    TextView tvDate;
    Button btnSubmit;
    EditText etLocation;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search,container,false);

        Toast.makeText(getContext(), "Hola", Toast.LENGTH_SHORT).show();

        etLocation = view.findViewById(R.id.etLocation);
        btnSubmit = view.findViewById(R.id.btnSubmit);
        dateIcon = view.findViewById(R.id.dateIcon);
        tvDate = view.findViewById(R.id.tvDate);

        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        tvDate.setText(df.format(c));

        dateIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dialog = new DatePickerDialog(getContext(),android.R.style.Theme_Holo_Light_Dialog_MinWidth,mDateSetListener,year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });


        mDateSetListener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                String d = String.valueOf(day);
                if(day<10)
                    d = "0"+d;

                month=month+1;
                String m = String.valueOf(month);
                if(month < 10)
                    m="0"+m;

                String date=d+"/"+m+"/"+year;
                tvDate.setText(date);
            }
        };


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = etLocation.getText().toString();
                query = query.trim();
                query = query.replaceAll(" ", "%20");

                final Retrofit retrofit = new Retrofit.Builder().baseUrl(CoordinateAPI.url).addConverterFactory(GsonConverterFactory.create()).build();

                CoordinateAPI api = retrofit.create(CoordinateAPI.class);

                Call<List<CoordinateResponse>> call = api.getCoordinates(apiToken,query,"json");

                call.enqueue(new Callback<List<CoordinateResponse>>() {
                    @Override
                    public void onResponse(Call<List<CoordinateResponse>> call, Response<List<CoordinateResponse>> response) {
                        Log.d("CoordinateResponse", "onResponse: " + response.body());

                        CoordinateResponse coordinateResponse = response.body().get(0);

                        String longitude = coordinateResponse.getLon();
                        String latitude = coordinateResponse.getLat();

                        Log.d("CoordinateResponse1", "onResponse: " + latitude + " " + longitude);

                        searchHotels(longitude, latitude);

                    }

                    @Override
                    public void onFailure(Call<List<CoordinateResponse>> call, Throwable t) {
                        Log.d("CoordinateResponse", "onResponse: " + t.getMessage());

                    }
                });

            }
        });

        return  view;
    }

    private void searchHotels(String longitude, String latitude) {

        final Retrofit retrofit = new Retrofit.Builder().baseUrl(HotelAPI.url).addConverterFactory(GsonConverterFactory.create()).build();

        HotelAPI api = retrofit.create(HotelAPI.class);

        Call<ResponseHotel> call = api.getHotels(latitude,longitude);

        call.enqueue(new Callback<ResponseHotel>() {
            @Override
            public void onResponse(Call<ResponseHotel> call, Response<ResponseHotel> response) {
                Log.d("ResponseHotel", "onResponse: " + response.body().toString());

                String id  = response.body().getData().get(0).getLocationId();

                fetchDetails(id);
            }

            @Override
            public void onFailure(Call<ResponseHotel> call, Throwable t) {

            }
        });

    }

    private void fetchDetails(String id){
        final Retrofit retrofit = new Retrofit.Builder().baseUrl(HotelAPI.url).addConverterFactory(GsonConverterFactory.create()).build();

        HotelAPI api = retrofit.create(HotelAPI.class);

        Call<ResponseHotelDetail> call = api.getDetail(id, "INR");

        call.enqueue(new Callback<ResponseHotelDetail>() {
            @Override
            public void onResponse(Call<ResponseHotelDetail> call, Response<ResponseHotelDetail> response) {
                Log.d("HotelDetail", "onResponse: " + response.body().toString());
            }

            @Override
            public void onFailure(Call<ResponseHotelDetail> call, Throwable t) {

            }
        });

    }
}
