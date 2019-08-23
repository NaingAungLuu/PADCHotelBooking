package com.androboy.padchotelbooking.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androboy.padchotelbooking.R;
import com.androboy.padchotelbooking.views.holders.HotelItemViewHolder;

public class TopSearchesListAdapter extends RecyclerView.Adapter {
    public TopSearchesListAdapter() {
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.hotels_recycler_item , viewGroup , false);
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
