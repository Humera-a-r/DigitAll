package com.example.digitall.UI.AgriTech;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.databinding.FarmManagementFragmentBinding;

public class FarmManagementFragment extends DialogFragment {
    FarmManagementFragmentBinding farmManagementFragmentBinding;

    public static FarmManagementFragment newInstance() {
        return new FarmManagementFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        farmManagementFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.farm_management_fragment, container,false);
        View farmview = farmManagementFragmentBinding.getRoot();
        return farmview;
    }
}
