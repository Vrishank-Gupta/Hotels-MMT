package com.example.hotels.frags;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.hotels.API.CityAPI;
import com.example.hotels.API.URLAPI;
import com.example.hotels.Adapter.MyAdapterHotel;
import com.example.hotels.Details_Activity;
import com.example.hotels.HotelHermes.DataItem;
import com.example.hotels.HotelHermes.NppItem;
import com.example.hotels.R;
import com.example.hotels.util.CityResponse;
import com.example.hotels.util.ResponseMainHotel;
import com.example.hotels.util.ResponseURL;
import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class SearchFragment extends Fragment {
    RecyclerView recyclerView;
    public  static MyAdapterHotel myAdapterHotel;
    public static  ArrayList<DataItem> favourites;
    ArrayList<DataItem> data_List;
    private String apiToken = "f729a1e36f4533";
    private DatePickerDialog.OnDateSetListener mCheckInDateSetListener;
    private DatePickerDialog.OnDateSetListener mCheckOutDateSetListener;
    private ProgressBar spinner;

    ImageView checkInDateIcon, checkOutdateIcon;
    TextView tvCheckInDate;
    TextView tvCheckOutDate;
    Button btnSubmit;
    long tStart,tEnd;
    List<String> cities;
    boolean set1,set2;
    AutoCompleteTextView etLocation;
    Context mContext;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search,container,false);
        etLocation = view.findViewById(R.id.autoCity);
        set1 = false;
        set2 = false;
        favourites = new ArrayList<>();
        btnSubmit = view.findViewById(R.id.btnSubmit);
        checkInDateIcon = view.findViewById(R.id.checkInDateIcon);
        tvCheckInDate = view.findViewById(R.id.tvCheckInDate);
        tvCheckOutDate = view.findViewById(R.id.tvCheckoutDate);
        checkOutdateIcon = view.findViewById(R.id.dateCheckOutIcon);
        spinner = (ProgressBar)view.findViewById(R.id.progressBar1);


        recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext,LinearLayoutManager.VERTICAL,false));
        recyclerView.addItemDecoration(new DividerItemDecoration(mContext,DividerItemDecoration.VERTICAL));
        data_List=new ArrayList<>();
        spinner.setVisibility(View.VISIBLE);

        String[] ProgLanguages = { "Java", "C", "C++", ".Net", "PHP", "Perl",
                "Objective-c", "Small-Talk", "C#", "Ruby", "ASP", "ASP .NET" };




        final Retrofit retrofit = new Retrofit.Builder().baseUrl(CityAPI.url).addConverterFactory(GsonConverterFactory.create()).build();

        CityAPI api = retrofit.create(CityAPI.class);

        final Call<CityResponse> call = api.getCities();

        call.enqueue(new Callback<CityResponse>() {
            @Override
            public void onResponse(Call<CityResponse> call, retrofit2.Response<CityResponse> response) {

                if(response != null) {

                    Log.d("AutoComplete", "onResponse: " + response.body().toString());
                    cities = response.body().getJsonMember1();
                    final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(mContext,
                            android.R.layout.select_dialog_item, cities);

                    etLocation.setThreshold(1);


                    etLocation.setAdapter(arrayAdapter);
                }
                spinner.setVisibility(View.GONE);


            }

            @Override
            public void onFailure(Call<CityResponse> call, Throwable t) {

            }
        });



        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        tvCheckInDate.setText("Check In Date");

        tvCheckOutDate.setText("Check Out Date");

        checkOutdateIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dialog = new DatePickerDialog(mContext,android.R.style.Theme_Holo_Light_Dialog_MinWidth,mCheckOutDateSetListener,year,month,day);
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
                DatePickerDialog dialog = new DatePickerDialog(mContext,android.R.style.Theme_Holo_Light_Dialog_MinWidth,mCheckInDateSetListener,year,month,day);
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

        myAdapterHotel = new MyAdapterHotel(mContext, new MyAdapterHotel.OnItemClickListener() {
            @Override
            public void onItemclick(int position) {
                Intent intent = new Intent(mContext, Details_Activity.class);
                String hotel_name = data_List.get(position).getCh();
                String hotel_location = data_List.get(position).getHn();
                String imageUrl = data_List.get(position).getT();
                int hotel_price = data_List.get(position).getOpr();
                String room_type = data_List.get(position).getRtn();
                Float rating = (float) data_List.get(position).getGr();
                List<NppItem> list = data_List.get(position).getNpp();
                Log.d("CheckList", "onItemclick: "+list.get(0).getHtd().getHt().toString());
                ArrayList<String> am = new ArrayList<String>(list.get(0).getHtd().getHt());
                intent.putStringArrayListExtra("amenities",am);

                intent.putExtra("hotel_name", hotel_name);
                intent.putExtra("hotel_location", hotel_location);
                intent.putExtra("hotel_image",imageUrl);
                intent.putExtra("hotel_price", hotel_price);
                intent.putExtra("rating",rating);
                intent.putExtra("hotel", data_List.get(position));
                intent.putExtra("boolean", false);


                // intent.putExtra("amenities", amenities);
                startActivity(intent);
            }

            @Override
            public void onFavoriteClicked(int position) {

            }
        }, data_List);

        recyclerView.setAdapter(myAdapterHotel);



        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spinner.setVisibility(View.VISIBLE);



                if(etLocation.getText()==null || etLocation.getText().toString().trim().equals(""))
                {
                    etLocation.setError("Please Fill Location to search");
                    Toast.makeText(mContext, "Please Fill All the Fields", Toast.LENGTH_SHORT).show();
                    spinner.setVisibility(View.GONE);

                }

                if(!set1)
                {
                    tvCheckInDate.setError("Please Fill CheckIn Date");
                    spinner.setVisibility(View.GONE);

                }
                if(!set2)
                {
                    tvCheckOutDate.setError("Please Fill CheckOut Date");
                    spinner.setVisibility(View.GONE);

                }

                if(tvCheckInDate.getText().toString().equals(tvCheckOutDate.getText().toString()))
                {
                    Toast.makeText(mContext, "CheckIn And CheckOut Dates must not match!!", Toast.LENGTH_SHORT).show();
                    spinner.setVisibility(View.GONE);

                }
                else{
                    tStart = System.currentTimeMillis();

                    String checkInDate = tvCheckInDate.getText().toString();
                    checkInDate = checkInDate.trim();
                    checkInDate = checkInDate.replaceAll("/", "");

                    String checkOutDate = tvCheckOutDate.getText().toString();
                    checkOutDate = checkOutDate.trim();
                    checkOutDate = checkOutDate.replaceAll("/", "");

                    String loc = etLocation.getText().toString();


                    final String postBody="{\"name\": \"" + loc + "\",\"start_date\":\"" + checkInDate + "\",\"end_date\":\"" + checkOutDate+"\"}" ;
                    Log.d("postBody", "onClick: " + postBody);



                    final Retrofit retrofit1 = new Retrofit.Builder().baseUrl(URLAPI.ur).addConverterFactory(GsonConverterFactory.create()).build();
                    URLAPI api1 = retrofit1.create(URLAPI.class);

                    Call<ResponseURL> call1 = api1.getUrl(loc,checkInDate,checkOutDate);
                    Log.d("posturl", "onClick: " + call1.request().url());

                    call1.enqueue(new Callback<ResponseURL>() {
                        @Override
                        public void onResponse(Call<ResponseURL> call, retrofit2.Response<ResponseURL> response1) {
                            Log.d("URLOUtput", "onResponse: " + response1.body() + postBody);

                            if(response1.body()!=null){

                                String url = response1.body().getUrl();

                                RequestQueue queue = Volley.newRequestQueue(getContext());

                                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                                        new Response.Listener<String>() {
                                            @Override
                                            public void onResponse(String response) {

                                                if(response != null){
                                                    Gson gson = new Gson();
                                                    ResponseMainHotel responseMainHotel = gson.fromJson(response , ResponseMainHotel.class);
                                                    tEnd = System.currentTimeMillis();
                                                    Log.d("TAG", "onResponse: " + response);

                                                    if(responseMainHotel.getData()==null){
                                                        Toast.makeText(mContext,"null data from server",Toast.LENGTH_LONG).show();
                                                    }
                                                    if(responseMainHotel.getData().size()!=0)
                                                        for(int i=0;i<responseMainHotel.getData().size();i++){
                                                            data_List.add(responseMainHotel.getData().get(i));
                                                        }

                                                    myAdapterHotel.notifyDataSetChanged();

                                                    long tDelta = tEnd - tStart;
                                                    double elapsedSeconds = tDelta / 1000.0;
                                                    spinner.setVisibility(View.GONE);

                                                    Toast.makeText(mContext,"Response Time: "+ elapsedSeconds, Toast.LENGTH_SHORT).show();
                                                }

                                                else {
                                                    spinner.setVisibility(View.GONE);

                                                    Toast.makeText(mContext, "Some Error Has Occured", Toast.LENGTH_SHORT).show();
                                                }
                                            }
                                        }, new Response.ErrorListener() {
                                    @Override
                                    public void onErrorResponse(VolleyError error) {
                                        Toast.makeText(mContext, "Some Error Has Occured", Toast.LENGTH_SHORT).show();

                                        spinner.setVisibility(View.GONE);

                                    }
                                });

                                queue.add(stringRequest);
                            }

                            else
                                Toast.makeText(mContext, "Some Error Has Occured", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onFailure(Call<ResponseURL> call, Throwable t) {
                            Log.d("URLOUtput", "onFailure: " + t.getMessage());
                            Toast.makeText(mContext, "Some Error Has Occured", Toast.LENGTH_SHORT).show();
                            spinner.setVisibility(View.GONE);
                        }
                    });
                }
            }
        });

        return  view;
    }


}

