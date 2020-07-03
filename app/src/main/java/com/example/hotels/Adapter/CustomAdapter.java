package com.example.hotels.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hotels.R;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> amenity_list;

    public CustomAdapter(Context context, ArrayList<String> amenity_list){
        this.context=context;
        this.amenity_list=amenity_list;

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    private static class ViewHolder {
        TextView amenity;
        ImageView image;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.list_view_single, parent, false);
            viewHolder.amenity = (TextView) convertView.findViewById(R.id.amenity);
            viewHolder.image = (ImageView) convertView.findViewById(R.id.tick);
            result=convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }
        viewHolder.amenity.setText(amenity_list.get(position));
        return convertView;
    }
}
