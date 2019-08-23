package com.androboy.padchotelbooking.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.chip.Chip;
import android.support.design.chip.ChipGroup;
import android.support.design.widget.BottomSheetDialog;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.androboy.padchotelbooking.R;
import com.androboy.padchotelbooking.activities.MainActivity;
import com.androboy.padchotelbooking.adapters.HotelListAdapter;
import com.androboy.padchotelbooking.adapters.TopSearchesListAdapter;

public class ExploreFragment extends Fragment {
    RecyclerView rvTopSearches;
    RecyclerView rvRecentSearches;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_explore , container , false);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //creating objects as recyclerviews
        rvTopSearches = view.findViewById(R.id.rv_top_searches);
        rvRecentSearches = view.findViewById(R.id.rv_recent_searches);

        rvTopSearches.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext() ,
                LinearLayoutManager.HORIZONTAL ,
                false));

        rvRecentSearches.setLayoutManager(new LinearLayoutManager(getContext() ,
                LinearLayoutManager.HORIZONTAL ,
                false));

        //Instantiate Adapters
        TopSearchesListAdapter topSearchesAdapter = new TopSearchesListAdapter();
        rvRecentSearches.setAdapter(topSearchesAdapter);
        rvTopSearches.setAdapter(topSearchesAdapter);

        //Creating an instantiation and setting onClickListener for the "Filters" Button
        Chip chpFilter = getView().findViewById(R.id.chp_filters);
        chpFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetHostFragment bottomSheetHostFragment = new BottomSheetHostFragment();
                bottomSheetHostFragment.show(getFragmentManager() , bottomSheetHostFragment.getTag());

            }
        });


    }
}
