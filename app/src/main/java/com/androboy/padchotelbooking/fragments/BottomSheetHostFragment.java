package com.androboy.padchotelbooking.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.chip.Chip;
import android.support.design.chip.ChipGroup;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.androboy.padchotelbooking.R;
import com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarChangeListener;
import com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar;

import org.w3c.dom.Text;

public class BottomSheetHostFragment extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.filter_bottomsheet_dialog , container , false);

        return view;
    }

    public BottomSheetHostFragment()
    {

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ChipGroup chpGroup = view.findViewById(R.id.chp_rating);
        chpGroup.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(ChipGroup chipGroup, int i) {
                Chip chip = chipGroup.findViewById(i);
                if(chip!= null)
                {
                    chip.setTextColor(Color.WHITE);
                    Toast.makeText(getContext(), "Chip Checked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CrystalRangeSeekbar rangeSeekbar = view.findViewById(R.id.sb_price_range);
        final TextView tvMin = view.findViewById(R.id.tv_min_price);
        final TextView tvMax = view.findViewById(R.id.tv_max_price);
        rangeSeekbar.setOnRangeSeekbarChangeListener(new OnRangeSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue, Number maxValue) {
                int min = minValue.intValue();
                int max = maxValue.intValue();
                tvMin.setText("$"+ minValue + " - $" + maxValue);
                tvMax.setText("Average - $" + ((min + max)/2));
            }
        });
    }
}
