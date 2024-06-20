package com.example.digitall.UI.WaterManagement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.databinding.WatermanagmentFragmentBinding;

public class WaterManagmentFragment extends DialogFragment {
    WatermanagmentFragmentBinding watermanagmentFragmentBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        watermanagmentFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.watermanagment_fragment, container, false);
        View managementView = watermanagmentFragmentBinding.getRoot();
        return managementView;
    }
}
