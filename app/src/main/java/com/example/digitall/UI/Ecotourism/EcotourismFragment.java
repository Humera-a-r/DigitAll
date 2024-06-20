package com.example.digitall.UI.Ecotourism;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.databinding.EcotourismFragmentBinding;

public class EcotourismFragment extends DialogFragment {
    EcotourismFragmentBinding ecotourismFragmentBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ecotourismFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.ecotourism_fragment, container, false);
        View tourView = ecotourismFragmentBinding.getRoot();
        return tourView;
    }
}
