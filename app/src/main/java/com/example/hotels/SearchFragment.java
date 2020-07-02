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

import com.example.hotels.API.HotelAPI;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchFragment extends Fragment {

    private String apiToken = "f729a1e36f4533";
    private DatePickerDialog.OnDateSetListener mCheckInDateSetListener;
    private DatePickerDialog.OnDateSetListener mCheckOutDateSetListener;

    ImageView checkInDateIcon, checkOutdateIcon;
    TextView tvCheckInDate;
    TextView tvCheckOutDate;
    Button btnSubmit;
    boolean set1,set2;
    EditText etLocation;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search,container,false);

        Toast.makeText(getContext(), "Hola", Toast.LENGTH_SHORT).show();

        set1 = true;
        set2 = false;
        etLocation = view.findViewById(R.id.etLocation);
        btnSubmit = view.findViewById(R.id.btnSubmit);
        checkInDateIcon = view.findViewById(R.id.checkInDateIcon);
        tvCheckInDate = view.findViewById(R.id.tvCheckInDate);
        tvCheckOutDate = view.findViewById(R.id.tvCheckoutDate);
        checkOutdateIcon = view.findViewById(R.id.dateCheckOutIcon);


        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        tvCheckInDate.setText(df.format(c));

        tvCheckOutDate.setText(df.format(c));

        checkOutdateIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dialog = new DatePickerDialog(getContext(),android.R.style.Theme_Holo_Light_Dialog_MinWidth,mCheckOutDateSetListener,year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        checkInDateIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dialog = new DatePickerDialog(getContext(),android.R.style.Theme_Holo_Light_Dialog_MinWidth,mCheckInDateSetListener,year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mCheckOutDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                String d = String.valueOf(day);
                if(day<10)
                    d = "0"+d;

                month=month+1;
                String m = String.valueOf(month);
                if(month < 10)
                    m="0"+m;

                String date=year+"/"+m+"/"+d;
                set1  =true;
                tvCheckOutDate.setText(date);
            }
        };


        mCheckInDateSetListener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                String d = String.valueOf(day);
                if(day<10)
                    d = "0"+d;

                month=month+1;
                String m = String.valueOf(month);
                if(month < 10)
                    m="0"+m;

                set2 = true;
                String date=year+"/"+m+"/"+d;
                tvCheckInDate.setText(date);
            }
        };


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(etLocation.getText()==null || etLocation.getText().toString().trim().equals(""))
                {
                    etLocation.setError("Please Fill Location to search");
                    Toast.makeText(getContext(), "Please Fill All the Fields", Toast.LENGTH_SHORT).show();
                }

//                if(!set2)
//                {
//                    tvCheckOutDate.setError("Please Fill CheckOut Date");
//                }

                else{

                    String checkInDate = tvCheckInDate.getText().toString();
                    checkInDate = checkInDate.trim();
                    checkInDate = checkInDate.replaceAll("/", "");

                    String checkOutDate = tvCheckOutDate.getText().toString();
                    checkOutDate = checkOutDate.trim();
                    checkOutDate = checkOutDate.replaceAll("/", "");


                    final Retrofit retrofit = new Retrofit.Builder().baseUrl(HotelAPI.url).addConverterFactory(GsonConverterFactory.create()).build();

                    HotelAPI api = retrofit.create(HotelAPI.class);

                    Call<ResponseMainHotel> call = api.getHotels("2820046943342890302",checkInDate,checkOutDate);

                    call.enqueue(new Callback<ResponseMainHotel>() {
                        @Override
                        public void onResponse(Call<ResponseMainHotel> call, Response<ResponseMainHotel> response) {

                            if(response.body()!=null && response.body().getData()!=null &&response.body().getData().size()>0)
                            { for(int i = 0;i<response.body().getData().size();i++)
                                {
                                    Log.d("NamesOfHotels", "onResponse: " + response.body().getData().get(i).getHn());
                                }
                           }
                            else
                                Toast.makeText(getContext(), "Couldn't find any hotel!", Toast.LENGTH_LONG).show();

                        }

                        @Override
                        public void onFailure(Call<ResponseMainHotel> call, Throwable t) {
                            Log.d("NamesOfHotels", "onResponse: " + t.getMessage());

                        }
                    });
                }



            }
        });

        return  view;
    }
}
