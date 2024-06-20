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
import com.example.digitall.databinding.AdministrationFragmentBinding;
import com.example.digitall.databinding.TechnologyFragmentBinding;

public class AdministrationFragment extends DialogFragment {
    AdministrationFragmentBinding administrationFragmentBinding;

    public static AdministrationFragment newInstance() { return new AdministrationFragment();
    }




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        administrationFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.administration_fragment, container,false);
        View adminview = administrationFragmentBinding.getRoot();
        return adminview;
    }

}
