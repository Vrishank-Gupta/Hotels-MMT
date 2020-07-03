package com.example.hotels.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.hotels.HotelHermes.DataItem;
import com.example.hotels.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MyAdapterHotel extends RecyclerView.Adapter<MyAdapterHotel.ViewHolder>{

    Context context;
     List<DataItem> data_list;
    OnItemClickListener onClickListener;

    public MyAdapterHotel(Context context, OnItemClickListener listener, List<DataItem> list){
        this.context=context;
        this.onClickListener=listener;
        this.data_list=list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.single_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        DataItem object=data_list.get(position);

       // Toast.makeText(context,"IN single item",Toast.LENGTH_LONG).show();
        holder.hotel_name.setText(object.getCh());
        holder.hotel_location.setText(object.getHn());
        holder.hotel_price.setText(object.getOpr()+"");
        holder.hotel_rating.setText(object.getGr()+"/5");
        String image_url=object.getT();

        Picasso.get().load(image_url).resize(600,600).into(holder.hotel_image, new Callback() {
            @Override
            public void onSuccess() {
                Log.d("PicassoCast: ","success");
            }

            @Override
            public void onError(Exception e) {
                Log.d("PicassoCast: ",e.getMessage());
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickListener.onItemclick(holder.getAdapterPosition());
            }
        });
//xml se nhu, java se comment out kro han wait kr rhi hu
    }

    @Override
    public int getItemCount() {
        return data_list.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView hotel_image;
        TextView hotel_name;
        TextView hotel_price;
        TextView hotel_location;
       TextView hotel_rating;
        View itemView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.itemView=itemView;

           hotel_image=itemView.findViewById(R.id.hotel_image);
           hotel_location=itemView.findViewById(R.id.hotel_location);
           hotel_name=itemView.findViewById(R.id.hotel_name);
           hotel_price=itemView.findViewById(R.id.hotel_price);
           hotel_rating=itemView.findViewById(R.id.rating);

        }
    }

    public interface OnItemClickListener{
        void onItemclick(int position);

        void onFavoriteClicked(int position);
        //void onFavoriteClicked(int position);
    }

}
