package com.androboy.padchotelbooking.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androboy.padchotelbooking.R;
import com.androboy.padchotelbooking.adapters.HotelListAdapter;
import com.androboy.padchotelbooking.adapters.TopSearchesListAdapter;

public class ExploreFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_explore , container , false);

        //creating objects as recyclerviews
        RecyclerView rvTopSearches = view.findViewById(R.id.rv_top_searches);
        RecyclerView rvRecentSearches = view.findViewById(R.id.rv_recent_searches);

        rvTopSearches.setLayoutManager(new LinearLayoutManager(getContext() ,
                                        LinearLayoutManager.HORIZONTAL ,
                                        false));

        rvRecentSearches.setLayoutManager(new LinearLayoutManager(getContext() ,
                                            LinearLayoutManager.HORIZONTAL ,
                                        false));

        //Instantiate Adapters
        TopSearchesListAdapter topSearchesAdapter = new TopSearchesListAdapter();
        rvRecentSearches.setAdapter(topSearchesAdapter);
        rvTopSearches.setAdapter(topSearchesAdapter);
        return view;
    }
}
