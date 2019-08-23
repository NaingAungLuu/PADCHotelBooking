package com.androboy.padchotelbooking.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androboy.padchotelbooking.R;
import com.androboy.padchotelbooking.views.holders.HotelItemViewHolder;

public class HotelListAdapter extends RecyclerView.Adapter {

    public static final int VT_FIRST = 0;
    public static final int VT_SECOND= 1;

    @Override
    public int getItemViewType(int position) {
        if(position == 0)
        {
            return VT_FIRST;
        }
        else
        {
            return VT_SECOND;
        }
    }

    public HotelListAdapter() {
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        int layoutId ;
        switch(i)
        {
            case VT_FIRST : layoutId = R.layout.hotels_recycler_items_1; break;
            case VT_SECOND : layoutId = R.layout.hotels_recycler_item; break;
            default: layoutId = R.layout.hotels_recycler_item;
        }

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(layoutId , viewGroup , false);

        return new HotelItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
