package com.example.hotels.frags;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotels.Adapter.MyAdapterHotel;
import com.example.hotels.Details_Activity;
import com.example.hotels.HotelHermes.DataItem;
import com.example.hotels.HotelHermes.NppItem;
import com.example.hotels.LoginActivity;
import com.example.hotels.R;

import java.util.ArrayList;
import java.util.List;

public class FavouriteFragment extends Fragment {

    RecyclerView recyclerView;
    MyAdapterHotel myAdapterHotel;

    List<DataItem> data_List;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_favourite,container,false);

        recyclerView = view.findViewById(R.id.recyclerfav);
        if(LoginActivity.dataItemArrayList == null)
        {
            LoginActivity.dataItemArrayList = new ArrayList<>();

        }

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));

        data_List = LoginActivity.dataItemArrayList;
        myAdapterHotel = new MyAdapterHotel(getContext(), new MyAdapterHotel.OnItemClickListener() {
            @Override
            public void onItemclick(int position) {
                Intent intent = new Intent(getContext(), Details_Activity.class);
                String hotel_name = data_List.get(position).getCh();
                String hotel_location = data_List.get(position).getHn();
                String imageUrl = data_List.get(position).getT();
                int hotel_price = data_List.get(position).getOpr();
                String room_type = data_List.get(position).getRtn();
                Float rating = (float) data_List.get(position).getGr();
                List<NppItem> list = data_List.get(position).getNpp();
//                List<String> facility_list = list.get(0).getHtd().getHt();
//                Log.d("CheckList", "onItemclick: "+list.get(0).getHtd().getHt().toString());
//                ArrayList<String> amenities = new ArrayList<>();
//                for (int i = 0; i < facility_list.size(); i++) {
//                    amenities.set(i, facility_list.get(i));
//                }
                intent.putExtra("hotel_name", hotel_name);
                intent.putExtra("hotel_location", hotel_location);
                intent.putExtra("hotel_image",imageUrl);
                intent.putExtra("hotel_price", hotel_price);
                intent.putExtra("rating",rating);
                intent.putExtra("hotel", data_List.get(position));
                intent.putExtra("boolean", true);


                // intent.putExtra("amenities", amenities);
                startActivity(intent);
            }

            @Override
            public void onFavoriteClicked(int position) {

            }
        }, data_List);

        recyclerView.setAdapter(myAdapterHotel);


        return view;
    }
}
