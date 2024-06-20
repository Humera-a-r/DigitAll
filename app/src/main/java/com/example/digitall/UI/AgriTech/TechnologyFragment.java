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
import com.example.digitall.databinding.TechnologyFragmentBinding;

public class TechnologyFragment  extends DialogFragment {
    TechnologyFragmentBinding technologyFragmentBinding;

    public static TechnologyFragment newInstance() { return new TechnologyFragment();
    }




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        technologyFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.technology_fragment, container,false);
        View techview = technologyFragmentBinding.getRoot();
        return techview;
    }



}
