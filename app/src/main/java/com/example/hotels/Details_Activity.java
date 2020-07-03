package com.example.hotels;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;

import com.example.hotels.HotelHermes.DataItem;
import com.example.hotels.frags.SearchFragment;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Details_Activity extends AppCompatActivity {

    TextView hotel_price_t;
    TextView hotel_name_t;
    Boolean stat;
    TextView hotel_location_t;
    ImageView favourite_t;
    DataItem dataItem;
    ImageView hotel_image_t;
    Button btnFav;
    TextView rating_text_t;
    ListView listView_t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_);
        if(LoginActivity.dataItemArrayList == null)
        {
            LoginActivity.dataItemArrayList = new ArrayList<>();
        }
        Toast.makeText(this, "Inside detail activity", Toast.LENGTH_SHORT).show();

        btnFav = findViewById(R.id.btnFav);
        Intent intent=getIntent();
        hotel_name_t=findViewById(R.id.hotel_name);
        listView_t=findViewById(R.id.listview);
        hotel_location_t=findViewById(R.id.hotel_location);
        favourite_t=findViewById(R.id.heart);
        hotel_image_t=findViewById(R.id.hotel_image);
        rating_text_t=findViewById(R.id.rating);
        favourite_t.setImageResource(R.drawable.ic_favorite_black);

        ArrayList<String> amen;

        String hotel_name= getIntent().getStringExtra("hotel_name");
        String hotel_location= getIntent().getStringExtra("hotel_location");
        Float rating= getIntent().getFloatExtra("rating",0);
        String imageUrl = getIntent().getStringExtra("imageUrl");
        String hotel_price= getIntent().getStringExtra("hotel_price"+"");
        final DataItem dataItem = (DataItem) getIntent().getSerializableExtra("hotel");
        stat = getIntent().getBooleanExtra("boolean",false);
        amen = getIntent().getStringArrayListExtra("amenities");


        if(amen!=null) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, amen);
            listView_t.setAdapter(adapter);
        }




        hotel_name_t.setText(hotel_name);
          hotel_location_t.setText(hotel_location);
          rating_text_t.setText(rating+"/5 Rating");

          if(!stat)
          {
              ImageViewCompat.setImageTintList(favourite_t, ColorStateList.valueOf(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryText)));

          }
          else
          {
              ImageViewCompat.setImageTintList(favourite_t, ColorStateList.valueOf(ContextCompat.getColor(getApplicationContext(), R.color.red)));
          }
       // Log.d("CheckList", "Image url "+imageUrl.toString());
        btnFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(LoginActivity.dataItemArrayList.contains(dataItem))
                {
                    LoginActivity.dataItemArrayList = new ArrayList<>();
                    Toast.makeText(Details_Activity.this, "Removed from Favourites", Toast.LENGTH_SHORT).show();
                    SearchFragment.myAdapterHotel.notifyDataSetChanged();
                    ImageViewCompat.setImageTintList(favourite_t, ColorStateList.valueOf(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryText)));
                }

                else {
                    Toast.makeText(Details_Activity.this, "Added to Favourites", Toast.LENGTH_SHORT).show();
                    LoginActivity.dataItemArrayList.add(dataItem);
                    SearchFragment.myAdapterHotel.notifyDataSetChanged();
                    ImageViewCompat.setImageTintList(favourite_t, ColorStateList.valueOf(ContextCompat.getColor(getApplicationContext(), R.color.red)));

                }


            }
        });


        Picasso.get().load(imageUrl).resize(600,400).into(hotel_image_t, new Callback() {
            @Override
            public void onSuccess() {
                Log.d("PicassoCast: ","success");
            }

            @Override
            public void onError(Exception e) {
                Log.d("PicassoCast: ",e.getMessage());
            }
        });

        favourite_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


}
